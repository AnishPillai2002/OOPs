import java.util.Scanner;

import javax.print.event.PrintEvent;

//program that implements Quick sort algorithm for sorting a list of names in 
// ascending order. 


class Quicksort{

    // Function to fing the Partition
    static int partition(String arr[],int low,int high){

        int i=low-1;
        int j=low;
        String pivot=arr[high];

        while(j<high){

            String name=arr[j]; 

            // if name<pivot in lexographical order
            if(name.compareToIgnoreCase(pivot)<0){
                i++;
                // Swaping the strings in the array
                String temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            j++;
        }

        String temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;   // Partitioning Index
    }


    // Function to do Quicksort
    static void quickSort(String arr[],int low,int high){

        //arr=array of strings
        // low = least index of the array
        // high = highest index of the array 

        if(low<high){

            int p= partition(arr,low,high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    // Driver Method
    public static void main(String[] args) {
        
        // String Array for Storing Names
        String arr[]=new String[20];


        Scanner read=new Scanner(System.in);
        System.out.print("Enter the Total Number of Names: ");
        int total=read.nextInt();
        read.nextLine();

        System.out.println("Enter the Names");
        for(int i=0;i<total;i++){
            arr[i]=read.nextLine();
        }

        // Quicksort
        quickSort(arr,0,total-1);

        // Printing Sorted List of Names
        System.out.print("Sorted Names: ");
        for(int i=0;i<total;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }


}