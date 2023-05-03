import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame_Practice01 {
    public static void main(String[] args){

        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("First JFrame"); //sets 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
        frame.setResizable(false); //prevent frame resize
        frame.setSize(420,420 ); //sets x and y dimensions of frame
        frame.setVisible(true); //make frame visible

         ImageIcon  image = new ImageIcon("logo.png"); //create an image icon
         frame.setIconImage(image.getImage()); //change icon of frame
         frame.getContentPane().setBackground(new Color(0,0,0)); //change color of background
    }
}
