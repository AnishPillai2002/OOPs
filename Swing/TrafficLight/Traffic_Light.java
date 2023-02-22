//Write a Java program that simulates a traffic light. 
//The program lets the user select one of three lights: red, yellow, or green.
// When a radio button is selected, the light is turned on, and only one light can be on at a time.
// No light is on when the program starts. 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Traffic_Light {

    // Creating Radiobutton
    JRadioButton r=new JRadioButton("Red");
    JRadioButton y=new JRadioButton("Yellow");
    JRadioButton g=new JRadioButton("Green");

    // Creating JFrame and JPanel
    JFrame frame;
    JPanel panel;

    // Creating Objects of Color to store the state of color
    Color red= Color.black;
    Color yellow=Color.black;
    Color green=Color.black;


    // Creating Lights
    JComponent  light = new JComponent(){
        public void paintComponent(Graphics g){

            // Setting Color for the Panel
            g.setColor(Color.GRAY);
            g.fillRect(0,0,300,400);

            // Setting Colors for the Lights by drawing ovals
            g.setColor(red);
            g.fillOval(100,40,100,100);

            g.setColor(yellow);
            g.fillOval(100,150,100,100);

            g.setColor(green);
            g.fillOval(100,260,100,100);
        }
    };

    // Defining the Constructor
    Traffic_Light(){

        frame=new JFrame("Traffic Light");
        panel=new JPanel();

        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(panel);


        // Creating a Button Group
        ButtonGroup bg=new ButtonGroup();
        bg.add(r);
        bg.add(y);
        bg.add(g);

        // Adding Action Listeners to the Buttons and Defining the Method to handle event
        r.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                // Activating the Red Light 
                red=Color.red;
                yellow=Color.black;
                green=Color.black;

                // Using repaint() to change the Color
                light.repaint(); 

            }
        });
        panel.add(r);

        y.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Activating the Yellow Light
                yellow=Color.yellow;
                red=Color.black;
                green=Color.black;

                light.repaint();
            }
        });
        panel.add(y);

        g.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //Activating the Green Color
                green=Color.green;
                red=Color.black;
                yellow=Color.black;

                light.repaint();
            }
        });
        panel.add(g);

        light.setPreferredSize(new Dimension(300, 400));
        // Adding the lights in the JPanel
        panel.add(light);
    }


    // Main Method
    public static void main(String[] args) {
        
        Traffic_Light t=new Traffic_Light();
    }
}
