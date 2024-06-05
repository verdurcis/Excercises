package TaxiServiceWithValidations;

public class Car {
    private String name;
    private String licencePlate;
    private static final Car unassignedCar = new Car("None", "None");

    public Car(String name, String licencePlate) {
        this.name = name;
        this.licencePlate = licencePlate;
    }

    public static Car getNullCar() {return Car.unassignedCar;}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLicencePlate() {
        return licencePlate;
    }

    /**
     There is no setter for licencePlate, cause it should be read-only.
     **/


    @Override
    public String toString() {
        return (STR."\n\t Car's name: \{this.name} \n\t Car's licence plate: \{this.licencePlate}");
    }
}
