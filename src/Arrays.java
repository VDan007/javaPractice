public class Arrays {
    public static void main(String[]args) throws Exception {

       // simple();
       twoDArrays();
    }
        
    public static void simple(){
        // String[] cars = {"Camaro","Corvette","Tesla"};
        // cars[0] = "Mustang";
        String[] cars = new String[3];
        
        cars[0] = "Mustang";
        cars[1] = "Mustangg";
        cars[2] = "Mustanggg";


        for(int i = 0; i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }

    public static void twoDArrays(){

        String[][] cars2D = new String[3][3];

        // String [][] cars2D__alternative = {{"Camaro","Corvette","Silverado"},
        //                                    {"Mustang","Ranger","F-150"},
        //                                    {"Ferrari","Lambo","Tesla"}};

       
        
        cars2D[0][0] = "Camero";
        cars2D[0][1] = "Corvette";
        cars2D[0][2] = "Silverado";

        cars2D[1][0] = "Mustang";
        cars2D[1][1] = "Ranger";
        cars2D[1][2] = "F-150";

        cars2D[2][0] = "Ferrari";
        cars2D[2][1] = "Lambo";
        cars2D[2][2] = "Tesla";

        for(int i = 0; i < cars2D.length; i++){
            System.out.println();
            for(int j = 0; j < cars2D[i].length; j++){
                System.out.print(cars2D[i][j] +", ");
            }
            System.out.println();
        }


    }
    
}
