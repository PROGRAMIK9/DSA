/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int minTime(Node root, int target) {
        // code here
        HashMap<Node, Node> parentMap = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node targetNode=new Node(target);
        while(!q.isEmpty()){
            Node curr = q.peek();
            q.remove();
            if(curr.data ==  target){
                targetNode = curr;
            }
            if(curr.left!=null){
                parentMap.put(curr.left, curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                parentMap.put(curr.right, curr);
                q.add(curr.right);
            }
        }
        HashMap<Node, Boolean> visited = new HashMap<>();
        Queue<Node> burn= new LinkedList<>();
        burn.add(targetNode);
        visited.put(targetNode, true);
        int time = 0;
        while(!burn.isEmpty()){
            int size = burn.size();
            boolean flag = false;
            while(size-->0){
                Node curr = burn.peek();
                burn.remove();
                if(curr.left!=null && !visited.containsKey(curr.left)){
                    visited.put(curr.left, true);
                    burn.add(curr.left);
                    flag = true;
                }
                 if(curr.right!=null && !visited.containsKey(curr.right)){
                    visited.put(curr.right, true);
                    burn.add(curr.right);
                    flag = true;
                }
                if(parentMap.containsKey(curr) && !visited.containsKey(parentMap.get(curr))){
                    visited.put(parentMap.get(curr),true);
                    burn.add(parentMap.get(curr));
                    flag = true;
                }
            }
            if(flag)time++;
        }
        return time;
    }
}