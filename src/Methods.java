public class Methods {
    public static void main(String[] args){
        // method a block of code that is executed whenever it is called upon

        hello("Bro",5);

        int a = add(1,2);

        System.out.println(a);
    }

    static void hello(String name, int age){
        System.out.println("Hello " + name + " Your age is " + age );
    }

    static int add (int x,int y){
        return x + y;
    }
}
