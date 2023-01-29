public class Player {

    private int gold;
    private int spells;
    private int armor;
    private int attack;
    private int knowledge;
    private int tower;

    public Player(int gold, int spells, int armor, int attack, int knowledge, int tower) {
        this.gold = gold;
        this.spells = spells;
        this.armor = armor;
        this.attack = attack;
        this.knowledge = knowledge;
        this.tower = tower;
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

    public int getSpells() {
        return spells;
    }

    public void setSpells(int spells) {
        this.spells = spells;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(int knowledge) {
        this.knowledge = knowledge;
    }


    @Override
    public String toString() {
        return "Player{" +
                "gold=" + gold +
                ", spells=" + spells +
                ", armor=" + armor +
                ", attack=" + attack +
                ", knowledge=" + knowledge +
                '}';
    }
}
