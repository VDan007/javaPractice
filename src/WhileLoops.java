import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("enter name");
            name = scn.nextLine();
        }
        scn.close();
        System.out.println("hello "+name);
        
    }
}
