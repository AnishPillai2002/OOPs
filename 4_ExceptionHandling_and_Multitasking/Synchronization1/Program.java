

class Table{

    // Synchronized method
    synchronized void printTable(int num){
        for (int i = 1; i <= 10; i++){

            int result=num*i;
            System.out.println(num+"*"+i+" = "+result);  
            try{
                Thread.sleep(500);
            }    
            catch(Exception e){

            }
        }
    }
}


class Thread1 extends Thread{
    Table t;
    int num;
    Thread1(Table t,int num){
        this.t=t;
        this.num=num;
    }

    public void run(){
        t.printTable(num);
    }
}

class Thread2 extends Thread{
    Table t;
    int num;
    Thread2(Table t,int num){
        this.t=t;
        this.num=num;
    }

    public void run(){
        t.printTable(num);
    }
}

class Program{
    public static void main(String[] args) {
        
        Table t=new Table();

        Thread1 t1=new Thread1(t,5);
        Thread2 t2=new Thread2(t, 2);

        t1.start();
        t2.start();
    }
}