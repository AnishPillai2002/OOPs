import java.util.Scanner;
import java.util.StringTokenizer;

public class Palindrome {

    //Function to check Palindrome
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

    // Function to replace Palindrome with **
    public static void replace(String str){

        int len=str.length();
        for(int i=0;i<len;i++){
            System.out.print("*");
        }
    }

    // Main Method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter the Sentence: ");
        String sentence=read.nextLine();

        // Creating StringTokenizer
       StringTokenizer st= new StringTokenizer(sentence," ");

       // Replacing Palindrome

       System.out.print("Result: ");
        while(st.hasMoreTokens()){
            String Token=st.nextToken();

            // Checking if the Token is Palindrome or Not
            if(isPalindrome(Token)){
                // Replacing Palindrome with star
                int len=Token.length();
                for(int i=0;i<len;i++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print(Token);
            }
            System.out.print(" ");    
        }
        System.out.println();
    }   
}
