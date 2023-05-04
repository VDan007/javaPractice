import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class LayeredPaneIn {
    public static void main(String[] args){
      // JLayerdPane = Swing container that provides a
      // third dimension for positioning components
      // ex. depth, y-index

      JLabel label1 = new JLabel();
      label1.setBounds(0, 0, 250, 250);
      label1.setBackground(Color.BLUE);
      label1.setOpaque(true);

      JLabel label2 = new JLabel();
      label2.setBounds(50, 50, 250, 250);
      label2.setBackground(Color.GREEN);
      label2.setOpaque(true);

      JLabel label3 = new JLabel();
      label3.setBounds(100, 100, 250, 250);
      label3.setBackground(Color.RED);
      label3.setOpaque(true);

      JLayeredPane layeredPane = new JLayeredPane();
      layeredPane.setBounds(0, 0, 500, 500);


      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 500);
      frame.setLayout(null);
      frame.setLocationRelativeTo(null);
      frame.add(layeredPane);
      layeredPane.add(label1,Integer.valueOf(0));
      layeredPane.add(label2,Integer.valueOf(5));
      layeredPane.add(label3,Integer.valueOf(2));

    //   layeredPane.add(label1);
    //   layeredPane.add(label2);
    //   layeredPane.add(label3);

      frame.setVisible(true);
      


    }

   
}
