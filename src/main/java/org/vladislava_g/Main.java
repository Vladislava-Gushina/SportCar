package org.vladislava_g;

public class Main {
    public static void main(String[] args) {
        try {
            TestingMachine.launchCar();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}