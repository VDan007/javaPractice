import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class LayeredPaneIn {
    public static void main(String[] args){
      // JLayerdPane = Swing container that provides a
      // third dimension for positioning components
      // ex. depth, y-index

      JLayeredPane layeredPane = new JLayeredPane();
      layeredPane.setBounds(0, 0, 500, 500);


      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500, 500);
      frame.setLayout(null);
      frame.setLocationRelativeTo(null);
      frame.add(layeredPane);

      frame.setVisible(true);
      


    }

   
}
