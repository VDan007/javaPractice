import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBar(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);


        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        int counter = 0;
        while(counter <= 100){
           bar.setValue(counter);
           try{
             counter += 10;
             Thread.sleep(900);
           }catch( InterruptedException e){
            e.printStackTrace();
           }
        }
        bar.setString("Done");
    }
}
