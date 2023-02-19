import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Computers {

    List<Player> computerList = new ArrayList<>();

    public void setCPlayer(){
        int compDice1 = ThreadLocalRandom.current().nextInt(1, 5);
        int compDice2 = ThreadLocalRandom.current().nextInt(1, 5);
        int compDice3 = ThreadLocalRandom.current().nextInt(1, 5);

       //C1
        if (compDice1 == 1) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(0));
        }

        else if (compDice1 == 2) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(1));
        }

        else if (compDice1 == 3) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(2));
        }

        else if (compDice1 == 4) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(3));
        }

        else if (compDice1 == 5) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(4));
        }

        //c2

        if (compDice2 == 1) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(0));
        }

        else if (compDice2 == 2) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(1));
        }

        else if (compDice2 == 3) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(2));
        }

        else if (compDice2 == 4) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(3));
        }

        else if (compDice2 == 5) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(4));
        }

        //C3
        if (compDice1 == 1) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(0));
        }

        else if (compDice3 == 2) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(1));
        }

        else if (compDice3 == 3) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(2));
        }

        else if (compDice3 == 4) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(3));
        }

        else if (compDice3 == 5) {
            Players pc1 = new Players();
            computerList.add(pc1.playerList.get(4));
        }
    }




}

