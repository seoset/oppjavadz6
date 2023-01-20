import Facade.FacadeExample;
import Observer.ObserverExample;
import Singleton.SingletonExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример работы паттера Одиночка");
        SingletonExample.start();

        System.out.println("\nПример работы паттера Наблюдатель");
        ObserverExample.start();

        System.out.println("\nПример работы паттера Фасад");
        FacadeExample.start();
    }
}