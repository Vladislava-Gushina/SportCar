package org.vladislava_g;

import javax.sound.sampled.*;
import java.io.File;

public class SecondCarLada extends Car{
    public SecondCarLada(String brandeCar, String numberCar, byte capacity, byte masCar, short speedCar) {
        super(brandeCar, numberCar, capacity, masCar, speedCar);
    }

    public void audioPlayer(float volume) throws Exception {
        File soundFile = new File("LOWA.wav");
        AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);

        Clip clip = AudioSystem.getClip();
        clip.open(ais);

        FloatControl floatControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        floatControl.setValue(volume);

        try {
            System.out.println("Вторая машина, характеристики: " + "\n" + "Марка " + getBrandeCar() +
                    ", номер машины: "  + getNumberCar() + ", вместимось: " + getCapacity() +
                    ", масса машины (в тоннах): " + getMasCar() + ", постоянная скорость: " + getSpeedCar());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        clip.setFramePosition(0);
        clip.start();
        System.out.println("Плеер включен ");

        Thread.sleep(clip.getMicrosecondLength() / 100000);
        clip.stop();
        System.out.println("Плеер выключен ");

        clip.close();
    }
}
