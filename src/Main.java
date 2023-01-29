import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dice d1 = new Dice();
        Dice d2 = new Dice();

        List<Player> players = new ArrayList<>();

        players.add(new Player(200, 20, 50, 10,50, 10));
        players.add(new Player(200, 20, 50, 10,50, 10));

        System.out.println();
        System.out.print("Number of wizards: ");
        int nop = scanner.nextInt();

        if (nop == 1) {
          Player player1 = players.get(0);
        }

        else if (nop == 2) {
            Player player1 = players.get(0);
            Player player2 = players.get(1);
        }


        // storyLine();




    }

    private static void storyLine() {
        System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^");
        System.out.println("On your way to the battle you pass a village where you kan rest and prepare");
    }

}