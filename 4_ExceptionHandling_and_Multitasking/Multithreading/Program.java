// program that implements a multi-threaded program which has three threads. 
//First thread generates a random integer every 1 second. 
//If the value is even, second thread computes the square of the number and prints.
// If the value is odd the third thread will print the value of cube of the number.

import java.util.Random;




class Thread1 extends Thread{


    @Override
    public void run() {
        Random r=new Random();
        

        // sleep method block Thread1 for 1 sec

        try {
            //Creating 20 random Numbers between 0 and 100
            for(int i=0;i<20;i++){
                int num=r.nextInt(100);
                System.out.print(i+1+" ");
                // If the Number is Even running Thread2
                if(num%2==0){

                    new Thread2(num).run();;
                }
                // If the Number is Odd running Thread3
                else{
                    new Thread3(num).run();
                }
                sleep(1000);  // Waiting 1 second
            }
            
        } catch (Exception e) {
            
        }
    }
}

class Thread2 extends Thread{
    int num;
    // Defining Constructor of Thread2
    Thread2(int num){
        this.num=num;
    }

    // Printing the Square of a Number
    @Override
    public void run() {
        int result=num*num;
        System.out.println("Square of "+num+" = "+result);
    }
}

class Thread3 extends Thread{

    int num;

    // Defining Constructor of Thread3
    Thread3(int num){
        this.num=num;
    }

    // Printing the Cube of a Number
    public void run(){
        int result=num*num*num;
        System.out.println("Cube of "+num+" = "+result);
    }
}


public class Program {
    public static void main(String[] args) {
        
        Thread1 t1= new Thread1();
        t1.start();
    }
    
}
