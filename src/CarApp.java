import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


// Ask the user to input a number of car they would like enter


        //CarClass[] CarList = new CarClass[num];
        ArrayList<CarClass> CarList = new ArrayList<CarClass>();

        String choice="y";

        //add it to the ArrayList


        CarClass n = new CarClass ("HYUNDAI      ", "ix20        ", 2017,20000);
        CarList.add(n);

        n = new CarClass ("Dodge        ", "Charger     ", 2017,28000);
        CarList.add(n);

        n = new CarClass ("Ford         ", "Explorer    ", 2017,30000);
        CarList.add(n);

        UsedCar s = new UsedCar("KIA MOTORS UK", "Soul        ", 2014, 15000, 78000);
        CarList.add(s);

        s = new UsedCar("TOYOTA       ", "AYGO        ", 2010, 12000, 100000);
        CarList.add(s);

        s = new UsedCar("Dogde        ", "Chrysler 200", 2000, 10000,80000 );
        CarList.add(s);


        while(choice.equalsIgnoreCase("y")) {


            for (CarClass u : CarList) {
                int count = 0;

                System.out.println(u);

            }

            System.out.println(" Select a number for what car you would like to see: ");
            int number = scan.nextInt();


            while (number < 0 || number > 6) {
                System.out.println(" There is no car in the list Plesas try again.");
                number = scan.nextInt();
            }

            System.out.println("Car selected: " + CarList.get(number - 1));

            System.out.println("Do you want to buy the car:  ( yes or no)");
            choice = scan.next();

            if (choice.equalsIgnoreCase("y")) {
                CarList.remove(number-1);
                System.out.println("The car was sold");
            }
        }




       // System.out.println("\nAfter remove():");
        //for (int i =0; i < names.size(); i++){
           // System.out.print(names.get(i));

        }


    public static int getInt(Scanner sc, String prompt) {
//        String prompt = "Please enter an integer: ";
        System.out.print(prompt);
        int n = 0;

        //as long as there's NOT an int
        //prompt the user to enter again
        while (!sc.hasNextInt()) {
            sc.nextLine();

            System.out.print("I'm sorry, that's not an int. " +
                    prompt);
        }

        //once there is an int,
        // take it as input
        n = sc.nextInt();
        sc.nextLine(); //clear out the enter here

        return n;
    }
}
