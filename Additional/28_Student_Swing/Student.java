import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class Student extends JFrame implements ActionListener {

    JLabel rollno=new JLabel("Roll No.:");
    JTextField tf1=new JTextField();

    JLabel name=new JLabel("Name:");
    JTextField tf2=new JTextField();

    JLabel mark=new JLabel("Marks");

    JLabel mark1=new JLabel("Mark1:");
    JTextField m1=new JTextField();

    JLabel  mark2=new JLabel("Mark2:");
    JTextField m2=new JTextField();

    JLabel mark3=new JLabel("Mark3:");
    JTextField m3=new JTextField();

    JButton Enter=new JButton("Enter");


    Student(){

        //Creating a Frame
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        rollno.setBounds(20,20,100,20);
        tf1.setBounds(20,40,100,20);

        name.setBounds(20,100,100,20);
        tf2.setBounds(20,120,100,20);

        mark.setBounds(20,140,100,20);

        mark1.setBounds(20,160,100,20);
        m1.setBounds(20,180,100,20);

        // Voter Information
        mark2.setBounds(20,200,100,20);
        m2.setBounds(20,220,100,20);

        mark3.setBounds(20,240,100,20);
        m3.setBounds(20,260,100,20);

        Enter.setBounds(30,300,80,30);
       


        add(rollno);
        add(tf1);
        add(name);
        add(tf2);
        
        add(mark);
        add(mark1);
        add(m1);
        add(mark2);
        add(m2);
        add(mark3);
        add(m3);

        add(Enter);

    }

    // Implementing Listner Method
    public void actionPerformed(ActionEvent e){
        String rollno;
        String name;
        String mark1;
        String mark2;
        String mark3;

        if(e.getSource()==Enter){
            rollno=tf1.getText();

            try{
                FileReader fr=new FileReader("Input.txt");
                BufferedReader br=new BufferedReader(fr);

                String line;
                while((line=br.readLine())!=null){

                    String arr[]=line.split(" ");
                    String str=String.valueOf(arr[0].charAt(7));
                    // Roll Number Found Out
                    if(str==rollno){

                        name=arr[1];

                        for(int i=2;i<=4;i++){

                            //Mark:int
                            String mark[]=arr[i].split(":");
                            mark1=mark[1];

                        }

                        
                        mark2=String.valueOf(arr[3].charAt(7));
                        mark3=String.valueOf(arr[0].charAt(7));


                        
                    }
                }


            }
            
        }

        

    }

    // Main Method
    public static void main(String[] args) {
        
        new Student();
    }
    
}
