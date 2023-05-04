//import java.awt.Color;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener  {

    JButton button; 
    JLabel label;


    MyFrame(){

        ImageIcon icon = new ImageIcon("sp.png");
        ImageIcon fire = new ImageIcon("fire.png");
      
        label = new JLabel();
        label.setIcon(fire);
        label.setBounds(150,250,150,150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(0,0,250 ,100);
        button.addActionListener(this);
        button.setText("Attack");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setForeground(Color.RED);
        button.setBackground(Color.lightGray);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);



        this.setTitle("MyFrame"); //sets 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out of application
        this.setResizable(true); //prevent frame resize
        this.setSize(500,500 ); //sets x and y dimensions of frame
        this.setLocationRelativeTo(null);
        this.setLayout(null);
       // this.add(button);
      //  this.add(label);
        this.setVisible(true); //make frame visible
       // this.getContentPane().setBackground(new Color(50,130,250)); //change color of background
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("oop");
           // button.setEnabled(false);
           label.setVisible(!label.isVisible());
           }
        
    }

    
}
