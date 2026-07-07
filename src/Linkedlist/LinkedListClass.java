package Linkedlist;

class Node{
    int val;
    Node next;

    Node(int val) {this.val=val;}
}
class LinkedList{
    Node head=null;
    Node tail=null;

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }

    void addAtTail(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
    }
}
public class LinkedListClass {
    static void main(String[] args) {

    }
}
