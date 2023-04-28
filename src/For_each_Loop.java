import java.util.ArrayList;

public class For_each_Loop {
    public static void main(String[] args){

        String[] animals = {"cat","dog","rat","bird"};

        for(String i : animals){
            System.out.print(i + " ,");
        }

        ArrayList<String> humans = new ArrayList<String>();
        humans.add("Bob");
        humans.add("Lea");
        humans.add("Vader");

        for(String i : humans){
            System.out.println(i);
        }

        
        recap();

    }


    public static void recap(){
        
        char[] chars = {'@','$'};
        for(char i : chars){
            System.out.println(i);
        }
    }
}
