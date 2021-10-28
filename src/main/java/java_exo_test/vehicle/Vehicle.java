package java_exo_test;

abstract class Vehicle {
    protected String brand;
    protected int doors;
    protected int wheels;

    public Vehicle(String brand, int doors, int wheels) {
        this.brand = brand;
        this.doors = doors;
        this.wheels = wheels;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getWheels() {
        return this.wheels;
    }
}