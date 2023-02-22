//Java program to find the second smallest element in an array. 

// The best approach would be to sort the array and return the element at index 1

import java.util.Scanner;


public class Program {

    //Method to find the Second Smallest 
    static int secondSmallest(int A[],int total){

        int min=A[0];
        int smin=0;
        for(int i=1;i<total;i++){
            if(A[i]<min){
                smin=min;
                min=A[i];
            }
        }

        // If the first element is the smallest element then we have to 
        // use below code to find the second smallest element
        if(min==A[0]){
            smin=A[1];
            for(int i=2;i<total;i++){
                if(A[i]<smin){
                    smin=A[i];
                }
            }
        }

        return smin;
    }


    // Main method
    public static void main(String[] args) {
        
        Scanner read= new Scanner(System.in);

        // Creating an Array
        int A[]=new int[10];

        // Reading the Array
        System.out.println("Enter the Total no. of Elements: ");
        int total=read.nextInt();

        System.out.println("Enter the Elements: ");
        for(int i=0;i<total;i++){
            A[i]=read.nextInt();
        }

        // Finding second Smallest;
        int r=secondSmallest(A,total);
        System.out.print("The Array: ");
        for(int i=0;i<total;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();

        System.out.println("Second Smallest: "+r);



    }
    
}
