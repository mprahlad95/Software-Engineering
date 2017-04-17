import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationPortal {
    
    JFrame jf_register, frame;
    
    JLabel jlab_fname, jlab_lname, jlab_gender, jlab_uid;
    JLabel jlab_address, jlab_mno, jlab_email;
    JLabel jlab_pwd1, jlab_pwd2;
    
    JButton jb;
    
    JComboBox jcb_gender;
    String[] gen = {"-", "M", "F"};
    
    JTextField jtf_fname, jtf_lname, jtf_uid;
    JTextField jtf_address, jtf_mno, jtf_email;
    
    JPasswordField jpf_pwd1, jpf_pwd2;    
    
    static String fname;
    static String lname;
    static String uid;
    static String pwd1, pwd2;
    static String address;
    static String mno;
    static String email;
    static String gender;
    
    RegistrationPortal() {
        /////////////////////////////////////////////
        jf_register = new JFrame("Registration Portal");
        FlowLayout fl = new FlowLayout();
        fl.setAlignment(FlowLayout.CENTER);
       // GridLayout gl = new GridLayout();
       // gl.setRows(9);
        jf_register.setLayout(fl);
        jf_register.setSize(300,400); 
        jf_register.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        /////////////////////////////////////////////
        
        jlab_fname = new JLabel("Firstname ");
            jtf_fname = new JTextField(10);
            
        jlab_lname = new JLabel("Lastname ");
            jtf_lname = new JTextField(10);
            
        jlab_gender = new JLabel("Gender ");
            jcb_gender = new JComboBox(gen);
            jcb_gender.setSelectedIndex(0);
            
        jlab_address = new JLabel("Address ");
            jtf_address = new JTextField(10);
            
        jlab_mno = new JLabel("Mobile number ");
            jtf_mno = new JTextField(10);
            
        jlab_email = new JLabel("Email ");
            jtf_email = new JTextField(10);
            
        /////////////////////////////////////////////////
        jlab_uid = new JLabel("Enter new UserID ");
            jtf_uid = new JTextField(10);
            
        jlab_pwd1 = new JLabel("Enter new password ");
            jpf_pwd1 = new JPasswordField(10);
            
        jlab_pwd2 = new JLabel("Enter password again ");
            jpf_pwd2 = new JPasswordField(10);
        /////////////////////////////////////////////////        
        jb = new JButton("Register me!");
        /////////////////////////////////////////////////
        
        jf_register.setResizable(false);
        jf_register.setAlwaysOnTop(true);
       
        jf_register.add(jlab_fname, BorderLayout.NORTH);       
        jf_register.add(jtf_fname, BorderLayout.NORTH);
                
        jf_register.add(jlab_lname, BorderLayout.CENTER);       
        jf_register.add(jtf_lname, BorderLayout.CENTER);
                
        jf_register.add(jlab_gender, BorderLayout.CENTER);       
        jf_register.add(jcb_gender, BorderLayout.CENTER);
                
        jf_register.add(jlab_address, BorderLayout.CENTER);       
        jf_register.add(jtf_address, BorderLayout.CENTER);
                
        jf_register.add(jlab_mno, BorderLayout.CENTER);       
        jf_register.add(jtf_mno, BorderLayout.CENTER);
                
        jf_register.add(jlab_email, BorderLayout.CENTER);       
        jf_register.add(jtf_email, BorderLayout.CENTER);
                
        jf_register.add(jlab_uid, BorderLayout.CENTER);       
        jf_register.add(jtf_uid, BorderLayout.CENTER);
                
        jf_register.add(jlab_pwd1, BorderLayout.CENTER);       
        jf_register.add(jpf_pwd1, BorderLayout.CENTER);
                
        jf_register.add(jlab_pwd2, BorderLayout.CENTER);       
        jf_register.add(jpf_pwd2, BorderLayout.CENTER);
                
        jf_register.add(jb, BorderLayout.CENTER);
        jf_register.setVisible(true);
        
        
        /*
        jcb_gender.addActionListener(new ActionListener() {
         @Override
            public void actionPerformed(ActionEvent ae)
            {
                gender=(String)jcb_gender.getSelectedItem();
            }
        });
        */ 
        
        jb.addActionListener(new ActionListener(){  //ALL VALIDATIONS WILL BE HERE
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                if(jtf_fname.getText().equals(""))   
                        JOptionPane.showMessageDialog(frame, "Firstname Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jtf_lname.getText().equals(""))   
                        JOptionPane.showMessageDialog(frame, "Lastname Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jtf_address.getText().equals(""))   
                        JOptionPane.showMessageDialog(frame, "Address Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jtf_mno.getText().equals(""))
                        JOptionPane.showMessageDialog(frame, "Mobile Number Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(((String)jcb_gender.getSelectedItem()).equals("-"))
                        JOptionPane.showMessageDialog(frame, "Select Gender!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jtf_email.getText().equals(""))
                        JOptionPane.showMessageDialog(frame, "Email Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jtf_uid.getText().equals(""))
                        JOptionPane.showMessageDialog(frame, "UserID Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jpf_pwd1.getText().equals(""))
                        JOptionPane.showMessageDialog(frame, "Password Invalid!", "Error", JOptionPane.ERROR_MESSAGE);
                else if(jpf_pwd2.getText().equals(""))
                        JOptionPane.showMessageDialog(frame, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(frame, "Successful!");
            }
        });
        
        
    }
}

public class LoginPortal {
    
    JFrame jf, frame;
    JLabel jlab1,jlab2,jlab3;
    JButton jb, jbregister;
    JTextField jtf;
    JPasswordField jpf;    
    
    String str1="admin";            //username stored here
    String pwd1="password";         //password stored here
    String str2, pwd2;
    
    LoginPortal() {
        /////////////////////////////////////////////
        jf = new JFrame("Login Portal");
        jf.setLayout(new FlowLayout());
        jf.setSize(500,300); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /////////////////////////////////////////////
        jlab1 = new JLabel("UserID");
        jtf = new JTextField(10);
        jlab2 = new JLabel("Password");
        jpf = new JPasswordField(10);
        /////////////////////////////////////////////
        jlab3 = new JLabel("");
        /////////////////////////////////////////////
        jb = new JButton("Login");
        /////////////////////////////////////////////
        jbregister = new JButton("New user? Register now!");
        /////////////////////////////////////////////
        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                str2=jtf.getText();
                pwd2=jpf.getText();
                if(str1.equals(str2)&&pwd1.equals(pwd2))
                    JOptionPane.showMessageDialog(frame, "Welcome");
                else
                    JOptionPane.showMessageDialog(frame, "Wrong UserID/Password!", "Warning", JOptionPane.WARNING_MESSAGE);
                    //new DialogueBox("UserID/Password do not match!");
            }
        });
        //////////////////////////////////////////////
        ///////////////////////////////////////////////////////
        jbregister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                new RegistrationPortal();
            }
        });
        
        jf.add(jlab1);       
        jf.add(jtf);
        jf.add(jlab2);
        jf.add(jpf);
        jf.add(jb);
        
        jf.add(jbregister);
        jf.setVisible(true);
       
        jf.add(jlab3);
    }
    
    public static void main(String[] ar)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()   {
                new LoginPortal();
            }
        });
    }
}