import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    
    JLabel jlab;
    JButton jb;
    JTextField jtf;
    JFrame jf;

    SwingDemo() {
        
        jf = new JFrame("A Frame");
        jf.setLayout(new FlowLayout());
        jf.setSize(300,100); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jtf = new JTextField(10);
        
        jlab = new JLabel("");
        jb = new JButton("OK");
        //jb.setActionCommand("asdf");
        
        
                
        jf.add(jtf);
        jf.add(jb);
        jf.add(jlab);
        jf.setVisible(true);
    }
    
    public static void main(String[] ar)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run()   {
                new SwingDemo();
            }
        });
    }
}