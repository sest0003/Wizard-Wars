public class Spell {

    private String name;
    private String decription;

    public Spell(String name, String decription) {
        this.name = name;
        this.decription = decription;
    }

    public Spell(Spell spell) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
