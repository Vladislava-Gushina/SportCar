package org.vladislava_g;
public class FirstCarAudi extends Car{
    public FirstCarAudi(String brandeCar, String numberCar, byte capacity, byte masCar, short speedCar) {
        super(brandeCar, numberCar, capacity, masCar, speedCar);

    }
    protected String cruiseControl(){
        short maxSpeed = 250;
        short minSpeed = 130;
        if(getSpeedCar() > maxSpeed){
            short normalSpeed = --maxSpeed;
       } else if (getSpeedCar() < minSpeed) {
            short normalSpeed = ++minSpeed;
       }
        System.out.println("Первая машина, характеристики: " + "\n" + "Марка " + getBrandeCar() +
                ", номер машины: "  + getNumberCar() + ", вместимось: " + getCapacity() +
                ", масса машины (в тоннах): " + getMasCar() + ", постоянная скорость: " + getSpeedCar());
        return getBrandeCar();
    }
}
