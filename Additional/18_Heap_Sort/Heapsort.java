//program to implement Heap sort algorithm using array

public class Heapsort {

    // Function to Swap memebers of array
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;   
    }

    // Heapify Function
    static void Heapify(int arr[],int n,int i){

        int leftchild=2*i+1;
        int rightchild=2*i+2;
        int largest=i;

        if(leftchild<n && arr[leftchild]>arr[largest]){
            largest=leftchild;
        }
        
        if(rightchild<n && arr[rightchild]>arr[largest]){
            largest=rightchild;
        }

        if(largest!=i){
            swap(arr,i,largest);
            Heapify(arr, n, largest);
        }
    }

    // Recursive Heap Sort Function
    static void heapSort(int arr[],int n){

        // Building a Max Heap
        for(int i=n/2-1;i>=0;i--){
            Heapify(arr, n, i);
        }

        // Sorting
        for(int i=n-1;i>=0;i--){
            swap(arr,i,0);
            Heapify(arr, i, 0);
        }
    }

    // Main Method
    public static void main(String[] args) {
        
        int arr[]={1,3,5,6,2,4,5};
        heapSort(arr,7);

        System.out.print("Sorted Array: ");
        for(int i=0;i<7;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
