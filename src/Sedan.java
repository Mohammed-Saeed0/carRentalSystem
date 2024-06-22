public class Sedan extends AbstractCar{
    public Sedan(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public double calculateRentalCost(int days) {
        int weeks = days / 7 ;
        int extraDays = days % 7 ;

        double total = weeks * 290 + extraDays * 50 ;
        return total;
    }
}
