public class Car extends Vehicle {
    String make;
    String model;
    int year;
    double price;
    String color;
    String name;

    Car(String name){
        this.name = name;
    }

    Car(String make,String model,int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }
    

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public int getYear(){
        return this.year;
    }

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }



    void drive(){
        System.out.println("gooo");
    }

    void breake(){
        System.out.println("stoop");
    }

    public void go(){
        System.out.println("The car is going");
    }

    // public String toString(){

    //     return make + "\n" + model + "\n" + color + "\n" + year;
    // }


    @Override
    void move() {
        System.out.println("The driver is making this car move");
    }
}
