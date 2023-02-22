//program that shows the usage of try, catch, throws and finally

import java.util.Scanner;

class Program{

    static void Divide(int a,int b) throws ArithmeticException{

        if(b==0){
            throw new ArithmeticException("Division by 0 Not Possible!");
        }
        else{
            int result=a/b;
            System.out.println("Result: "+result);
        }
    }

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        
        int a,b;
        System.out.println("Enter Number 1: ");
        a=read.nextInt();

        System.out.println("Enter Number 2: ");
        b=read.nextInt();

        // Using try block to execute code that can throw an Arithemetic Exception
        try{
            Divide(a, b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program Executed");
            read.close();
        }
    }
}