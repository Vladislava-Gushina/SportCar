package org.vladislava_g;
public class TestingMachine {
    protected static void launchCar() throws Exception {
        FirstCarAudi firstCarAudi = new FirstCarAudi("Audi", SpecialNumberCar.numberCar(),
                (byte) 5, (byte) 2, (short) 150);

        SecondCarLada secondCarLada = new SecondCarLada("Lada", SpecialNumberCar.numberCar(),
                (byte) 4, (byte) 1, (short) 120);

        MathOperationCar firstMathOperationCar = new MathOperationCar("Audi", SpecialNumberCar.numberCar(),
                (byte) 5, (byte) 2, (short) 150);

        MathOperationCar secondMathOperationCar = new MathOperationCar("Lada", SpecialNumberCar.numberCar(),
                (byte) 4, (byte) 1, (short) 120);

        System.out.println(firstCarAudi.cruiseControl());
        secondCarLada.audioPlayer((float) 0.5f);

        System.out.println("Математические характеристики Audi: ");
        firstMathOperationCar.speedMultiple();
        firstMathOperationCar.fullCar();

        System.out.println("Математические характеристики Lada: ");
        secondMathOperationCar.speedMultiple();
        secondMathOperationCar.fullCar();
    }
}

