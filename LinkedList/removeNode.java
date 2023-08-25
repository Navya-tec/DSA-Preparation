package LinkedList;

import java.util.Scanner;

public class removeNode {

    public static Node removeNodes(Node head) {

        if(head==null||head.next==null){
            return head;
        }

        Node node=head;
        Node small=removeNodes(head.next);

        Node temp=small;
        while(temp!=null){
            if((int)temp.data>(int)node.data){
                return small;
            }
            temp=temp.next;
        }
        head.next=small;
        return head;
    }

    public static Node  <Integer> takeInput()
    {
        Node  <Integer>head=null;
        Node  <Integer>tail=null;
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();

        while(data!=-1)
        {
            Node  <Integer>temp=new Node  (data);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                Node  <Integer>temp1=head;
                while(temp1.next!=null)
                {
                    temp1=temp1.next;
                }
                temp1.next=temp;

//				tail.next=temp;   //reduces time complexity
//				tail=temp;
//
            }
            data=s.nextInt();
        }
        return head;
    }

    public static void print(Node  <Integer>head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node head=takeInput();
        Node ans=removeNodes(head);
        print(ans);
    }
}
