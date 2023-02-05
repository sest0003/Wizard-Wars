import java.util.ArrayList;
import java.util.List;



public class Spells {

    List<Spell> woodCraftSpells = new ArrayList<>();

    List<Spell> poisonSpells = new ArrayList<>();

    List<Spell> summonSpells = new ArrayList<>();

    List<Spell> waterSpells = new ArrayList<>();

    List<Spell> spells = new ArrayList<>();

    List<Spell> fireSpells = new ArrayList<>();


    public void setSpells() {


        fireSpells.add(new Spell("Dragon Blood"));
        fireSpells.add(new Spell("Fire Ball"));


        waterSpells.add(new Spell("Calling the deep"));


        summonSpells.add(new Spell("The Summon of Demons"));


        poisonSpells.add(new Spell("The black Leafs of Dandun"));


        woodCraftSpells.add(new Spell("Summon the Oaks"));

        System.out.println();

        System.out.println("1: " + fireSpells.get(0).getName());
        System.out.println("2: " + poisonSpells.get(0).getName());
        System.out.println("3: " + waterSpells.get(0).getName());
        System.out.println("4: " + woodCraftSpells.get(0).getName());
        System.out.println("5: " + summonSpells.get(0).getName());

    }

    public List<Spell> getWoodCraftSpells() {
        for (Spell wood : fireSpells) {
            System.out.println(wood.getName());
        }
        return woodCraftSpells;
    }

    public List<Spell> getPoisonSpells() {
        for (Spell p : fireSpells) {
            System.out.println(p.getName());
        }
        return poisonSpells;
    }

    public List<Spell> getSummonSpells() {
        for (Spell summon : fireSpells) {
            System.out.println(summon.getName());
        }
        return summonSpells;
    }

    public List<Spell> getWaterSpells() {
        for (Spell w : fireSpells) {
            System.out.println(w.getName());
        }
        return waterSpells;
    }


    public List<Spell> getFireSpells() {
        for (Spell f : fireSpells) {
            System.out.println(f.getName());

        }
        return fireSpells;
    }
}




