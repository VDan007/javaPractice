import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame implements ActionListener {

    JCheckBox cBox;
    JButton button;

    MyFrame3(){

        button = new JButton("submit");
        button.setPreferredSize(new Dimension(100,40));
        button.addActionListener(this);

        cBox = new JCheckBox();
        cBox.setText("I'm not a robot");
        cBox.setFocusable(false);
        cBox.setFont(new Font("Consolas",Font.PLAIN,35));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(cBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(
                cBox.isSelected()
            );
        }
    }
}
