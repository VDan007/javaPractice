import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("enter number of rows");
        rows= scn.nextInt();
        System.out.println("enter number of columns");
        columns = scn.nextInt();
        System.out.println("enter symbol to use");
        symbol = scn.next();

        for(int i =1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns;j++){
                System.out.print(symbol);
            }
        }
        scn.close();

    }
}
