import java.util.Scanner;

// Program to find all palindrome sub string in a given string


public class Palindrome {
    

    // Function to check if Palindrome or Not
    public static boolean isPalindrome(String str){

        String rstr="";
        for(int i=str.length()-1;i>=0;i--){
            rstr=rstr+str.charAt(i);
        }
        if(rstr.equals(str)){
            return true;
        }
        else{
            return false;
        }

    }

    // Function to print all Palindrome sub-array
    public static void Solution(String str){

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){

                // Creating substring from index i to j-1
                String ss=str.substring(i, j);

                // Checking if the sub string is a Palindrome with atleast 2 elements
                if(isPalindrome(ss) && ss.length()>1){
                    System.out.println(ss);
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=read.nextLine();

        Solution(str);


    }
}
