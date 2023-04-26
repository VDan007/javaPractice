import java.util.Scanner;

public class Operators {
    public static void main(String[] args) throws Exception { 
        
        Scanner scann = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String resposne = scann.next();
        if(resposne.equals("q") || resposne.equals("Q")){
            System.out.println("You quit the game");
        }else{
            System.out.println("You are still playing the game *pew pew*");
        }
        scann.close();

    }
   
}


