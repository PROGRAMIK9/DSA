/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node prev = null, slow = head, fast = head;
        while(slow!=null && fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next== null) return;
        int length =0;
        fast = fast.next;
        while(fast!=slow){
            length++;
            fast=fast.next;
        }
        fast = head;
        slow=head;
        for(int i=0;i<length;i++){
            fast=fast.next;
        }
        while(fast.next!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        fast.next = null;
    }
}