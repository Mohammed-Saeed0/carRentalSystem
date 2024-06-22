import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create objects
        SUV suv = new SUV("Toyota Camry", "Sedan", 2019);
        Sedan sedan = new Sedan("Honda CR-V ", "SUV", 2020);

        // add car to the list of cars for the system
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        carRentalSystem.addCar(suv);
        carRentalSystem.addCar(sedan);


        // car rental system
        System.out.println();
        System.out.println("Welcome to the Advanced Car Rental System!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Cars: ");
        carRentalSystem.displayAvailableCars();
        System.out.println();

        System.out.print("Enter the car number to rent (0 to exit): ");
        int choice = scanner.nextInt();
        if (choice == 0)
            return;
        if (choice == 1)
            carRentalSystem.rentCar(suv, 15);
        if (choice == 2)
            carRentalSystem.rentCar(sedan, 20);

        System.out.println();
        System.out.println("Available Cars: ");
        carRentalSystem.displayAvailableCars();
        System.out.println();

        System.out.print("Enter the car number to return (0 to exit): ");
        int choice1 = scanner.nextInt();
        if (choice1 == 0)
            return;
        if (choice1 == 1)
            carRentalSystem.returnCar(suv);
        if (choice1 == 2)
            carRentalSystem.returnCar(sedan);

        System.out.println();

        System.out.println("Available Cars: ");
        carRentalSystem.displayAvailableCars();
        System.out.println();

        System.out.println("the total rental cost for 10 days by SUV is : " + suv.calculateRentalCost(10));
        System.out.println("the total rental cost for 15 days by Sedan is : " + sedan.calculateRentalCost(10));
    }
}