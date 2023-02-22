import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.WildcardType;

// Writing and Reading file using Byte Stream


public class Program {
    
    // Main Method
    public static void main(String[] args) {
        
        try{
            FileOutputStream fout=new FileOutputStream("A.txt");
            FileInputStream fin=new FileInputStream("A.txt");

            String content="Yo Soy Anish, Yo Hablas Espanol";

            // Converting String to Byte array
            byte array[]=content.getBytes();

            // Writing into the FILE
            fout.write(array);

            System.out.println("Content Written into the File");

            // Reading the File
            int i;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }

        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
