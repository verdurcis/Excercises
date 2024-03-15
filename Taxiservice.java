package Excercises;

/*

Project Tasks:

1. Create a class for managing drivers, including attributes such as name, driver ID, and assigned car. // done
2. Develop a class for managing cars, incorporating attributes such as make, model, plate number, and assigned driver. // done
3. Implement a class for managing parking locations, comprising attributes such as location name, available parking space, and a list of parked cars. // done
4. Demonstrate the functionality to assign drivers to specific cars within the system.
5. Ensure that any cars not assigned to drivers are automatically assigned to available parking locations.
6. Develop a user-friendly interface for displaying driver details, car information, and parking location status. // done

Expected Output:
Upon completion of the project, you should be able to showcase a functional
Car Fleet Management System that effectively handles the assignment of drivers to cars
and the parking of unassigned cars. The system should display accurate information about drivers,
cars, and parking locations, providing a comprehensive overview of the taxi service's operations.

Feel free to explore additional features or improvements to enhance the
functionality and user experience of the system.
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Taxiservice {
    public void main(String[] args) {

        selectDisplayDriver selectDriver = new selectDisplayDriver();
        selectDisplayCar selectCar = new selectDisplayCar();

        selectDriver.selectDriver();
        selectDriver.displayDriverInfo();

        selectCar.selectCar();
        selectCar.displayCarInfo();
    }

    public static class selectDisplayDriver {
        private String selectedDriver;

        // private string common for the entire class (and all methods in there)
        public void selectDriver() {
            // takes user input for driver
            Scanner selectDriver = new Scanner(System.in);
            System.out.println("What driver do you want to assign: ");
            selectedDriver = selectDriver.next();
        }

        public void displayDriverInfo() {
            // displays driver's information
            DriversDatabase taxidrivers = new DriversDatabase();
            String driverInfo = taxidrivers.getDriversInfo(selectedDriver);
            System.out.println(driverInfo);
        }
    }

    public static class selectDisplayCar {
        private String selectedCar;
        // private string common for the entire class (and all methods in there)

        public void selectCar() {
            // takes user input for car
            Scanner selectCar = new Scanner(System.in);
            System.out.println("What car do you want to assign to this user: ");
            selectedCar = selectCar.next();
        }

        public void displayCarInfo() {
            // displays car information
            CarsDatabase taxicars = new CarsDatabase();
            String taxiInfo = taxicars.getCarInfo(selectedCar);
            System.out.println(taxiInfo);
        }
    }
}


// declaration of a driver
class Driver {
    String name;
    String surname;
    int drivingId;
    // TODO assigned car

    Driver(String name, String surname, int drivingId) {
        this.name = name;
        this.surname = surname;
        this.drivingId = drivingId;
    }

    public String getDriversSurname() {return this.surname;};
    public String getDriversFirstName() {return this.name;};
    public int getDriversDrivingId() {return this.drivingId;};
    // TODO public String assignedCar() {return this.surname;};


    public String driversInfo() {
        return STR."\n Driver's first name is: \{name} \n Driver's last name is: \{surname} \n Their driving id is: \{drivingId}";
    }
}

// drivers database
class DriversDatabase {
    private List<Driver> drivers;

    public DriversDatabase() {
        drivers = new ArrayList<>();
        drivers.add(new Driver("Earnest", "George", 1009848));
        drivers.add(new Driver("Raymond", "Curry", 1105281));
        drivers.add(new Driver("Leroy", "Owen", 1017937));
        drivers.add(new Driver("Marie", "Farmer", 1015657));
        drivers.add(new Driver("Myra", "Burgess", 1091200));
        drivers.add(new Driver("Darrin", "Johnson", 1104769));
        drivers.add(new Driver("Cecil", "Woods", 1105601));
        drivers.add(new Driver("Luz", "Schultz", 1101591));
        drivers.add(new Driver("Eugene", "Patrick", 1035964));
        drivers.add(new Driver("Michelle", "Casey", 1098796));
    }

    public String getDriversInfo (String selectedDriver) {
        for (Driver driver : drivers) {
            if ((driver.getDriversSurname().equalsIgnoreCase(selectedDriver)) || (driver.getDriversFirstName().equalsIgnoreCase(selectedDriver))) {
                return STR."You have selected a driver. \{driver.driversInfo()}";
            }
        }
        return "This driver has not been found. Try again.";
    }
}

// declaration of a car
class Car {
        int make;
        String model;
        String plateNumber;
        // TODO assigned driver

        Car(int make, String model, String plateNumber) {
            this.make = make;
            this.model = model;
            this.plateNumber = plateNumber;
        }

        public String getCarModel() {return this.model;};
        public String getPlateNumber() {return this.plateNumber;};

        public String carInfo() {
        return STR."\n Car model is: \{model} \n Plate number is: \{plateNumber} \n This car was make in:  \{make}";
    }
}

// car database
class CarsDatabase {
        private List<Car> cars;
        public CarsDatabase(){
            cars = new ArrayList<>();
            cars.add(new Car(2020, "Porsche Cayenne", "54377J"));
            cars.add(new Car(2023, "Mitsubishi ASX", "WZL8392"));
            cars.add(new Car(2019, "Alfa Romeo Giulia", "NRC8131"));
            cars.add(new Car(2024, "Ford F-Series", "038 TYL"));
            cars.add(new Car(2008, "Hyundai ix35", "432 DES"));
            cars.add(new Car(2011, "Mazda 6", "9304 GZ"));
            cars.add(new Car(2021, "Toyota Tacoma", "102-OLG"));
            cars.add(new Car(2020, "Jeep Renegade", "964 XTI"));
            cars.add(new Car(2017, "Kia Sportage", "3-51839E"));
            cars.add(new Car(2018, "Lincoln MKZ", "4358 YW"));
        }

    public String getCarInfo (String selectedCar) {
        for (Car car : cars) {

            car.model.replaceAll("\\s", "");
            car.plateNumber.replaceAll("\\s", "");

            if ((car.getCarModel().equalsIgnoreCase(selectedCar)) || (car.getPlateNumber().equalsIgnoreCase(selectedCar))) {
                return STR."You have selected a taxi car for your driver. \{car.carInfo()}";
            }
        }
        return "This taxi car has not been found. Try again.";
    }
}



// declaration of parking
class Parking {
        String locationName;
        boolean availability;
        // TODO list of parked cars

        Parking(String locationName, boolean availability) {
            this.locationName = locationName;
            this.availability = availability;
        }

        public String getParking() {return this.locationName;};
}


    class ParkingDatabase {
        Parking touchdown = new Parking("Touchdown Parking Lot", true);
        Parking grapefruit = new Parking("Grapefruit Parking Garage", false);
        Parking homeDepot = new Parking("The Home Parking Depot Parking Lot", true);
        Parking pelican = new Parking("Pelican Lot", true);
        Parking floridaEve = new Parking("513 S Florida Eve Parking", false);
    }
