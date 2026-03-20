/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        Node pre = null;
        Node suc = null;
        Node curr = root;
        while(curr!=null){
            if(curr.data == key){
                if(curr.left != null){
                    Node temp = curr.left;
                    while(temp.right!=null){
                        temp = temp.right;
                    }
                    pre = temp;
                }
                if(curr.right != null){
                    Node temp = curr.right;
                    while(temp.left!=null){
                        temp = temp.left;
                    }
                    suc = temp;
                }
                break;
            }
            else if(key < curr.data){
                suc = curr;
                curr = curr.left;
            }else{
                pre = curr;
                curr = curr.right;
            }
        }
        ArrayList<Node> arr = new ArrayList<>();
        arr.add(pre);
        arr.add(suc);
        return arr;
    }
}