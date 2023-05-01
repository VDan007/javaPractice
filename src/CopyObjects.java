

public class CopyObjects {

    public static void main(String[] args){

        Plane plane1 = new Plane("Mustang","Tom",1992);
        Plane plane2 = new Plane("Mustang","TomCat",1998);


        plane2.copy(plane1);


        System.out.println(plane1);
        System.out.println(plane2);
        System.out.println(plane1.getModel());
        System.out.println(plane2.getModel());
    }


    
}
