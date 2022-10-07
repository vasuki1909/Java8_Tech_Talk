package interface_java8;

public interface Player {
    default void play(){
        System.out.println("I can play");
    }
    void run();

}
class BaseBallPlayer implements Player{

    @Override
    public void run() {
        System.out.println("I can run");
    }
}
class Demo {
    public static void main(String[] args) {
        Player player = new BaseBallPlayer();
        player.play();
        player.run();
    }
}

