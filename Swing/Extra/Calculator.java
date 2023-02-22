import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Calculator  {

    JFrame frame;
    JPanel buttonJPanel;
    JTextField textField;

    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button0 = new JButton("0");

    JButton buttonAdd = new JButton("+");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("*");
    JButton buttonDiv = new JButton("/");
    JButton buttonEqual = new JButton("=");
    JButton buttonClear = new JButton("C");

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.setResizable(false);

        textField = new JTextField("");
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        frame.add(textField);

        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(4, 4, 1, 1));
        buttonJPanel.add(button7);
        buttonJPanel.add(button8);
        buttonJPanel.add(button9);
        buttonJPanel.add(buttonDiv);
        buttonJPanel.add(button4);
        buttonJPanel.add(button5);
        buttonJPanel.add(button6);
        buttonJPanel.add(buttonMul);
        buttonJPanel.add(button1);
        buttonJPanel.add(button2);
        buttonJPanel.add(button3);
        buttonJPanel.add(buttonSub);
        buttonJPanel.add(button0);
        buttonJPanel.add(buttonClear);
        buttonJPanel.add(buttonAdd);
        buttonJPanel.add(buttonEqual);
        buttonJPanel.setBounds(50, 100, 300, 300);
        frame.add(buttonJPanel);

       

        frame.setVisible(true);

    }

    
    

    public static void main(String[] args) {
        new Calculator();
    }
}
