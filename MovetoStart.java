/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        Node prev=null, curr=head;
        while(curr.next!=null){
            prev=curr;
            curr = curr.next;
        }
        curr.next = head;
        prev.next = null;
        return curr;
    }
}
