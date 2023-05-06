import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {

        JButton submitBtn;
        JTextField textField;

    MyFrame2(){

        submitBtn = new JButton("Sumbmit");
        submitBtn.setPreferredSize(new Dimension(100,35));
        submitBtn.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(Color.BLUE);
        textField.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.BLUE);
        textField.setText("username");
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout() );
        this.setLocationRelativeTo(null);
        this.add(submitBtn);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitBtn){
            System.out.println("Wellcome " + textField.getText());
            textField.setText("");
            submitBtn.setEnabled(false);
        }
    }
} 
