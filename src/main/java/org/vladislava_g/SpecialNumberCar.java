package org.vladislava_g;

import java.util.Random;
public class SpecialNumberCar {
    static String numberCar(){
        char[] number = {'C', 'D', 'V', 'A'};
        char[] resulNumber = new char[6];
        for (int i = 0; i < 6; i++) {
            resulNumber[i] = number[new Random().nextInt(number.length)];
            String stringResult = new String(resulNumber);
        }
        return new String(resulNumber);

    }
    static String numberCharacters(){
        int numCharacters = numberCar().length();
        System.out.println(" Количество символов в номере машины: " + numCharacters);
        System.out.println(" Номер машины: " + numCharacters);
        return new String();
    }
}
