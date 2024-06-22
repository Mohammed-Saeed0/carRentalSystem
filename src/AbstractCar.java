public  abstract class AbstractCar implements Rentable{

    // properties or attributes
    private String brand;
    private String model;
    private int year;
    public boolean available;

    // constructor


    public AbstractCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        available = true;
    }

    // getter
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    // implement the interface methods


    @Override
    public void rent() {
        available = false;
    }

    @Override
    public void returnCar() {
        available = true;
    }

    @Override
    public boolean isRented() {
        if (available) {
            return false;
        } else {
            return true;
        }
    }

    public abstract double calculateRentalCost(int days);
}
