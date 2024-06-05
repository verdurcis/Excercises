package TaxiServiceNoValidations;

public class Main {
    public static void main(String[] args) {
        TaxiService taxi = new TaxiService();
        // I need to inicialize a new TaxiService in order to work with all the methods

        Driver josef = new Driver ("Josef", "Holý", "123456789");
        Car mitsubitchi = new Car ("Mitsubitchi", "AC 6AY");
        Car mazda6 = new Car ("Mazda 6", "KAY 89P");

        taxi.addCar(mitsubitchi);
        taxi.addCar(mazda6);
        taxi.addDriver(josef);

        System.out.println(taxi);
        josef.setCar(mazda6);
        System.out.println(josef);
        josef.setCar(null);
        System.out.println(josef);

    }
}
