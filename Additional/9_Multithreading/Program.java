// Write a Java program to create two threads: One for displaying all odd number between 1 
// and 100 and second thread for displaying all even numbers between 1 and 100


// Thread for Displaying Odd Numbers
class Thread1 extends Thread{
    public void run(){
        System.out.print("Odd Numbers: ");
        for(int i=2;i<100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                
                try{
                    Thread.sleep(300);
                }
                catch(InterruptedException e){

                }
            }
        }
    }
}

// Thread for Displaying Even Numbers
class Thread2 extends Thread{
    public void run(){
        System.out.print("Even Numbers: ");
        for(int i=2;i<100;i++){
            if(i%2==0){
                System.out.print(i+" ");
                
                try{
                    Thread.sleep(300);
                }
                catch(InterruptedException e){

                }
            }
        }
    }
}


public class Program {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        
        
        t1.start();
        

        // Wait for the Thread1
        try{
            t1.join();
            System.out.println();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        // Starting Thread2
        t2.start();

        
    }    
}



// Additional Information

/*

InterruptedException is a checked exception in Java that is 
thrown when a thread is waiting, sleeping, or otherwise blocked,
and another thread interrupts it using the interrupt() method.

For example, if a thread is waiting on a lock using the wait() method, 
and another thread interrupts it using the interrupt() method, 
the waiting thread will throw an InterruptedException.

Similarly, if a thread is sleeping using the Thread.sleep() method, 
and another thread interrupts it using the interrupt() method, 
the sleeping thread will also throw an InterruptedException.


 */
