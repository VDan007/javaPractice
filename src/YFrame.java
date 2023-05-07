import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class YFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    YFrame(){ 

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel("This is some text");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setBackground(Color.WHITE);
        label.setOpaque(true);

       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // this.setSize(450, 450);
        this.add(button);
        this.add(label);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){

           new JColorChooser(); 

            Color color = JColorChooser.showDialog(null,"Pick a color",Color.BLACK);

            label.setBackground(color);

            Color color2 = JColorChooser.showDialog(null,"Pick another",Color.BLACK);

            label.setForeground(color2);
        }
    }
}
