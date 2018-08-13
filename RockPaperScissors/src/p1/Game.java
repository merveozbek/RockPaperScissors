package p1;

public class Game {

    int value;
    String player;

    public Game() {
    }

    public Game(int value, String player) {
        this.value = value;
        this.player = player;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
