import java.util.Scanner;

public class Dynamic__Polymorphism {
    public static void main(String[] args){
        // polymorphism = many faces/  forms
        //dynamic = after compilation (during runtime)
        //

        Animal animal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("dog(1) or cat(2) it should be?");
        int choice = scanner.nextInt();
        System.out.println("your choice is " + choice);
        scanner.close();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }else{
            animal = new Animal();
            animal.speak();
        }

        

    }
}
