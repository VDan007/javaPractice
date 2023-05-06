import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class MyFrame3 extends JFrame implements ActionListener {

    JCheckBox cBox;
    JButton button;
    JRadioButton pizzaBtn;
    JRadioButton hamburgerBtn;
    JRadioButton hotdogBtn;
    JComboBox<String> comboBox;

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

    MyFrame3(int n){
        button = new JButton("submit");
        button.setPreferredSize(new Dimension(100,40));
        button.addActionListener(this);
        
        String[] animals = {"dog","cat","bird"};
        comboBox = new JComboBox<String>(animals);
        comboBox.addActionListener(this);
        System.out.println( comboBox.getItemCount());
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
       



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(comboBox);
    
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pizzaBtn){
            System.out.println(" You ordered pizza");
        }else if(e.getSource() == hamburgerBtn){
            System.out.println("You ordered hamburger");
        }else if(e.getSource() == hotdogBtn){
            System.out.println("You ordered hotdog");
        }else if(e.getSource() == comboBox){
           // System.out.println(comboBox.getSelectedItem());
           System.out.println(comboBox.getSelectedIndex());
        }
    }
}
