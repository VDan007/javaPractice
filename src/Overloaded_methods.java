public class Overloaded_methods {
    public static void main (String[] args){

        // overloaded methods = methods that share the same name but have different parameters
        // method name + parameters = method signature

    }

    static int add(int x, int y){
        return x + y;
    }
    static int add(int x, int y, int c){
        return x + y + c;
    }
    static int add(int x, int y, int c, int d){
        return x + y + c + d;
    }
}
