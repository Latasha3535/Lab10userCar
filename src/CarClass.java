//**
 /* Created by Student on 2/16/17.
         */
public class CarClass {

    //instance variables
    //every instance will have its own value
    //I don't set these here!!

    private String make;
    private String model;
    private int year;
    private double price;

    //constructor: a method that sets up a new instance of a class
    //visibility: should be public
    //static: NEVER
    //return type: NONE, not even void
    //name: ALWAYS the class name (match case)
    //argument list: vary (information used to set up the instance)

    //no-argument constructor example
    //if you don't write a constructor with no arguments,
    // Java supplies a default constructor
    public CarClass() {
        make = "";
        model = "";
        year = 0;
        price = 0.0;

    }
    //"all-arguments" constructor
    public CarClass (String make, String model,
                     int year , double price) {
        //taking arguments
        //storing their values in the instance variables
        //because the local variables/arguments will run out of scope
        this.make= make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {


        return make;
    }

    public String getModel() {


        return model;
    }

    public int getYear() {

        return year;
    }

    public double getPrice()
    {
        return price;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public void setPrice(double price) {


        this.price = price;
    }

    //if I write a toString method
    //  and I match Object's toString header
    //it will run whenever I use an object of this type (User)
    //  in a String context
    public String toString() {
        return  make + " " +" " +
                " "+ model + " "+
                " "+ year +" "+
                " " + price;
    }
}

