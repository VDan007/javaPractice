// import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FloatLayoutMAnagerIn  {
    public static void main(String[] args){
        // Layout Manager = Defines the natural layout for components within a container

        // FlowLayout = places components in a row , sized at their preffered size.
        // if the horizontal space in the container is too small, 
        // the FlowLayout class uses the next available row.

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250) );
        panel.setBackground(Color.RED);
        panel.setLayout(new FlowLayout());

       

        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
    
        frame.add(panel);
        frame.setVisible(true);

        


    }

    

    
}
