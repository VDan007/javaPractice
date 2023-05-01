public class Interfaces {
    // interface = a template that can be applied to a class.
    // simmilat to inheritance, but specifies what a class has/must do.
    // classes can aaply more than one interface, inheritance is limited to one super

    public static void main(String[] args){

        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    


    }
}
