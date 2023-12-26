package HomeWork_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    @DisplayName("Test: Car is an instance of Vehicle")
    void testInstanceOf() {
        Car car = new Car("Ford", "Focus", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Test: the object of Car has 4 wheels")
    void getNumWheelsCar() {
        Car car = new Car("Ford", "Focus", 2010);
        assertTrue(car.getNumWheels() == 4);
    }

    @Test
    @DisplayName("Test: the object of Motorcycle has 2 wheels")
    void getNumWheelsMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Vulcan", 2012);
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    @Test
    @DisplayName("Test: the speed of object of Car in test driving mode is 60")
    void testDriveCar() {
        Car car = new Car("Ford", "Focus", 2010);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    @Test
    @DisplayName("Test: the speed of object of Motorcycle in test driving mode is 75")
    void testDriveMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Vulcan", 2012);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    @Test
    @DisplayName("Test: the speed of object of Car in parking driving mode is 0")
    void parkCar() {
        Car car = new Car("Ford", "Focus", 2010);
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    @Test
    @DisplayName("Test: the speed of object of Motorcycle in parking driving mode is 0")
    void parkMotorcycle() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Vulcan", 2012);
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}