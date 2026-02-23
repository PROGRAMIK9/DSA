/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mirror(Node root) {
        // code here
        if(root == null) return;
        // mirror(root.left);
        // mirror(root.right);
        // Node temp = root.left;
        // root.left = root.right;
        // root.right = temp;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            Node temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
        }
    }
}