package Linked_List;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class displayLink {
    public static void printRecursive(Node head){
        if(head==null) return;
        System.out.println(head.val);
        printRecursive(head.next);
    }
    public static void main(String[] args) {
        Node a=new Node(11);
        Node b=new Node(12);
        Node c=new Node(13);
        Node d=new Node(14);
        Node e=new Node(15);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
        printRecursive(a);
        
    }
}
