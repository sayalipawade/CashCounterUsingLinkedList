package BankingSystem;
public class LinkedList
{
    class Node                                    //creating Node in linked list
    {
        int item;
        Node next;
        Node(int item)
        {
            this.item=item;
            next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addAtLast(int item)               //inserting node at last position in linked list
    {
        Node newNode=new Node(item);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        Node currentNode=head;
        while(currentNode.next!=null)
        {
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }
    public void deleteAtStart()                 //deleting node at first position in linked list
    {
        if(head==null)
        {
            return;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void display()                       //Displaying linked list
    {
        Node currentNode=head;
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        while(currentNode!=null)
        {
            System.out.println(currentNode.item+"");
            currentNode=currentNode.next;
        }
    }
}
