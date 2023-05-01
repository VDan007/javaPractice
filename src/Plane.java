public class Plane extends Vehicle {
    private String make;
    private String model;
    private int year;

    Plane(String make,String model,int year){
        setMake(make);
        setModel(model);
        setYear(year);
    }

    Plane(Plane x){
        this.copy(x);
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setMake(String make){
        this.make = make;
    }

    public void copy(Plane x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

    @Override
    void move() {
        System.out.println("The plane is moving");
    }

}
