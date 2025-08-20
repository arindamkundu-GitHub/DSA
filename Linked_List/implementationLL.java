package Linked_List;
class SLL {
    Node head;
    Node tail;
    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
public class implementationLL {
    public static void main(String[] args) {
        SLL ll=new SLL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(40);
        ll.insertAtEnd(60);

        
        ll.display();
    }
}
