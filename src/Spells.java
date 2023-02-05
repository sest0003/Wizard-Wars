import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;



public class Spells {

    List<Spell> fireSpells = new ArrayList<>();
    List<Spell> waterSpells = new ArrayList<>();
    List<Spell> summonSpells = new ArrayList<>();
    List<Spell> poisonSpells = new ArrayList<>();
    List<Spell> woodCraftSpells = new ArrayList<>();


    public void getfires() {

        fireSpells.add(new Spell("Dragon Blood"));
        fireSpells.add(new Spell("Fire Ball"));
        System.out.println(fireSpells.get(0).getName());
        }


    public void getPoison() {

        poisonSpells.add(new Spell("The black Leafs of Gordi Creek"));

        System.out.println(poisonSpells.get(0).getName());
    }


    public void getWater() {

        waterSpells.add(new Spell("Calling the deep"));

        System.out.println(waterSpells.get(0).getName());
    }

    public void getWood() {

        woodCraftSpells.add(new Spell("Summon the Oaks"));

        System.out.println(woodCraftSpells.get(0).getName());
    }

    public void getSummon() {

        summonSpells.add(new Spell("Summon the Demon"));

        System.out.println(summonSpells.get(0).getName());
    }


}
