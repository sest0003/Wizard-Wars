public class Wizard extends Player{

    String name;

    public Wizard(String name) {
        this.name = name;
    }

    public Wizard(int gold, int cloak, int knowledge, int tower, String name) {
        //super(gold, cloak, knowledge, tower);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                '}';
    }
}
