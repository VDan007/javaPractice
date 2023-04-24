import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) throws Exception {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello"+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Age") );
        JOptionPane.showMessageDialog(null,"Age " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height") );
        JOptionPane.showMessageDialog(null,"Height " + height + " cm");
    }
}
