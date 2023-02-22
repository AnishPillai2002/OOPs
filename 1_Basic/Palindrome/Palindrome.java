//Java program that checks whether a given string is a palindrome or not

import java.util.Scanner;


class Palindrome{

    // Function to Reverse the String and check whether palindrome or not
    static int isPalindrome(String str){

        int length=str.length();
        int i=length-1;

        // Reverse string is Empty
        String rstr="";

        while(i>=0){
            rstr=rstr+str.charAt(i);
            i--;
        }

        // we use equalsIgnoreCae to avoid case sensitivity 
        if(rstr.equalsIgnoreCase(str)){
            return 1;
        }
        else{
            return 0;
        }
    }

    // Main Method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.print("Enter the Sting: ");
        String str=read.nextLine();

        int result=isPalindrome(str);

        if(result==1){
            System.out.println("The String is a Palindrome");
        }
        else{
            System.out.println("The String is Not a Palindrome");
        }
    }
}