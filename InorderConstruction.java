/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public void inRec(Node root, ArrayList<Integer> res){
        if(root == null) return ;
        inRec(root.left, res);
        res.add(root.data);
        inRec(root.right, res);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        // inRec(root,res);
        Node curr = root;
        while(curr!=null){
            if(curr.left==null){
                res.add(curr.data);
                curr=curr.right;
            }else{
                Node prev = curr.left;
                while(prev.right != null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right == null){
                    prev.right = curr;
                    curr=curr.left;
                }
                else{
                    prev.right = null;
                    res.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return res;
    }
}