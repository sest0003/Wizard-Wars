public class Player {

    private int gold;
    private int cloak;
    private int knowledge;
    private int tower;

    @Override
    public String toString() {
        return "Player{" +
                "gold=" + gold +
                ", cloak=" + cloak +
                ", knowledge=" + knowledge +
                ", tower=" + tower +
                '}';
    }

    public Player() {

    }

    public Player(int gold, int cloak, int knowledge, int tower) {
        this.gold = gold;
        this.tower = tower;
        this.knowledge = knowledge;
        this.cloak = cloak;
    }



    public int getTower() {
        return tower;
    }

    public void setTower(int tower) {
        this.tower = tower;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }

    public int getCloak() {
        return cloak;
    }

    public void setCloak(int cloak) {
        this.cloak = cloak;
    }


}
