/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null, curr=head, next=null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        
        Node rest = reverseList(head.next);
        head.next.next=head;
        head.next = null;
        return rest;
    }
}