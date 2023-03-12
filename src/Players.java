import java.util.ArrayList;
import java.util.List;

public class Players {

    List<Player> playerList = new ArrayList<>();

    public Players() {
        playerList.add(new Player("Wizard of Fire", "^*^*^*^* Wizard of Fire ^*^*^*^*\n\n" +
                "Gold: 100\nTower: 20\nKnowledge: 10\nCloak: 20\nDouble the effect of Firespell\n\n" +
                " CV:\n Normally a Fire Wizard is very impulsive and not so smart, that´s why the cashflow is low and the knowledge is lacking\n " +
                "But a Wizard of Fire needs a big and strong tower to explore the effect of firespells, and also an High-cloak for protection against heat and explosions.",
                100, 20, 10, 20));


        playerList.add(new Player("Wizard of the Deep","Deep", 150, 10, 20, 10));

        playerList.add(new Player("Wizard of Woodcraft","Wood", 100, 10, 10, 20));

        playerList.add(new Player(" Druid","poison", 200, 5, 30, 20));

        playerList.add(new Player("Wizard of Black Art","Black", 150, 10, 20, 20));

    }

    public List<Player> getPlayerList() {
        return playerList;
    }


}


