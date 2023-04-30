public abstract class Vehicle {
    
    double speed;

            void go(){
                System.out.println("this vehicle is moving");
            }

            void stop(){
                System.out.println("this vehicle is stopping");
            }

            abstract void move();


}
