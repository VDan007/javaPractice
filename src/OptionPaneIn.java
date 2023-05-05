import javax.swing.JOptionPane;

public class OptionPaneIn {
    public static void main(String[] args){
        //JOptionPane = pop up s standard dialog that prompts users for a value 
        // or informs them of something
     //   JOptionPane .showMessageDialog(null, args, "message", JOptionPane.PLAIN_MESSAGE);
     //   JOptionPane .showMessageDialog(null, args, "message", JOptionPane.INFORMATION_MESSAGE);
    //   JOptionPane .showMessageDialog(null, "you has a virus?", "message", JOptionPane.WARNING_MESSAGE);
      //  JOptionPane .showMessageDialog(null, "call support now", "message", JOptionPane.ERROR_MESSAGE);
      JOptionPane.showConfirmDialog(null, "do you even code", "Choose", JOptionPane.YES_NO_CANCEL_OPTION);
    }
}
