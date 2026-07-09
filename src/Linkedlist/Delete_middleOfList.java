package Linkedlist;



public class Delete_middleOfList {

    public Node deleteMid(Node head) {
        Node fast=head;
        Node slow=head;
        Node prev=head;

        if(head==null || head.next==null) return null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;

    }

}
