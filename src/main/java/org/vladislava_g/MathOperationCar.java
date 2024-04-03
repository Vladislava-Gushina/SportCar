package org.vladislava_g;

public class MathOperationCar extends Car{

    public MathOperationCar(String brandeCar, String numberCar, byte capacity, byte masCar, short speedCar) {
        super(brandeCar, numberCar, capacity, masCar, speedCar);
    }

    protected short speedMultiple(){
        short maxSpeed = (short) Math.pow(getSpeedCar(), 2);
        System.out.println(maxSpeed % 2 == 0 ? " скорость кратна 2 " : " скорость не кратна 2 ");
        return maxSpeed;
    }
    protected short fullCar(){
        if(getCapacity() > 1){
            short carWithPeople = (short) ((getCapacity() * 60) + (getMasCar() * 1000));
            System.out.println("Масса машины заполненная людьми (в килограммах): " + carWithPeople);
        }
        return 0;
    }
}
