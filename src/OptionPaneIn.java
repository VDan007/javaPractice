
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OptionPaneIn {
    public static void main(String[] args){
        //JOptionPane = pop up s standard dialog that prompts users for a value 
        // or informs them of something
     //   JOptionPane .showMessageDialog(null, args, "message", JOptionPane.PLAIN_MESSAGE);
     //   JOptionPane .showMessageDialog(null, args, "message", JOptionPane.INFORMATION_MESSAGE);
    //   JOptionPane .showMessageDialog(null, "you has a virus?", "message", JOptionPane.WARNING_MESSAGE);
      //  JOptionPane .showMessageDialog(null, "call support now", "message", JOptionPane.ERROR_MESSAGE);
     // JOptionPane.showConfirmDialog(null, "do you even code", "Choose", JOptionPane.YES_NO_CANCEL_OPTION);

    //  int userAnswer = JOptionPane.showConfirmDialog(null, "Bro dou you even code?", "answer",JOptionPane.YES_NO_CANCEL_OPTION);
    //  System.out.println(userAnswer);
     

    // String name = JOptionPane.showInputDialog("What is your name?");

    // System.out.println(name + (userAnswer == 0 ? " does code" : " doesn't code") );

      String[] responses= {"You are awesome","Thank you","blush"};

      ImageIcon image = new ImageIcon("fire.png");
      JOptionPane.showOptionDialog(null, "you are awesome",
                                   "secret message", JOptionPane.YES_NO_CANCEL_OPTION, 
                                   JOptionPane.INFORMATION_MESSAGE, image , responses, 
                                   0);

    }
}
