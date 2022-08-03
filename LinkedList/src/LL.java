public class LL {
    public static Node head;
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            //node.next=head;
            head = node;
        }
    }
    public void addLast(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node currNode=head;
            while(currNode.next!=null)
            {
                currNode=currNode.next;
            }
            currNode.next=node;
        }
    }
    public static void printList()
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
    public static void main(String[] args)
    {
        LL ll=new LL();
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addLast(11);
        printList();
    }
}

