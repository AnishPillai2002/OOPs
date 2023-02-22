// write a java program that takes a line of numbers seperated by space as input 
// and using StringTokenizer write odd numbers into Odd.txt and 
//even Numbers into Even.txt using File Writer.

// Create two threads Thread1 reads Odd.txt and Thread2 reads Even.txt,
// they write prime nums. into Prime.txt and even nums. into NonPrime.txt


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

// Class Containing Method to check Prime/ Non Prime
class Prime{

    // Function to Find whether a num is Prime/Non Prime
    public boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

//Creating Thread1 to read Odd.txt
class Thread1 extends Thread{
    Prime p;
    FileWriter fw1;
    FileWriter fw2;

    Thread1(Prime p,FileWriter fw1,FileWriter fw2){
        this.p=p;
        this.fw1=fw1;
        this.fw2=fw2;
    }

    // run method
    public void run(){
        try{
            FileReader fr=new FileReader("Odd.txt");
            BufferedReader br=new BufferedReader(fr);

            String line;
            while((line=br.readLine())!=null){
                String arr[]=line.split(" ");
                for(String i:arr){
                    int num=Integer.parseInt(i);
                    
                    if(p.isPrime(num)){
                        fw1.write(i+" ");
                    }
                    else{
                        fw2.write(i+" ");
                    }
                }
            }

            // Closing the FileReader and BufferedReader
            fr.close();
            br.close();

            // Writing all the data into the files
            fw1.flush();
            fw2.flush();    
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}



// Creating Thread2 to read Even.txt
class Thread2 extends Thread{

    Prime p;
    FileWriter fw1;
    FileWriter fw2;

    Thread2(Prime p,FileWriter fw1,FileWriter fw2){
        this.p=p;
        this.fw1=fw1;
        this.fw2=fw2;
    }

    // Run() method
    public void run(){

        try{
            FileReader fr=new FileReader("Even.txt");
            BufferedReader br=new BufferedReader(fr);

            String line;
            while((line=br.readLine())!=null){

                String arr[]=line.split(" ");

                for(String i:arr){
                    int num=Integer.parseInt(i);
                    if(p.isPrime(num)){
                        fw1.write(i+" ");

                    }
                    else{
                        fw2.write(i+" ");
                    }
                }
            }

            fr.close();
            br.close();

            // Writing all the data into the files
            fw1.flush();
            fw2.flush();     
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}






public class Program {
    // Main Method
    public static void main(String[] args) {
        
        try{
            // Reading the Numbers
            Scanner read=new Scanner(System.in);
            System.out.print("Enter the Numbers: ");
            String str=read.nextLine();

            // Creating String Tokenizer to get numbers
            StringTokenizer st=new StringTokenizer(str," ");
        
            // File Writer Object
            FileWriter fwe= new FileWriter("Even.txt");
            FileWriter fwo=new FileWriter("Odd.txt");

            while(st.hasMoreTokens()){
                String Token=st.nextToken();
                
                int num=Integer.parseInt(Token);
                
                if(num%2==0){
                    fwe.write(Token+" ");
                }
                else{
                    fwo.write(Token+" ");
                }
            }

            fwe.close();
            fwo.close();
            System.out.println("Odd Numbers Written into Odd.txt and Even Numbers written into Even.txt");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


        // Creating Thread

        try{
            FileWriter fw1=new FileWriter("Prime.txt");
            FileWriter fw2=new FileWriter("NonPrime.txt");

            Prime p=new Prime();

            // Creating Threads
            Thread1 t1=new Thread1(p,fw1,fw2);
            Thread2 t2=new Thread2(p,fw1,fw2);


            t1.start();
            try{
                // Waiting for Thread1 to complete execution
                t1.join();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            // Starting Thread2
            t2.start();    
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }    
    }   
}
