//program which will generate two threads:

//To display Fibonacci series up to 'n'. (Value of 'n' is input by the user)

//To display below pattern up to 'h' levels.
//        *
//       * *
//      * * * 

//The two processes should occur mutually exclusive of each other.


import java.util.Scanner;

class Pattern{

    // Function to create Fibonacci Sequence Triangle
    public static void printFibonacci(int arr[],int n){
        System.out.print("Fibonacci Sequeunce: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    // Function to Print Full Pyramid
    public static void printPattern(int row){
        System.out.println("Full Pyramid Pattern");
        for(int i=1;i<=row;i++){
            for(int space=1;space<=row-i;space++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // Function to Find the Fibonacci Sequence
    public static void fibonacciSequence(int a[],int n){

        a[1]=1;
        a[2]=1;
        for(int i=3;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
    }

     // Main Method
     public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        // Array for Fibonacci sequence 
        int arr[]=new int[100];
        // Array for pyramid
        int tri[]=new int[1];

        System.out.print("Enter n: ");
        int n=read.nextInt();

        fibonacciSequence(arr, n);
        printFibonacci(arr, n);
       
        printPattern(n);



    }


}



