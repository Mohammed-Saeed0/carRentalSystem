public class SUV extends AbstractCar{

    public SUV(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public double calculateRentalCost(int days) {
        int weeks = days / 7 ;
        int extraDays = days % 7 ;

        double total = weeks * 180 + extraDays * 30 ;
        return total;
    }
}
