package TaxiServiceNoValidations;

public class Driver {
    private String name;
    private String surname;
    private String id;
    private Car car;


    public Driver(String name, String surname, String id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.car = Car.getNullCar();
        // the created Null constant from "Car" class
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (car == null) {
            this.car = Car.getNullCar();
        } else {
            this.car = car;
        }
    }

    /**
     When there is null, it will return null car entity instead of throwing error.
     If I wanted to make sure that no one will break my code with null (nothing should happen);
     I should use:

     public void setCar(Car car) {
     if (car == null)  return;
     this.car = car;
     }

     **/

    public void removeCar(Car mazda6) {
        this.car = Car.getNullCar();
    }

    /**
      There is no setter for id, cause it should be read-only.
     **/

    @Override
    public String toString() {
        return (STR."\n\t Driver's name: \{this.name} \n\t Driver's surname: \{this.surname} \n\t Driver's id: \{this.id} \n\t Current car is: \{this.car.getLicencePlate()}");
    }
}
