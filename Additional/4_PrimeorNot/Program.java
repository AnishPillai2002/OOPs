//

import java.util.Scanner;;

public class Program {

    // Method to check Prime/Not Prime
    static int isPrime(int num){

        if(num<2){
            return 0;
        }

        int prime=1;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                prime=0;
                break;
            }
        }
        return prime;
    }

    // Main method
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num=read.nextInt();

        if(isPrime(num)==1){
            System.out.println("Prime");

        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
