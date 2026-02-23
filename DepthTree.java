/*
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        // if(root==null) return -1;
        // int lh = height(root.left);
        // int rh = height(root.right);
        // return Math.max(lh,rh)+1;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int curr = -1;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0;i<len;i++){
                Node n = q.poll();
                if(n.left!=null)q.offer(n.left);
                if(n.right!=null)q.offer(n.right);
            }
            curr++;
        }
        return curr;
    }
}