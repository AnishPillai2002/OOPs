// Reading and copying fromone file to another 

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Program {
    public static void main(String[] args) {
        
        try{
            FileInputStream fin=new FileInputStream("Anish.txt");
            FileOutputStream fout = new FileOutputStream("Copy.txt");


            // Reading Anish.txt and copying it into Copy.txt
            int i;
            while((i=fin.read())!=-1){
                fout.write(i);
            }

            System.out.println("Content Copied");

            fin.close();
            fout.close();

        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        catch(IOException e){
            System.out.println("IO Exception!");

        }
    }
}
