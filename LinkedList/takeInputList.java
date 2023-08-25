package LinkedList;

import java.util.Scanner;

public class takeInputList {

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
        Node  <Integer>head=takeInput();
        print(head);
    }
}
