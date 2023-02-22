//Program to find the frequency of a given character in a string

import java.util.Scanner;


public class Frequeuncy {

    static int countFrequeuncy(String str,char ch){

        int length=str.length();
        int count=0;


        for(int i=0;i<length;i++){
            
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }

    // Main Method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=read.nextLine();
        System.out.print("Enter the Character: ");
        char ch=read.nextLine().charAt(0);      // reading a character

        int count=countFrequeuncy(str,ch);
        System.out.println("Frequeuncy: "+count);
    
    }
    
}
