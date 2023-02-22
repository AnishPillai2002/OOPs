// program for creating a simple Calculator

import java.awt.*;
import java.awt.event.*;
import java.util.StringTokenizer;

import javax.swing.*;;

public class Calculator implements ActionListener {

    JFrame frame;
    JPanel panel;
    JTextField tf;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,sub,mul,div,equal,clr;

    // Constructor
    Calculator(){

        // Creating the Frame
        frame = new JFrame("Calculator");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Creating TextField
        tf=new JTextField("");
        tf.setBounds(25,25,350,50);
        tf.setEditable(false);
        frame.add(tf);

        // Creating a JPanel
        panel=new JPanel();
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

        // Adding Buttons to the Panel
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
        panel.setBounds(45,100,300,300);;
        frame.add(panel);

        // Adding Action Listener
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
        mul.addActionListener(this);
        div.addActionListener(this);
        clr.addActionListener(this);
        equal.addActionListener(this);

        // Creating a Label for Branding
        JLabel text=new JLabel("Anish");
        text.setBounds(170,430,60,30);
        frame.add(text);

        frame.setVisible(true);
    }

    // Overriding the method
    public void actionPerformed(ActionEvent e){
        String str;
        if(e.getSource()==b1){
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
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")||tf.getText().endsWith(" ")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" + ");
                tf.setText(str);
            }       
        }

        if(e.getSource()==sub){
            
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/") || tf.getText().endsWith(" ")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" - ");
                tf.setText(str);
            }  

        }

        if(e.getSource()==mul){
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")||tf.getText().endsWith(" ")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" *");
                tf.setText(str);
            }  
        }

        if(e.getSource()==div){
            if(tf.getText().equals("") || tf.getText().endsWith("+") || tf.getText().endsWith("-") || tf.getText().endsWith("*") || tf.getText().endsWith("/")||tf.getText().endsWith(" ")){
                // Do Nothing
            }
            else{
                str=tf.getText().concat(" /");
                tf.setText(str);
            }  
        }

        if(e.getSource()==clr){
            str="";
            tf.setText(str);
        }

        if(e.getSource()==equal){

            try{
                str=tf.getText();

                // Creating String Tokenizer
                StringTokenizer st=new StringTokenizer(str," ");
                int first=1;
                double result=0;
                
                
                while(st.hasMoreTokens()){

                    if(first==1){
                        Double x=Double.parseDouble(st.nextToken());
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
                                    throw new ArithmeticException("Division by 0");
                                }
                                result=x/y;
                                break;       
                        }
                        first=0;
                    }

                    else{
                        String op=st.nextToken();
                        Double y=Double.parseDouble(st.nextToken());

                        switch(op){

                            case "+":
                                result+=y;
                                break;

                            case "-":
                                result-=y;
                                break;

                            case "*":
                                result*=y;
                                break;

                            case "/":
                                
                                if(y==0){
                                    throw new ArithmeticException("Division By 0");
                                }
                                result/=y;            
                                break;          
                        }
                    }

                }

                str=String.valueOf(result);
                tf.setText(str);
        }
        catch (Exception a) {
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
