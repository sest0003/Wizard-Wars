public class Spell {

    private String name;
    private String decription;
    private int spellGroup;
    private int id;

    public Spell(String name, String decription, int spellGroup, int id) {
        this.spellGroup = spellGroup;
        this.name = name;
        this.decription = decription;
        this.id = id;
    }

    public int getSpellGroup() {
        return spellGroup;
    }

    public void setSpellGroup(int spellGroup) {
        this.spellGroup = spellGroup;
    }

    public Spell(Spell spell) {
    }

    public String getDecription() {
        return decription;
    }

    public int getId() {
        return spellGroup;
    }

    public void setId(int id) {
        this.spellGroup = id;
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
