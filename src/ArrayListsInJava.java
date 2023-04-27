import java.util.ArrayList;

public class ArrayListsInJava {
    public static void main(String[] args){
        //Arraylists = a resizible array;
                    //    Elements can be added and removed after compilation phase. 
                    //    store reference data type
                    arrList02();
    }

    public static void arrList01(){
        ArrayList<String > food = new ArrayList<String>();      
        
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0,"sushi");
        food.remove(1);
        food.add("whatever");
        food.clear();

        for(int i = 0; i < food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println(food.size());
    }

    public static void arrList02(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);

        nums.remove(0);
       // nums.set(1,12);


        // for(int i = 0; i< nums.size(); i++){
        //     System.out.println(nums.get(i));
            

        // }
        
        System.out.println(nums.size());
        System.out.println(nums.get(0));
        nums.add(10);
        System.out.println(nums.get(1));
    }
}
