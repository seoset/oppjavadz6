package Singleton;

public class GamePlayer {
    private static GamePlayer instance;

    // приватный конструктор не позволит создавать экземпляр из-вне
    private GamePlayer() {

    };

    public static GamePlayer getInstance() {
        // если еще не было создано экзмепляр, то создаем, а в противном случае отдаем тот, что был
        if (instance == null) {
            instance = new GamePlayer();
        }

        return instance;
    }

    public void sayHello() {
        System.out.println("Привет! Я одиночка и не сможешь создать больше меня");
    }
}
