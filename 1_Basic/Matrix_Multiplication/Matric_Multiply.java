import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Matric_Multiply {

    // static method to read the Matrix
    static void readMatrix(int Matrix[][],int m,int n){
        Scanner read=new Scanner(System.in);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Matrix[i][j]=read.nextInt();
            }
        }
    }

    // static function to display the matrix
    static void displayMatrix(int Matrix[][],int m,int n){

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // static method to Multiply 2 matrices
    static void multiplyMatrix(int A[][],int r1,int c1,int B[][],int r2,int c2,int C[][]){

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

                C[i][j]=0;
                for(int k=0;k<r2;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        int r1,r2,c1,c2,r3,c3;
        int A[][]=new int[10][10];
        int B[][]=new int[10][10];
        int C[][]=new int[10][10];

        System.out.print("Enter the No. of Rows in Matrix 1: ");
        r1=read.nextInt();
        read.nextLine();
        System.out.print("Enter the No. of Columns in Matrix 1: ");
        c1=read.nextInt();
        read.nextLine();

        System.out.print("Enter the No. of Rows in Matrix 2: ");
        r2=read.nextInt();
        read.nextLine();

        System.out.print("Enter the No. of Columns in Matrix 2: ");
        c2=read.nextInt();
        read.nextLine();


        if(c1!=r2){
            System.out.println("Multiplication Not Possible!");
            return;
        }

        r3=r1;
        c3=c2;

        System.out.println("Matrix 1 ");
        readMatrix(A, r1, c1);
        System.out.println();
        System.out.println("Matrix 2");
        readMatrix(B, r2, c2);

        System.out.println("Result Matrix");
        multiplyMatrix(A, r1, c1, B, r2, c2, C);
        displayMatrix(C, r3, c3);
    }
    
}
