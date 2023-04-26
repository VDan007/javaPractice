public class UsefullStringMethod {
    public static void main(String[] args){
        String name = "Bro  ";
        boolean result = name.equals("Bro");
        boolean resultCaseInsensitive = name.equalsIgnoreCase("bro");
         System.out.println(result);
         System.out.println(resultCaseInsensitive);
         int resultLength = name.length();
         System.out.println(resultLength);
         char resultChar = name.charAt(2);
         System.out.println(resultChar);
         int resultIndexOf = name.indexOf("c");
         System.out.println(resultIndexOf);
         boolean resultIsEmpty = name.isEmpty();
         System.out.println(resultIsEmpty);
         String nameUpperCase = name.toUpperCase();
         System.out.println(nameUpperCase);
         String nameLowerCase = name.toLowerCase();
         System.out.println(nameLowerCase);
         String nameTrimmed = name.trim();
         System.out.println(nameTrimmed);
         String nameREplaced = name.replace("Bro","Father");
         System.out.println(nameREplaced);
         System.out.println(name);
   
     }
}
