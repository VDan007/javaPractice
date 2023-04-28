public class Method__Overriding {
    public static void main(String[] args){

        // method overriding = Declalring a method in sub class,
        //          wich is already present in parent class.
        //          done so that a child class can give its own implementation


        Animal cat = new Animal();
        Dog rex = new Dog();

        cat.speak();
        rex.speak();

    }
}
