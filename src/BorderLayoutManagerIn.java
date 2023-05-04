import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutManagerIn  {
    public static void main(String[] args){


        // Layout Manager = defines the natural layout for components within a container

        // 3 common managers

        //BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH,WEST,EAST,CENTER.


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10));


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout());

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        panel1.setPreferredSize(new Dimension(100,100 ));
        panel2.setPreferredSize(new Dimension(100,100 ));
        panel3.setPreferredSize(new Dimension(100,100 ));
        panel4.setPreferredSize(new Dimension(100,100 ));
        panel5.setPreferredSize(new Dimension(100,100 ));

        //-------------- sub panels -------------------------------------


        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        panel6.setBackground(Color.black);
        panel7.setBackground(Color.darkGray);

        panel6.setPreferredSize(new Dimension(50, 40));
        panel7.setPreferredSize(new Dimension(50, 40));

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.SOUTH);


        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
       

    }
}
