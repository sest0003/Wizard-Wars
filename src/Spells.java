import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;



public class Spells {

    List<Spell> fireSpells = new ArrayList<>();
    List<Spell> waterSpells = new ArrayList<>();
    List<Spell> SummonSpells = new ArrayList<>();
    List<Spell> poisonSpells = new ArrayList<>();
    List<Spell> WoodCraftSpells = new ArrayList<>();


    public void Getfires() {


        fireSpells.add(new Spell("Dragon Blood"));
        fireSpells.add(new Spell("Fire Ball"));
        System.out.println(fireSpells.get(0).getName());
        }



}
