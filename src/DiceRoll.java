import java.util.Random;

public class DiceRoll {

    Random random = new Random();
    int number;
    
    DiceRoll(){
        roll();
    }
    void roll(){
        number = random.nextInt(6) + 1;
        System.out.println("rolled" + number);
       
    }
}
