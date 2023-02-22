// program that implements the binary search algorithm. 
// Sorted array is required for a binary search

import java.util.Scanner;

public class BinarySearch {

    // Function to do Binary Search
    static void binarySearch(int arr[],int total,int key){

        // arr[]=array of numbers
        // total=total numbers in the arr[]
        // key= number to search in arr[]

        int low=0;
        int high=total-1;

        while(low<high){
            
            int mid=(low+high)/2;

            if(arr[mid]==key){
                System.out.println("Element Found at Index: "+mid);
                return;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Element Not Found in the Array");
    }

    // Function to Print the Array
    static void printArray(int arr[],int total){
        for ( int i=0;i<total;i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }



    //Main method
    public static void main(String[] args) {
        
        // array to store Numbers
        int arr[]=new int[10];

        // Scanner object creation
        Scanner read =new Scanner(System.in);

        System.out.print("Enter the Total Numbers:");
        int total=read.nextInt();

        System.out.println("Enter the Numbers: ");
        for(int i=0;i<total;i++){
            arr[i]=read.nextInt();
        }

        System.out.print("The Array is : ");
        printArray(arr, total);

        System.out.print("Enter the Key to Find: ");
        int key=read.nextInt();

        binarySearch(arr, total, key);

    }
}
