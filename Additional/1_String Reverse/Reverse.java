// Program to reverse an given string. 

import java.util.Scanner;

class Reverse{

    // Main Method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        String str,rstr="";
        System.out.print("Enter the String: ");
        str=read.nextLine();
        
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rstr=rstr+str.charAt(i);
        }
        System.out.println("Reverse: "+rstr);
    }
}