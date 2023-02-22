// Write a java swing program to register voters for the panchayat elections. 
// Details of each Panchayat are to be entered once. 
// Panchayat detail includes Name of Panchayat, District and Population. 

// Voter registers under a Panchayat.
// Details of voter includes Name, Male/Female, Age, Voter Id and Panchayat name. 
 
// Children below the age of 18 should not be allowed to register and when attempted, 
// an appropriate exception is to be thrown "Sorry <name>, you are not old enough to vote." 
 
// The valid entries are to be written to a file named with the Panchayat 
// ensuring there are no two entries with the same voter id. 
// The file should contain details of the Panchayat as the first line 
// followed by the details of the registered voters.

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.FileWriter;

class Election extends JFrame implements ActionListener{

    
    //Text Fields And Labels
    JLabel pnl=new JLabel("Panchayat Name:");
    JTextField pnf=new JTextField();

    JLabel dl=new JLabel("District:");
    JTextField df=new JTextField();

    JLabel pl=new JLabel("Population:");
    JTextField pf=new JTextField();

    // Voter Information

    JLabel vnl=new JLabel("Voter Name:");
    JTextField vnf=new JTextField();

    JLabel val=new JLabel("Voter Age:");
    JTextField vaf=new JTextField();

    JLabel vgl=new JLabel("Gender:");
    JComboBox<String> vg = new JComboBox<String>(new String[]{"Male", "Female"});

    JLabel vidl=new JLabel("Voter Id:");
    JTextField vidf=new JTextField();

    JLabel vpnl=new JLabel("Panchayat Name:");
    JTextField vpnf=new JTextField();

    // Output Display Field
    JTextField tf=new JTextField();

    JButton RegisterP;
    JButton RegisterU;

    
    
    // Constructor
    Election(){

        //Creating a Frame
        setSize(600,800);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        

        // Register Button for Panchayat
        RegisterP=new JButton("Register");
        RegisterP.setBounds(20,160,120,40);
        RegisterP.setBackground(Color.blue);

        // Register Button for User
        RegisterU=new JButton("Register");
        RegisterU.setBounds(20,540,120,30);
        RegisterU.setBackground(Color.yellow);

        // Panchayat Information
        pnl.setBounds(20,20,100,20);
        pnf.setBounds(20,40,100,20);

        dl.setBounds(20,60,100,20);
        df.setBounds(20,80,100,20);

        pl.setBounds(20,100,100,20);
        pf.setBounds(20,120,100,20);

        // Voter Information
        vnl.setBounds(20,260,100,20);
        vnf.setBounds(20,280,100,20);

        val.setBounds(20,300,100,20);
        vaf.setBounds(20,320,100,20);
        
        vgl.setBounds(20,360,100,20);
        vg.setBounds(20,390,100,20);

        vidl.setBounds(20,440,100,20);
        vidf.setBounds(20,460,100,20);
        
        vpnl.setBounds(20,480,100,20);
        vpnf.setBounds(20,500,100,20);

        // Output Text Field
        tf.setBounds(20,580,300,30);
        tf.setEditable(false);

        add(pnl);
        add(pnf);
        add(dl);
        add(df);
        add(pl);
        add(pf);
        add(RegisterP);

        add(vnl);
        add(vnf);
        add(val);
        add(vaf);
        add(vgl);
        add(vg);
        add(vidl);
        add(vidf);
        add(vpnl);
        add(vpnf);
        add(RegisterU); 
        add(tf); 
        
        // Registering Source With Listner
        RegisterP.addActionListener(this);
        RegisterU.addActionListener(this);
    }



    // actionPerformed()
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==RegisterU){
            String age=vaf.getText();
            int num=Integer.parseInt(age);
            if(num<18){
                String Message="Sorry "+vnf.getText()+","+" You are Not Eligible to Vote";
                tf.setText(Message);
            }
            else{
                try{



                    
                }
            }
            

        }



    }

    // Main Method
    public static void main(String[] args) {
        
        new Election();
    }


}