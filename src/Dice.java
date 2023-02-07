import java.util.concurrent.ThreadLocalRandom;

public class Dice {


    private int dice = ThreadLocalRandom.current().nextInt(1, 7);

    public void setDice(int dice) {
        this.dice = dice;
    }

    public Dice() { // Konstruktor
        this.dice = dice;
    }

    public int getDice() {
        return dice;
    }
}
