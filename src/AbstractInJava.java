public class AbstractInJava {
    public static void main(String[] args){
        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation

       // Vehicle vehicle = new Vehicle();
        Car car = new Car("abcar");

        car.go();
        car.move();

    }
}
