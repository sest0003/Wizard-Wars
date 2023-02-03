import java.util.concurrent.ThreadLocalRandom;

public class Dice {


    private int dice = ThreadLocalRandom.current().nextInt(1, 7);



    public Dice() { // Konstruktor
        this.dice = dice;
    }

    public int getDice() {
        return dice;
    }
}
