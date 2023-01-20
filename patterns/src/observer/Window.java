package Observer;

public class Window implements EventObserver{
    public Button button;

    public Window() {
        button = new Button();
        // подписываемся на кнопку, при изменении чего-то в ней, нас оповестят
        button.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Меня оповестили о том, что кнопка нажали!");
    }
}
