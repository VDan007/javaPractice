public class Car extends Vehicle {
    String make = "Ford";
    String model = "Mustang";
    int year = 2023;
    String color = "red";
    double price = 500.00;

    String name;

    Car(String name){
        this.name = name;
    }
    

    void drive(){
        System.out.println("gooo");
    }

    void breake(){
        System.out.println("stoop");
    }

    public String toString(){

        return make + "\n" + model + "\n" + color + "\n" + year;
    }


    @Override
    void move() {
        System.out.println("The driver is making this vehicle move");
    }
}
