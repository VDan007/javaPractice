import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionsIn {
    public static void main(String[] args){
        //exeption = an event that occurs during the execution of a program that. 
        // dirupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);

        try{

        
            System.out.println("Enter a whole  number to divide:");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number to divide by:");
            int y = scanner.nextInt();

            double z = (double)x/ (double)y;
           
            System.out.println("Result: " + z);
        } catch(ArithmeticException e){
            System.out.println("you cant divide by zero");
        } catch (InputMismatchException e){
            System.out.println("please enter number");
        } catch( Exception e){
            System.out.println("something went wrong");
        } finally{
            scanner.close();
        }
    }
}
