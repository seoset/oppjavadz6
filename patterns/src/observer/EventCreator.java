package Observer;

public interface EventCreator {
    // добавление наблюдателя, удаление, оповещение
    public void addObserver(EventObserver observer);
    public void removeObserver(EventObserver observer);
    public void notifyObservers();
}
