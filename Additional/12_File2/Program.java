import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
        
        try{

            FileReader fr=new FileReader("A.txt");
            BufferedReader br=new BufferedReader(fr);
            

            // Counting Lines,Words and characters
            int ch=0;
            int words=0;
            int lines=0;

            String line;
            
            
            while((line=br.readLine())!=null){
                lines++;

                ch=ch+line.length();

                // Converting Line into Array of Words
                String wordArray[]= line.split(" ");
                words=words+wordArray.length;

            }   

            // Results
            System.out.println("No. of Lines: "+lines);
            System.out.println("No. of Characters: "+ch);
            System.out.println("No. of Words: "+words);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
