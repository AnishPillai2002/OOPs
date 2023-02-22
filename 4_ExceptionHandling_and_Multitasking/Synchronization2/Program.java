//Java program that shows thread synchronization. 


class Display{
    // Synchtronized method
    synchronized public void print(String msg){

        System.out.print("[");
        try{
            Thread.sleep(500);
            System.out.print(msg);
            Thread.sleep(500);

        }
        catch(Exception e){

        }
        finally{
            System.out.println("]");
        }
    }
}

// Thread
class Thread1 extends Thread{

    Display d;
    String msg;

    // Defining the Constructor
    Thread1(Display d,String msg){
        this.d=d;
        this.msg=msg;
    }

    // Defining the run method
    public void run(){
        d.print(msg);
    }
}

class Thread2 extends Thread{

    Display d;
    String msg;

    // Defining the Constructor
    Thread2(Display d,String msg){
        this.d=d;
        this.msg=msg;
    }

    // Defining the run method
    public void run(){
        d.print(msg);
    }
}




public class Program {
    public static void main(String[] args) {
        
        Display d=new Display();

        Thread1 t1=new Thread1(d,"Hello");
        Thread2 t2=new Thread2(d,"World");

        t1.start();
        t2.start();
    }
    
}
