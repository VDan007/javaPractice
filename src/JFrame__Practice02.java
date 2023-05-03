import javax.swing.JFrame;

public class JFrame__Practice02 {
    public static void main(String[] args){

        // JLabel = a GUI display area for a string of text, an image. or both

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        new MyFrame();
    }
}