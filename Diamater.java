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
} */

class Solution {
    public int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public int diameter(Node root) {
        // code here
        if(root==null)return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        return Math.max(lh+rh,Math.max(ld,rd));
        
    }
}