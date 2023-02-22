// Program to find the frequency of numbers in an Array

import java.util.HashMap;

public class Frequency {

    // Main Method
    public static void main(String[] args) {
        
        // Array of Numbers
        int arr[]={1,2,3,1,5,6,4,3,1,2,3,5};

        // Creating a Hash Map
        HashMap<Integer,Integer> map=new HashMap<>();

        // Creating key value pairs (value= frequency of a number)
        for(int i:arr){
            if(map.containsKey(i)){
                int count=map.get(i);
                map.put(i,count+1);
            }
            else{
                map.put(i,1);
            }
        }

        for(int i:map.keySet()){
            System.out.println("Frequency of "+i+" : "+map.get(i));
        }

    }
    
}
