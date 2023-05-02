import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_things {
    public static void main(String[] args){
        // file = an abstract representstion of file and directory pathnames

        File file = new File("src/g.txt");


        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write(" Roses are red \n Violets are blue \n Booty Boooty Boooty \n");
            writer.append("\n(A poem by bro)");
            writer.close();

        }catch(IOException e){

        }

        try{

            FileReader reader = new FileReader("toRead.txt");
            int data = reader.read();
            while(data != -1 ){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        }catch(Exception e){
            System.out.println("something went wrong!!");
        }

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
