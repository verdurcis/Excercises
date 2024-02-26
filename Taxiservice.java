package Excercises;

/*

Project Tasks:

1. Create a class for managing drivers, including attributes such as name, driver ID, and assigned car.
2. Develop a class for managing cars, incorporating attributes such as make, model, plate number, and assigned driver.
3. Implement a class for managing parking locations, comprising attributes such as location name, available parking space, and a list of parked cars.
4. Demonstrate the functionality to assign drivers to specific cars within the system.
5. Ensure that any cars not assigned to drivers are automatically assigned to available parking locations.
6. Develop a user-friendly interface for displaying driver details, car information, and parking location status.

Expected Output:
Upon completion of the project, you should be able to showcase a functional
Car Fleet Management System that effectively handles the assignment of drivers to cars
and the parking of unassigned cars. The system should display accurate information about drivers,
cars, and parking locations, providing a comprehensive overview of the taxi service's operations.

Feel free to explore additional features or improvements to enhance the
functionality and user experience of the system.
 */





public class Taxiservice {
    public void main(String[] args) {
        // taxi
        String year;
        String plateNumber;
        String assignedDriver;

        // taxi driver
        String firstName;
        String lastName;
        int driversLicence;

        // parking spot
        String location;
        String parkingSpace;
        String [] parkedCars;

        TaxiCar (String year, String plateNumber, String assignedDriver) {
            this.year = year;
            this.plateNumber = plateNumber;
            this.assignedDriver = assignedDriver;
        }
    }

    class TaxiCar (String year, String plateNumber, String assignedDriver) {
        this.year = year;
        this.plateNumber = plateNumber;
        this.assignedDriver = assignedDriver;
    }

    class TaxiDriver (String firstName, String lastName, int driversLicence) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.driversLicence = driversLicence;
        //this.assignedCar = assignedCar;
    }

    class TaxiParkingLocation (String location, String parkingSpace, String parkedCars) {
        this.location = location;
        this.parkingSpace = parkingSpace;
        //this.parkedCars = parkedCars;
    }

}
