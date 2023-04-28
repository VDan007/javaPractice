

public class ArrayOfObjects {
    public static void main(String[] args){

     

       // Food[] refigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        Food[] refigerator = {food1,food2,food3};

        refigerator[0] = food1;
        refigerator[1] = food2;
        refigerator[2] = food3;

        System.out.println(refigerator[0].name);
        System.out.println(refigerator[1].name);
        System.out.println(refigerator[2].name);

    }



    public static void objectsAsArguments(){
        Garage garage = new Garage();
        Car car = new Car("BMW");

        garage.park(car);
    }
}
