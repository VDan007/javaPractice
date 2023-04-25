public class IfStatements {
    public static void main(String[] args) throws Exception { 
        int age = 15;
        if(age >= 18){
            System.out.println("You are an adult");
        }else if(age < 14){
            System.out.println("You are a toddler");
        }else{
            System.out.println("You are not and adult");
        }
    }
}
