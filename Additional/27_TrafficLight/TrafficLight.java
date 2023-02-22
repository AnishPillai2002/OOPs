
import java.awt.*;
import java.awt.event.*;
import java.text.CollationKey;

import javax.swing.*;

public class TrafficLight {

    JFrame frame;
    JPanel panel;
    
    Color red= Color.black;
    Color yellow=Color.black;
    Color green=Color.black;    
    
    //Creating Buttons
    JRadioButton r=new JRadioButton("Red");
    JRadioButton y=new JRadioButton("Yellow");
    JRadioButton g=new JRadioButton("Green");  

    // Painting light
    JComponent light= new JComponent() {
        public void paintComponent(Graphics g){

            // Drawing 
            g.setColor(Color.WHITE);
            g.fillRect(0, 50, 300, 450);

            // Drawing Circles
            g.setColor(red);
            g.fillOval(90, 100, 100, 100);

            g.setColor(yellow);
            g.fillOval(90, 210, 100, 100);

            g.setColor(green);
            g.fillOval(90, 320, 100, 100);
        }
    };


    TrafficLight(){

        frame=new JFrame("Traffic Light");
        frame.setSize(300,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        
        // Creating Panel
        panel=new JPanel();
        frame.add(panel);

        // Creatig Button Group
        ButtonGroup bg=new ButtonGroup();
        bg.add(r);
        bg.add(y);
        bg.add(g);

        //adding buttons
        r.addActionListener(new ActionListener() {
            public  void actionPerformed (ActionEvent e) {

                red=Color.red;
                green=Color.black;
                yellow=Color.black;

                light.repaint();
                
            }     
        });
        panel.add(r);

        y.addActionListener(new ActionListener() {
            public  void actionPerformed (ActionEvent e) {

                red=Color.black;
                yellow=Color.yellow;
                green=Color.black;
                

                light.repaint();
                
            }     
        });
        panel.add(y);

        g.addActionListener(new ActionListener() {
            public  void actionPerformed (ActionEvent e) {

                red=Color.black;
                yellow=Color.black;
                green=Color.green;

                light.repaint();
                
            }     
        });
        panel.add(g);


        // Adding Light to the Frame
        light.setPreferredSize(new Dimension(300,450));
        panel.add(light);
        

        

    }


    // Main Method
    public static void main(String[] args) {
        new TrafficLight();
    }

}
