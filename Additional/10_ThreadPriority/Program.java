//Program shows thread priorities


// Thread1
class Thread1 extends Thread{

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException E){

            }
        }
    }
}

//Thread 2
class Thread2 extends Thread{
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException E){

            }
        }
    }
}


public class Program {

    // Main Method
    public static void main(String[] args) {

        //creating thread
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        // Getting thread Priority (Default Thread Priority:5)
        System.out.println("Current Thread1 Priority: "+t1.getPriority());
        System.out.println("Current Thread2 Priority: "+t2.getPriority());

        // Setting thread Priority
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(7);

        // Starting Threads
        t1.start();            // t1 has higher priority, hence it will get more CPU time than t2
        
        
        // To execute t2 after t1
        try{
            t1.join();
            System.out.println();
            
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        t2.start();
        
        // To execute main thread after t2
        try{
            t2.join();
            System.out.println();
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        

        //Thread Priority After
        System.out.println("Thread1 Priority: "+t1.getPriority());
        System.out.println("Thread2 Priority: "+t2.getPriority());
    }   
}



/*
The setPriority() method allows you to set the priority of a thread to a specific value, 
which is an integer value between Thread.MIN_PRIORITY and Thread.MAX_PRIORITY.
A higher priority thread gets more CPU time than a lower priority thread, 
although the exact behavior depends on the underlying operating system and JVM implementation.
 */