public class Plane {
    private String make;
    private String model;
    private int year;

    Plane(String make,String model,int year){
        setMake(make);
        setModel(model);
        setYear(year);
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

}
