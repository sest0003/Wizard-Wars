public class Spell {
    private String name;
    private int fire =   1;
    private int water =  2;
    private int poison = 3;
    private int wood =   4;
    private int  summon =5;



    public Spell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFire() {
        return fire;
    }

    public int getWater() {
        return water;
    }

    public int getPoison() {
        return poison;
    }

    public int getWood() {
        return wood;
    }

    public int getSummon() {
        return summon;
    }
}
