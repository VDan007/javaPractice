

import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GenericFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon ship;

    GenericFrame(){
        
       ship = new ImageIcon("sp.png");

       label = new JLabel();
       label.setBounds(0,0,40,40);
       label.setIcon(ship);
      // label.setBorder(BorderFactory.createLineBorder(Color.RED));
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setVerticalAlignment(JLabel.CENTER);
    //    label.setBackground(Color.RED);
    //    label.setOpaque(true);

    
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(label,BorderLayout.CENTER);
        this.addKeyListener(this);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keytyped = invoked when a key is typed uses keychar, char output

        switch(e.getKeyChar()){
            case 'a' : label.setLocation(label.getX() -10,label.getY());
            break;
            case 'd' : label.setLocation(label.getX() +10,label.getY());
            break;
            case 'w' : label.setLocation(label.getX(),label.getY()-10);
            break;
            case 's' : label.setLocation(label.getX(),label.getY()+10);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
       // keypresse = invoked when a physical key is pressed down. uses keycodes, int output

       switch(e.getKeyCode()){
        case 37 : label.setLocation(label.getX() -10,label.getY());
        break;
        case 39 : label.setLocation(label.getX() +10,label.getY());
        break;
        case 38 : label.setLocation(label.getX(),label.getY()-10);
        break;
        case 40 : label.setLocation(label.getX(),label.getY()+10);
        break;
    }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyreleased = calles whenever a button is released
        System.out.println("you released key charater " + e.getKeyChar());
        System.out.println("you released key charater " + e.getKeyCode());
    }



    
    
}
