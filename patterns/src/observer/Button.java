package Observer;

import java.util.List;
import java.util.ArrayList;

public class Button implements EventCreator {
    // храним всех наблюдателей за кнопкой
    private ArrayList<EventObserver> observers;

    // метод для эмуляции нажатия кнпоки
    public void click() {
        System.out.println("Кнопка была нажата, пора оповетить всех тех, кто на меня подписан.");
        notifyObservers();
    }

    public Button() {
        observers = new ArrayList<EventObserver>();
    }

    @Override
    public void addObserver(EventObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(EventObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (EventObserver observer : observers) {
            observer.update();
        }
    }
}
