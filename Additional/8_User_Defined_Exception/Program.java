//Write a Java program that shows how to create a user-defined exception. 




import java.util.Scanner;


// custom exception class
class Myexception extends Exception{

    // Defining the constructor
    Myexception(String Msg){
        super(Msg);
    }
}


public class Program {

    // Method that throws Myexception
    static void Validate(int age)throws Myexception{

        if(age<18){
            // Throwing Myexception object explicitly
            throw new Myexception("Not Eligible to Vote");
        }
        else{
            System.out.println("Eligible for Voting");
        }
    }

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age=read.nextInt();

        try{
            Validate(age);
        }
        catch(Myexception e){
            System.out.println(e.getMessage());
        }
        finally{
            read.close();
        }
    }
    
}
