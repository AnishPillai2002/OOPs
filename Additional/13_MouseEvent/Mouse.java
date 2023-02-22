//program for handling mouse events.

//The MouseListener interface provides five methods: 
// mouseClicked, mousePressed, mouseReleased, mouseEntered, and mouseExited,
// which are called when the corresponding mouse events occur.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse implements MouseListener{

    JFrame frame;
    JPanel panel;
    JTextField tf;
    // Defining Constructor
    Mouse(){

        frame=new JFrame("Mouse Event");
        frame.setSize(310,400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating a TextField
        tf=new JTextField("");
        tf.setBounds(25,25,250,50);
        tf.setEditable(false);
        frame.add(tf);

        // Creating Panel
        panel=new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBounds(5,100,300,200);
        panel.setBackground(Color.yellow);
        panel.addMouseListener(this);
        frame.add(panel);

        frame.setVisible(true);
    }

    // Implementing MouseListener Methods

    public void mouseClicked(MouseEvent e){
        // This output will be displayed inside the TextField
        String str="Mouse Clicked at : ("+e.getX()+","+e.getY()+")";
        tf.setText(str);
    }

    // These Outputs will be displayed in the terminal
    public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed at : ("+e.getX()+","+e.getY()+")");
    }

    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released at : ("+e.getX()+","+e.getY()+")");
    }

    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered at : ("+e.getX()+","+e.getY()+")");
    }

    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited at : ("+e.getX()+","+e.getY()+")");
    }

    // Main Method
    public static void main(String[] args) {
        new Mouse();
    }


    
}
