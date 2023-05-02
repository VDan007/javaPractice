import java.io.File;

public class FinalIn {
    public static void main(String[] args){
        // file = an abstract representstion of file and directory pathnames

        File file = new File("src/g.txt");

        if(file.exists()){
            System.out.println(" exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
           // file.delete();
        }else {
            System.out.println("doesn't exist");
        }

    }
}
