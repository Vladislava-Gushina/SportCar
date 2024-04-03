package org.vladislava_g;

public class Car {
    private  String brandeCar;
    private  String numberCar;
    private  byte capacity;
    private  byte masCar;
    private  short speedCar;

    public Car(String brandeCar, String numberCar, byte capacity, byte masCar, short speedCar) {
        this.brandeCar = brandeCar;
        this.numberCar = String.valueOf(numberCar);
        this.capacity = capacity;
        this.masCar = masCar;
        this.speedCar = speedCar;
    }

    public  String getBrandeCar() {
        return brandeCar;
    }

    public String getNumberCar() {
        return numberCar;
    }

    public byte getCapacity() {
        return capacity;
    }

    public byte getMasCar() {
        return masCar;
    }

    public short getSpeedCar() {
        return speedCar;
    }
}
