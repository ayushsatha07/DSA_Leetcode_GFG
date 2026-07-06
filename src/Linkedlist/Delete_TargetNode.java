package Linkedlist;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class Delete_TargetNode {

    public void deleteNode(ListNode node) {

        node.val=node.next.val;   //Main Operations---->  Save value of Next Node
        node.next=node.next.next;  //------------------>  connect current node to next of next Node
    }
}
