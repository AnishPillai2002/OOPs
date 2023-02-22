
//Write a Java program that works as a simple calculator. Arrange Buttons for digits and 
//the + - * % operations properly. Add a text field to display the result. 
//Handle any possible exceptions like divide by zero. Use Java Swing. **

import javax.swing.*;
import java.awt.event.*;
import java.util.StringTokenizer;
import java.awt.*;


// Calculator class Should Implement Actionlistner
public class Calculator implements ActionListener{

    JFrame frame;
    JPanel panel;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,equal,clr;

    JTextField tf;


    Calculator(){

        // Creating Frame
        frame=new JFrame("Calculator");
        frame.setSize(420,550);
        frame.setLayout(null);             // Removing Default Layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        

        // Creating TextField and adding it into JFrame
        tf=new JTextField("");
        tf.setBounds(50,25,300,50);
        tf.setEditable(false);
        frame.add(tf);

        // Creating Panel   
        panel=new JPanel();
        //Setting Grid Layout for Panel
        panel.setLayout(new GridLayout(4,4,1,1)); 
      

        // Creating Buttons
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");

        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");

        clr=new JButton("CLEAR");
        equal=new JButton("=");


        // Adding the buttons to the panel
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(add);

        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(sub);

        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(mul);
        
        panel.add(b0);
        panel.add(clr);
        panel.add(equal);
        panel.add(div);
        

        // Setting bounds of Panel
        panel.setBounds(50,115,300,300);
        frame.add(panel);

        // setVisible() has to be made true at the end
        frame.setVisible(true);
    
    
        // Adding ActionListner
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
        equal.addActionListener(this);
        clr.addActionListener(this);    
    }

    // Implementing the actionPerformed() Method
    public void actionPerformed(ActionEvent e){

        String str;
        
        if(e.getSource()==b1){
            // Changing the Text inside the TextField
            str=tf.getText().concat("1");
            tf.setText(str);
        }

        if(e.getSource()==b2){
            str=tf.getText().concat("2");
            tf.setText(str);

        }

        if(e.getSource()==b3){
            str=tf.getText().concat("3");
            tf.setText(str);

        }

        if(e.getSource()==b4){
            str=tf.getText().concat("4");
            tf.setText(str);

        }

        if(e.getSource()==b5){
            str=tf.getText().concat("5");
            tf.setText(str);

        }

        if(e.getSource()==b6){
            str=tf.getText().concat("6");
            tf.setText(str);

        }

        if(e.getSource()==b7){
            str=tf.getText().concat("7");
            tf.setText(str);

        }

        if(e.getSource()==b8){
            str=tf.getText().concat("8");
            tf.setText(str);

        }

        if(e.getSource()==b9){
            str=tf.getText().concat("9");
            tf.setText(str);

        }

        if(e.getSource()==b0){
            str=tf.getText().concat("0");
            tf.setText(str);

        }

        // If user click +
        if(e.getSource()==add){
            // Checking condition where + should not be entered into tf
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" + ");
                tf.setText(str);
            }       
        }

        // If user click -
        if(e.getSource()==sub){
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" - ");
                tf.setText(str);
            }
        }

        // If the user click /
        if(e.getSource()==div){
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" / ");
                tf.setText(str);
            }

        }

        // If the user click *
        if(e.getSource()==mul){
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" * ");
                tf.setText(str);
            }
        }

        // If the user wants to clear the tf
        if(e.getSource()==clr){
            str="";
            tf.setText(str);
        }

        if(e.getSource()==equal){
            // We will use String Tokenizer to split the string into operators and operands

            try{
                str=tf.getText();
                StringTokenizer st=new StringTokenizer(str," ");
                double result=0;

                int firstToken=1;

                while(st.hasMoreTokens()){

                    if(firstToken==1){
                        
                        // Operators and Operands
                        Double x= Double.parseDouble(st.nextToken());
                        String op=st.nextToken();
                        Double y=Double.parseDouble(st.nextToken());

                        switch(op){
                            case "+":
                                result=x+y;
                                break;
                            
                            case "-":
                                result=x-y;
                                break;

                            case "*":
                                
                                result=x*y;
                                break;

                            case "/":
                                if(y==0){
                                    throw new ArithmeticException("Division by 0 Not possible");
                                }
                                result=x/y;
                                break;
                            
                        }
                        firstToken=0;
                    }

                    else{
                        String op=st.nextToken();
                        Double y=Double.parseDouble(st.nextToken(op));

                        switch(op){
                            case "+":
                                result=result+y;
                                break;
                            
                            case "-":
                                result=result-y;
                                break;

                            case "*":
                                if(y==0){
                                    throw new ArithmeticException("Division by 0 Not possible");
                                }
                                result=result*y;
                                break;

                            case "/":
                                if(y==0){
                                    throw new ArithmeticException("Division by O Not possible");
                                }
                                result=result/y;
                                break;       
                        }
                    }
                }

                str=String.valueOf(result);
                tf.setText(str);


            }
            // Handling Exceptions like Arithmetic Exceptions
            catch(Exception a){
                str="Error";
                tf.setText(str+a.getMessage());
            }
        }

    }

    // Main Method
    public static void main(String[] args) {
        new Calculator();
    }

    
}
