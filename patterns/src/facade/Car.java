package Facade;

public class Car {
    // различные методы, которые эмулируют внутренную часть работы машины
    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void checkSensors() {
        System.out.println("Проверены все датчики");
    }

    public void turnOnHeadlights() {
        System.out.println("Включены фары");
    }

    public void turnOnMusic() {
        System.out.println("Включена музыка");
    }
}
