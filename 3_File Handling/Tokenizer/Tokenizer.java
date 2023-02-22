//program that reads a line of integers, and then displays each integer, and the 
//sum of all the integers

// StringTokenizer object is created
// hasMoreTokens() are used to check whether a StringTokenizer Object has more tokens Available
// nextToken() is used to return the next Token in the StringTokenizer Object

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

    // Main Method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        // Reading the Digits
        String Numbers;
        System.out.print("Enter the Digits: ");
        Numbers=read.nextLine();

        // Creating a StringTokenizer Object with space as the seperator between Tokens
        StringTokenizer st=new StringTokenizer(Numbers," ");

        int sum=0;
        // Traversing the String Numbers
        while(st.hasMoreTokens()){

            // Converting nextToken into int data type;
            int digit = Integer.parseInt(st.nextToken());

            // Calculating the Sum
            sum = sum+digit;

            // Printing the Digits
            System.out.println(digit);
        }

        System.out.println("Sum = "+sum);
    }
}
