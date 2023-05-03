

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
// import java.awt.Color;
import javax.swing.border.Border;


public class JFrame__Practice02 {
    public static void main(String[] args){

        // JLabel = a GUI display area for a string of text, an image. or both

        ImageIcon image = new ImageIcon("dude.png");
        
        
        Border border = BorderFactory.createLineBorder(Color.RED, 1, true);

        JLabel labell = new JLabel(); // create label
        labell.setText("Bro do you even code?"); //set text of label
        labell.setSize(100, 110);
        labell.setHorizontalTextPosition(JLabel.CENTER); //set text Left center right of iamgeIcon
        labell.setVerticalTextPosition(JLabel.TOP); //set text top center bottom of imageicon
        labell.setIcon(image);
        labell.setForeground(Color.GREEN);
        labell.setFont(new Font("MV Boli",Font.PLAIN,20));
        labell.setIconTextGap(10);
        labell.setBackground(Color.BLACK);
        labell.setOpaque(true); //display background color
        labell.setBorder(border);
        labell.setVerticalAlignment(JLabel.TOP);
        labell.setHorizontalAlignment(JLabel.CENTER);
        labell.setBounds(100, 0, 350, 350); //set x,y position within frame as wll as dimension




        JFrame frame = new JFrame("Title HERE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(labell);
        frame.pack();
       // frame.setLayout(null);
        
        
       
    }
}