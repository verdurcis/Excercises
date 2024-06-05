package TaxiServiceNoValidations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**

Database related to the taxi service.

 **/

public class TaxiService {
    Map <String, Driver> drivers = new HashMap<>();
    Map <String, Car> cars = new HashMap<>();
    // map > key on the left side, value on the right side
    // it is saying that I'll be searching for some key (f.e. id, name, licencePlate..)
    // for each String (key), there is 1 Driver/Car (value)


    public void addDriver (Driver driver) {
        // I'm stating here that parameter of this method is the Driver that I wanna add
        // putting a driver into the map based on provided id
        this.drivers.put(driver.getId(), driver);
    }

    public void removeDriver (String id) {
        // I'm removing based on provided id
        this.drivers.remove(id);
    }

    public List <Driver> getAllDrivers() {
        // I'm returning copy of list of all the drivers
        return List.copyOf(this.drivers.values());
    }

    public Driver getDriver (String id) {
        // getting just one driver based on provided id
        return this.drivers.get(id);
    }

    public void addCar (Car car) {
        // I'm stating here that parameter of this method is the Car that I wanna add
        // putting a car into the map based on provided licencePlate
        this.cars.put(car.getLicencePlate(), car);
    }

    public void removeCar (String licencePlate) {
        // I'm removing based on provided licencePlate
        this.cars.remove(licencePlate);
    }

    public List <Car> getAllCars() {
        // I'm returning copy of list of all the cars
        return List.copyOf(this.cars.values());
    }

    public Car getCar (String licencePlate) {
        // getting just one car based on provided licencePlate
        return this.cars.get(licencePlate);
    }


    @Override
    public String toString() {
        // all the text about drivers and cars
        StringBuffer sb = new StringBuffer();
        // using StringBuffer because we want to assemble the String from all different pieces of Strings
        // format is sb.append() - used when I want to add some more text

        sb.append("\nList of all drivers in Taxi Service:\n");
        for (Driver driver : this.drivers.values()) {
            sb.append(driver.toString());
            sb.append("\n");
            // here I will append using toString method from the Driver
        }

        sb.append("\n\nList of all cars in Taxi Service:\n");
        for (Car car : this.cars.values()) {
            sb.append(car.toString());
            sb.append("\n");
            // here I will append using toString method from the Car
        } return sb.toString();
    }
}
