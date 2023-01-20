package Facade;

public class CarFacade {
    private Car car;

    public CarFacade() {
        car = new Car();
    }

    public void startCar() {
        // обьединями все методы в один высокоуровневый интерфейс

        car.startEngine();
        car.checkSensors();
        car.turnOnHeadlights();
        car.turnOnMusic();
    }
}
