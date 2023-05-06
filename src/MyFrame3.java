import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyFrame3 extends JFrame implements ActionListener {

    JCheckBox cBox;
    JButton button;
    JRadioButton pizzaBtn;
    JRadioButton hamburgerBtn;
    JRadioButton hotdogBtn;

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

    MyFrame3(char r){
        button = new JButton("submit");
        button.setPreferredSize(new Dimension(100,40));
        button.addActionListener(this);
        
        pizzaBtn = new JRadioButton("pizza");
        hamburgerBtn = new JRadioButton("hamburger");
        hotdogBtn = new JRadioButton("hotdog");

        pizzaBtn.addActionListener(this);
        hamburgerBtn.addActionListener(this);
        hotdogBtn.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaBtn);
        group.add(hamburgerBtn);
        group.add(hotdogBtn);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(pizzaBtn);
        this.add(hamburgerBtn);
        this.add(hotdogBtn);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaBtn){
            System.out.println(" You ordered pizza");
        }else if(e.getSource() == hamburgerBtn){
            System.out.println("You ordered hamburger");
        }else {
            System.out.println("You ordered hotdog");
        }
    }
}
