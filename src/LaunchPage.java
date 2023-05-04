// import java.awt.BorderLayout;
// import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Button");

    LaunchPage(){

        button.setBounds(100,160,200,50);
        button.setFocusable(false);
        button.addActionListener(this);

        
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            new NewWindow();
            frame.dispose();
        }
    }
}
  