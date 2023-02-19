import java.util.ArrayList;
import java.util.List;

public class Spells {

    public String KeywordP1;


    List<Spell> woodCraftSpells = new ArrayList<>();

    List<Spell> poisonSpells = new ArrayList<>();

    List<Spell> summonSpells = new ArrayList<>();

    List<Spell> waterSpells = new ArrayList<>();

    List<Spell> fireSpells = new ArrayList<>();


    List<Spell> spellsOfP1 = new ArrayList<>();

    List<Spell> spellsOfP2 = new ArrayList<>();

    List<Spell> spellsOfP3 = new ArrayList<>();


    List<Spell> spellsOfC1 = new ArrayList<>();

    List<Spell> spellsOfC2 = new ArrayList<>();

    List<Spell> spellsOfC3 = new ArrayList<>();



    public Spells() {


        fireSpells.add(new Spell("\n^*^*^*^* Dragon Blood ^*^*^*^*", "\nDescription:\n+ 4 in total\n2 extra dice, if you roll over 3\nDecrease your opponent dice by half, if they use a water-spell.\n+ 10 Cloak"));
        fireSpells.add(new Spell("\n^*^*^*^* Forest Fire ^*^*^*^*", "fkfkf"));

        waterSpells.add(new Spell("\n^*^*^*^* Calling the deep ^*^*^*^*\n", "\nDescription:\n+5 in total\n1x extra dice\nDecrease your opponent dice by half, if they use a fire-spell."));


        summonSpells.add(new Spell("^*^*^*^* The Summon of Demons ^*^*^*^*", "Description:\n+3 in total\n2x extra dice, but if you roll double or both dice are 3 or under, you lose the extra dice.\n +50 Gold"));


        poisonSpells.add(new Spell("^*^*^*^* The black Leafs of Dandun ^*^*^*^*", "Description:\n+2 in total\nDecrease your opponent dice by half regardless what spells the opponent plays.\n+10 Knowledge"));


        woodCraftSpells.add(new Spell("^*^*^*^* Summon the Oaks ^*^*^*^*", "Description:\n +4 in total\n1x extra dice, if you roll 2, 4 or 6 \nDecrease your opponent dice by half, if they roll 4 or over.\n+2 Cloak"));

    }

    public void bocHord() {

        System.out.println("Enter your keyword to get access to boc-hard:");
        KeywordP1 = Main.scanner.nextLine();


        do{
            System.out.println();
            System.out.println("Choose a book of spells: ");
            System.out.println();
            displayMenu();

            int option=getOption();

            if (option == 1) {
                int count = 0;
                for (Spell f : fireSpells) {
                    count++;
                    System.out.println("             "+count + "." + f.getName() + f.getdecription());
                }
                System.out.println();
                System.out.println("To buy the spell: Enter the number of the spell. ");
                System.out.println("To exit press [9].");
                int c1 = Main.scanner.nextInt();

                if (c1 == 1 && KeywordP1.equals("fire")) {
                spellsOfP1.add(fireSpells.get(0));

                } else if (c1 == 2 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(fireSpells.get(1));
                }
                else if (c1 == 9 && KeywordP1.equals("fire")) {
                    break;
                }
            }

            if  (option == 2) {
                int count = 0;
                for (Spell w : waterSpells) {
                    count++;
                    System.out.println("             "+count + "." + w.getName() + w.getdecription());
                }
                System.out.println();
                System.out.println("To buy the spell: Enter the number of the spell. ");
                System.out.println("To exit press [9].");
                int c1 = Main.scanner.nextInt();

                if (c1 == 1 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(waterSpells.get(0));

                } else if (c1 == 2 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(waterSpells.get(1));
                }
                else if (c1 == 9 && KeywordP1.equals("fire")) {
                    break;
                }
            }
            if  (option == 3) {
                int count = 0;
                for (Spell p : poisonSpells) {
                    count++;
                    System.out.println("             "+count + "." + p.getName() + p.getdecription());
                }
                System.out.println();
                System.out.println("To buy the spell: Enter the number of the spell. ");
                System.out.println("To exit press [9].");
                int c1 = Main.scanner.nextInt();

                if (c1 == 1 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(poisonSpells.get(0));

                } else if (c1 == 2 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(poisonSpells.get(1));
                }
                else if (c1 == 9 && KeywordP1.equals("fire")) {
                    break;
                }
            }

            if  (option == 4) {
                int count = 0;
                for (Spell wc : woodCraftSpells) {
                    count++;
                    System.out.println("             "+count + "." + wc.getName() + wc.getdecription());
                }
                System.out.println();
                System.out.println("To buy the spell: Enter the number of the spell. ");
                System.out.println("To exit press [9].");
                int c1 = Main.scanner.nextInt();

                if (c1 == 1 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(woodCraftSpells.get(0));

                } else if (c1 == 2 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(woodCraftSpells.get(1));
                }
                else if (c1 == 9 && KeywordP1.equals("fire")) {
                    break;
                }
            }

            if  (option == 5) {
                int count = 0;
                for (Spell s : summonSpells) {
                    count++;
                    System.out.println("             "+count + "." + s.getName() + s.getdecription());
                }
                System.out.println();
                System.out.println("To buy the spell: Enter the number of the spell. ");
                System.out.println("To exit press [9].");
                int c1 = Main.scanner.nextInt();

                if (c1 == 1 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(summonSpells.get(0));

                } else if (c1 == 2 && KeywordP1.equals("fire")) {
                    spellsOfP1.add(summonSpells.get(1));
                }
                else if (c1 == 9 && KeywordP1.equals("fire")) {
                    break;
                }
            }

            else if (option == 6) { System.out.println("Exiting....."); break; }


        } while(true);

    }


    public Spell getWood() {
        for (Spell wood : woodCraftSpells) {
                return wood;
        }
        return null;
    }


    public List<Spell> getWoodCraftSpells() {
        return woodCraftSpells;
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
    private static void displayMenu() {
        System.out.println();
        System.out.println("^*^*^*^*  boc-hord  ^*^*^*^*");
        System.out.println();
        System.out.println("1: Spells of Fire");
        System.out.println("2: Spells of Water");
        System.out.println("3: Spells of Poison");
        System.out.println("4:  Spells of Woodcraft");
        System.out.println("5: Spells of Summoning");
        System.out.println("6: Exit");
    }

    static int getOption() {
        System.out.print("\nEnter option: ");
        int option = Main.scanner.nextInt();
        Main.scanner.nextLine();
        System.out.println();
        return option;
    }


}




