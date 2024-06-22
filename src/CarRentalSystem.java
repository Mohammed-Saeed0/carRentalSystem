import java.util.ArrayList;
import java.util.List;

public class CarRentalSystem {

    // make arraylist to store the car objects
    private List<AbstractCar> cars;

    // constructor
    public CarRentalSystem() {
        cars = new ArrayList<>();
    }


    // method to add the car
    public void addCar(AbstractCar car) {
        cars.add(car);
    }

    // method to display all cars
    public void displayAvailableCars() {
        int i = 1;
        for (AbstractCar car1 : cars) {
            if (car1.available) {
                System.out.println((i) + " . " + car1.getBrand() + '(' + car1.getYear() + ") - " + car1.getModel());
            }
            i++;
        }
    }

    // method to rent a car
    public void rentCar(AbstractCar car, int days) {
        if (car.available) {
            car.rent();
//            cars.remove(car);
            System.out.println("Car rented successfully! Enjoy your ride");
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    public void returnCar(AbstractCar car) {

            if (!car.available) {
                car.returnCar();
//                cars.add(car1);
                System.out.println("car returned ! thank you");
//                break;
            } else {
                System.out.println("Car was not rented.it is available");

        }
    }
}
