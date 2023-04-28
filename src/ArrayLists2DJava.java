import java.util.ArrayList;

public class ArrayLists2DJava {
    public static void main(String[] args){


  


       
     

        ArrayList<String> bakoryList = new ArrayList<>();
        bakoryList.add("pasta");
        bakoryList.add("donuts");
        bakoryList.add("bread");

        
        


        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");


        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("coffee");
        
        



        ArrayList< ArrayList<String> > groceryList = new ArrayList<>();
        groceryList.add(bakoryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
    }   

}
