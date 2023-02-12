import java.util.ArrayList;
import java.util.List;

public class Players {

    List<Player> playerList = new ArrayList<>();

    public Players() {
        playerList.add(new Player("Wizard of Fire", 100, 20, 10, 20));
        playerList.add(new Player("Wizard of the Deep", 150, 10, 20, 10));
        playerList.add(new Player("Wizard of Woodcraft", 100, 10, 10, 20));
        playerList.add(new Player(" Druid", 200, 5, 30, 20));
        playerList.add(new Player("Wizard of Black Art", 150, 10, 20, 20));
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
}


