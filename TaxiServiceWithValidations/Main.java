package TaxiServiceWithValidations;

public class Main {
    public static void main(String[] args) {
        TaxiServiceWithValidations.TaxiService taxi = new TaxiService();
        // I need to inicialize a new TaxiService in order to work with all the methods

        TaxiServiceWithValidations.Driver josef = new TaxiServiceWithValidations.Driver("Josef", "Holý", "123456789");
        TaxiServiceWithValidations.Driver david = new TaxiServiceWithValidations.Driver("David", "Nový", "897263137");

        TaxiServiceWithValidations.Car mitsubitchi = new TaxiServiceWithValidations.Car("Mitsubitchi", "AC 6AY");
        TaxiServiceWithValidations.Car mazda6 = new TaxiServiceWithValidations.Car("Mazda 6", "KAY 89P");

        taxi.addCar(mitsubitchi);
        taxi.addCar(mazda6);

        taxi.addDriver(josef);
        taxi.addDriver(david);

        System.out.println(taxi);

        taxi.assignCarToDriver(david, mazda6);
        taxi.assignCarToDriver(josef, mazda6);
        System.out.println(taxi);


    }
}
