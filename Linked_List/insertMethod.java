package Linked_List;
class simple {
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
    void insertAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else {
            temp.next=head;
            head=temp;
        }
    }
    void insert(int idx,int val){
        Node temp=new Node(val);
        Node x=head;
        for(int i=0;i<=idx-1;i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class insertMethod {

    public static void main(String[] args) {
        simple link=new simple();
        link.insertAtEnd(10);
        link.insertAtEnd(40);
        link.insertAtEnd(60);
        link.display();
        link.insertAtHead(2);
        link.insertAtHead(5);
        link.display();
        link.insert(3,6);
        link.display();
    }
}
