//A KeyAdapter class extends the Object class and implements the KeyListener interface.
// It provides a default implementation of each method in the KeyListener interface,
// which does nothing. 
// This allows a programmer to create a subclass of KeyAdapter and 
// override only the methods that are relevant to their application,
// without having to provide an empty implementation of all three methods.


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.PanelUI;

public class Key extends KeyAdapter {

    JFrame frame;
    JTextField tf;


    Key(){

        frame = new JFrame("Key Event Handling ");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Setting bg color for the frame
        JPanel p=new JPanel();
        p.setBackground(Color.YELLOW);
        p.setSize(300,400);
        p.setBounds(0,100,400,300);
        frame.add(p);
        
    

        // Creating TextField
        tf=new JTextField("");
        tf.setBounds(5,5,380,70);
        tf.setBackground(Color.LIGHT_GRAY);
        frame.add(tf);

        
        // Using KeyAdapter
        
        KeyAdapter ka= new KeyAdapter(){

            // Defining Methods
            public void keyPressed(KeyEvent e){
                System.out.println("Key Pressed: "+e.getKeyChar());
            }

            public void keyReleased(KeyEvent e){
                System.out.println("Key Released: "+e.getKeyChar());
            }

            public void keyTyped(KeyEvent e){
                System.out.println("Key Typed: "+e.getKeyChar());
            }

        };

        // Adding KeyListner to the TextField
        tf.addKeyListener(ka);
        frame.setVisible(true);

    }
    

    // Main method
    public static void main(String[] args) {
        new Key();
    }
}
