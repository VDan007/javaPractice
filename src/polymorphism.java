public class polymorphism {
    public static void main(String[] args){
        //polymorphism = greek word for poly-'many' , morph- 'from'
        // the  ability of an object to indetify as more than one type

        Car car = new Car("inc","Potter",1997);
        Boat boat = new Boat();
        Plane plane = new Plane("inc","Harry",1998);


        Vehicle[] racers = {car,boat,plane};

        for(Vehicle vehicle : racers){
            vehicle.go();
        }

        }
}
