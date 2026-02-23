/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int curlevel=0;
        while(!q.isEmpty()){
            res.add(new ArrayList<>());
            int len = q.size();
            for(int i=0;i<len;i++){
                Node n = q.poll();
                res.get(curlevel).add(n.data);
                if(n.left!=null){
                    q.offer(n.left);
                }
                if(n.right!=null){
                    q.offer(n.right);
                }
            }
            curlevel++;
        }
        // levelOrderRec(root,0,res);
        return res;
    }
    private void levelOrderRec(Node root, int level, ArrayList<ArrayList<Integer>> res){
        if(root==null) return;
        if(res.size()<=level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.data);
        levelOrderRec(root.left,level+1,res);
        levelOrderRec(root.right,level+1,res);
    }
}