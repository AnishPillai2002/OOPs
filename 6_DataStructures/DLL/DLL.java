import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import javax.swing.SpinnerDateModel;

// Defining Node
class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
    }
}

public class DLL {

    

    

    // Creating head node
    static Node head=null;
    static Node rear=null;


    // Function to Insert at Front
    static void InsertFront(int data){

        //creating newnode
        Node newnode=new Node(data);
        newnode.next=null;
        newnode.prev=null;
        
        if(head==null){
            head=newnode;
            rear=newnode;
        }
        else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }
    
    // Function to Insert at End
    static void InsertRear(int data){

        //creating newnode
        Node newnode=new Node(data);
        newnode.next=null;
        newnode.prev=null;

        if(head==null){
            head=newnode;
            rear=newnode;
            
        }
        else{
            newnode.prev=rear;
            rear.next=newnode;
            rear=newnode;
        }
    }

    // Function to Delete From Front
    static void deleteFront(){

        if(head==null){
            System.out.println("DLL is Empty!");
            rear=null;
        }
        else{
            int element=head.data;
            head=head.next;
            head.prev=null;
            System.out.println(element+ " removed");
        }
    }

    // Function to Delete From Rear
    static void deleteRear(){
        if(rear==null){
            System.out.println("DLL is Empty!");
            head=null;
        }
        else{
            int element=rear.data;
            rear=rear.prev;
            rear.next=null;
            System.out.println(element+ " removed");
        }
    }

    // Function to Insert at a Position
    static void InsertAt(int pos,int data){

        //creating newnode
        Node newnode=new Node(data);
        newnode.next=null;
        newnode.prev=null;

        if(pos==0){
            
            if(head==null){
                head=newnode;
                rear=newnode;
            }
            else{
                newnode.next=head;
                head.prev=newnode;
                head=newnode;
            }
        }
        else{

            
            Node ptr=head;
            int i=0;
            while(i!=pos-1){
                ptr=ptr.next;
            }

            newnode.prev=ptr;
            newnode.next=ptr.next;
            (ptr.next).prev=newnode;
            ptr.next=newnode;
        }

        System.out.println("Data Inserted");

    }

    //Function to Display DLL
    static void Display(){

        Node ptr=head;
        System.out.println("DLL: ");
        while(ptr!=null){
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.println();
    }



    // Main method
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int op,data;
        boolean c=true;

        System.out.println("+-----------------------+");
        System.out.println("| 1: Insert Front       |");
        System.out.println("| 2: Insert Rear        |");
        System.out.println("| 3: Delete Front       |");
        System.out.println("| 4: Delete Rear        |");
        System.out.println("| 5: Display            |");
        System.out.println("| 6: Insert At          |");
        System.out.println("| 7: Exit               |");
        System.out.println("+-----------------------+");

        while(c){
            System.out.print("Enter Option: ");
            op=read.nextInt();

            switch(op){
                case 1:
                    System.out.print("Enter Data: ");
                    data=read.nextInt();
                    InsertFront(data);
                    break;

                case 2: 
                    System.out.print("Enter Data: ");
                    data=read.nextInt();
                    InsertRear(data);
                    break;
                
                case 3:
                    deleteFront();
                    break;

                case 4:
                    deleteRear();
                    break;

                case 5:
                    Display();
                    break;
                
                case 6:
                    System.out.print("Enter Date: ");
                    data=read.nextInt();
                    System.out.print("Enter Position:");
                    int pos=read.nextInt(); 

                    InsertAt(pos, data);


                case 7:
                    c=false;
                    break;

                default : 
                    System.out.println("Select a Valid Option");
                    break;
                    
            }

        }
    }
}
