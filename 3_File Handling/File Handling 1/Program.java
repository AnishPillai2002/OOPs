// Writing and Reading into File using character Stream

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Program {
    public static void main(String[] args) {
        
        try{
            FileWriter fw=new FileWriter("Anish.txt");
            FileReader fr=new FileReader("Anish.txt");
        
            String content="Yo Soy Anish";

            // Writing into the File
            fw.write(content);

            System.out.println("Content Written into the File");

            fw.close();

            // Reading From the File
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        catch(IOException e){
            System.out.println("IO Exception");
        }
    }
}
