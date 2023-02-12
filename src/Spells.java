import java.util.ArrayList;
import java.util.List;



public class Spells {

    List<Spell> woodCraftSpells = new ArrayList<>();

    List<Spell> poisonSpells = new ArrayList<>();

    List<Spell> summonSpells = new ArrayList<>();

    List<Spell> waterSpells = new ArrayList<>();

    List<Spell> spells = new ArrayList<>();

    List<Spell> fireSpells = new ArrayList<>();

    public List<Spell> getWoodCraftSpells() {
        return woodCraftSpells;
    }

    public Spells() {


        fireSpells.add(new Spell("Dragon Blood", "fkfkf"));
        fireSpells.add(new Spell("Forest Fire", "fkfkf"));

        waterSpells.add(new Spell("Calling the deep", "dkdkd"));


        summonSpells.add(new Spell("The Summon of Demons", "dldld"));


        poisonSpells.add(new Spell("The black Leafs of Dandun", "dkdkd"));


        woodCraftSpells.add(new Spell("Summon the Oaks", "gkgkg"));




    }


    public Spell getWood() {
        for (Spell wood : woodCraftSpells) {

                return wood;
        }
        return null;
    }



    public List<Spell> getPoisonSpells() {
        for (Spell p : fireSpells) {
          p.getName();
        }
        return poisonSpells;
    }

    public List<Spell> getSummonSpells() {
        for (Spell summon : fireSpells) {
            summon.getName();
        }
        return summonSpells;
    }

    public List<Spell> getWaterSpells() {
        for (Spell w : fireSpells) {
            w.getName();
        }
        return waterSpells;
    }

    public List<Spell> getFireSpells() {
        for (Spell f : fireSpells) {
            f.getName();
            }
        return fireSpells;
    }


}




