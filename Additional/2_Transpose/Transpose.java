// Program to display the transpose of a given matrix. 


import java.util.Scanner;
public class Transpose {

    // Method to read a Matrix
    static void readMatrix(int A[][],int r,int c){

        Scanner read=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=read.nextInt();
            }
        }
    }

    // Method to find the Transpose
    static void findTranspose(int A[][],int r,int c,int T[][]){
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                T[j][i]=A[i][j];
            }
        }
    }

    // Method to print a Matrix
    static void printMatrix(int A[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }    
        
    }

    //Main Methhod
    public static void main(String[] args) {
        
        // Creating Matrix 
        int A[][]=new int[10][10];
        int T[][]=new int[10][10];

        Scanner read=new Scanner(System.in);


        // Reading the Matrix
        int col;int row;
        System.out.print("Enter the No. of Rows: ");
        row=read.nextInt();

        System.out.print("Enter the No. of Cols: ");
        col=read.nextInt();
        System.out.println("Enter the Matrix: ");
        readMatrix(A, row, col);


        // Finding Transpose
        findTranspose(A, row, col, T);

        System.out.println("The Transpose: ");

        // Printing the Transpose
        printMatrix(T, col, row);


    }
    
}
