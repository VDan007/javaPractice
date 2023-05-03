import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame(){
        
        this.setTitle("First JFrame"); //sets 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
        this.setResizable(false); //prevent frame resize
        this.setSize(420,420 ); //sets x and y dimensions of frame
        this.setVisible(true); //make frame visible
        this.getContentPane().setBackground(new Color(50,130,250)); //change color of background
    }
}
