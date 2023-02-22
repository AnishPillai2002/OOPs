//program that reads a file and displays the file on the screen, with a line 
//number before each line.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        
        try{
            FileReader fr=new FileReader("A.txt");
            BufferedReader br=new BufferedReader(fr);

            String line;
            int linenum=0;

            // Reading the file till the end
            while((line=br.readLine())!=null){
                linenum++;
                System.out.println(linenum+" "+ line);

                // Thread method to give smooth display effect
                try{
                    Thread.sleep(300);
                }
                catch(InterruptedException e){

                }
            }

        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
