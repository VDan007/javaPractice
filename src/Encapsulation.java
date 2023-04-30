public class Encapsulation {
    //Encapsulation == attributes of a class will be hidden or private
    // Can be accessed only through methods(getters & setters)
    // should be private if no reason to make them public/protected
    public static void main(String[] args){
        Plane plane = new Plane("Loki","Septer",2023);
        plane.setYear(1992);
        System.out.println(plane.getYear());
    }
}
