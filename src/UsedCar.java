/**
 * Created by Student on 2/17/17.
 */
public class UsedCar extends CarClass {

    private double mileage;

    public UsedCar(String make, String model,
                   int year , double price, double mileage) {

        super(make, model, year, price);
        this.mileage = mileage;

    }

    public double getMileage() {

        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //extending a method
    //it does everything the superclass method does
    //and more
    public String toString() {
        return super.toString()+"------" + "Total "+ "\t" + mileage;

    }
}





