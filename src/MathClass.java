import java.util.Scanner;

import javax.swing.JOptionPane;

public class MathClass {
    public static void main(String[] args) throws Exception {
       // operations();
       hypotenuseCalc();
        
    }

    public static void operations(){
        double x = 3.14;
        double y = -10;

        double max = Math.max(x, y);
        System.out.println("max: "+max);
        double min = Math.min(x,y);
        System.out.println("min: "+min);
        double abs = Math.abs(y);
        System.out.println("absolute: "+abs);
        double sqrt = Math.sqrt(x);
        System.out.println("squareRoot: "+sqrt);
        double round = Math.round(x);
        System.out.println("round: "+round);
        double ceil = Math.ceil(x);
        System.out.println("ceiling: "+ceil);
    }

    public static void hypotenuseCalc(){
        double x;
        double y;
        double z;

       // Scanner scann = new Scanner(System.in);
        x = Double.parseDouble(JOptionPane.showInputDialog("Enter side X") );
        System.out.println(x);
        y = Double.parseDouble(JOptionPane.showInputDialog("Enter side Y") );
        System.out.println(y);
        z = Math.sqrt(x * x + y * y);
        System.out.println(z);
    }
}
