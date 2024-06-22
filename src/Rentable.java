public interface Rentable {
    void rent();  // Marks the car as rented
    void returnCar(); // Marks the car as available
    boolean isRented(); // Returns true if the car is rented, false otherwise.

}
