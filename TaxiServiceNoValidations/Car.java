package TaxiServiceNoValidations;

public class Car {
    private String name;
    private String licencePlate;
    private static final Car unassignedCar = new Car("None", "None");
    // defined null car, it is final because it is a constant and never will be changed
    // we need to set this one, so we can work with null and change them (apply methods etc.)

    public Car(String name, String licencePlate) {
        this.name = name;
        this.licencePlate = licencePlate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLicencePlate() {
        return licencePlate;
    }
    public static Car getNullCar() {
        return Car.unassignedCar;
    }

    /**
     There is no setter for licencePlate, cause it should be read-only.
     Method getNullCar makes sure that no-one can break my code with null.
     When there is null, it will return null car entity instead of throwing error.
     **/


    @Override
    public String toString() {
        return (STR."\n\t Car's name: \{this.name} \n\t Car's licence plate: \{this.licencePlate}");
    }
}
