import java.util.ArrayList;
import java.util.List;

public class BattleOfDor {

  static Player player1 = new Player(200, 20, 10, 10);
  static Player player2 = new Player(200, 20, 20, 10);

  static String player1Name = "Druid of Gord";
  static String player2Name = "Wizard of Oaks";

  static ArrayList<String> spellsP1 = new ArrayList<>();
  static ArrayList<String> spellsP2 = new ArrayList<>();

  static Dice dice1P1 = new Dice();
  static Dice dice2P1 = new Dice();
  static Dice dice3P1 = new Dice();

  static Dice dice1P2 = new Dice();
  static Dice dice2P2 = new Dice();
  static Dice dice3P2 = new Dice();

  public void storyLine() {


    roundOne();


  }


  private void roundOne() {


    Spells spells = new Spells();
    spells.setSpells();

    int sumOfP1 = 0;
    sumOfP1 += player1.getKnowledge();
    sumOfP1 += player1.getGold();
    sumOfP1 += player1.getTower();
    sumOfP1 += player1.getCloak();

    int sumOfP2 = 0;
    sumOfP2 += player2.getKnowledge();
    sumOfP2 += player2.getGold();
    sumOfP2 += player2.getTower();
    sumOfP2 += player2.getCloak();


    System.out.print(player1Name + "; Choose your first spell: ");

    int numP1 = Main.scanner.nextInt();

    if (numP1 == 1) {
      spells.getFireSpells();
      spellsP1.add(spells.fireSpells.get(0).getName());

    } else if (numP1 == 2) {
      spells.getPoisonSpells();
      spellsP1.add(spells.poisonSpells.get(0).getName());

    } else if (numP1 == 3) {
      spells.getWaterSpells();
      spellsP1.add(spells.waterSpells.get(0).getName());

    } else if (numP1 == 4) {
      spells.getWoodCraftSpells();
      spellsP1.add(spells.woodCraftSpells.get(0).getName());

    } else if (numP1 == 5) {
      spells.getSummonSpells();
      spellsP1.add(spells.summonSpells.get(0).getName());
    }


    System.out.print(player2Name + "; Choose your first spell: ");
    int numP2 = Main.scanner.nextInt();

    if (numP2 == 1) {
      spells.getFireSpells();
      spellsP2.add(spells.fireSpells.get(0).getName());

    } else if (numP2 == 2) {
      spells.getPoisonSpells();
      spellsP2.add(spells.poisonSpells.get(0).getName());

    } else if (numP2 == 3) {
      spells.getWaterSpells();
      spellsP2.add(spells.waterSpells.get(0).getName());

    } else if (numP2 == 4) {
      spells.getWoodCraftSpells();
      spellsP2.add(spells.woodCraftSpells.get(0).getName());


    } else if (numP2 == 5) {
      spells.getSummonSpells();
      spellsP2.add(spells.summonSpells.get(0).getName());

    }

    System.out.print(player1Name + "; Choose your second spell: ");

    int numP12 = Main.scanner.nextInt();

    if (numP12 == 1) {
      spells.getFireSpells();
      spellsP1.add(spells.fireSpells.get(0).getName());


    } else if (numP12 == 2) {
      spells.getPoisonSpells();
      spellsP1.add(spells.poisonSpells.get(0).getName());

    } else if (numP12 == 3) {
      spells.getWaterSpells();
      spellsP1.add(spells.waterSpells.get(0).getName());

    } else if (numP12 == 4) {
      spells.getWoodCraftSpells();
      spellsP1.add(spells.woodCraftSpells.get(0).getName());

    } else if (numP12 == 5) {
      spells.getSummonSpells();
      spellsP1.add(spells.summonSpells.get(0).getName());

    }


    System.out.print(player2Name + "; Choose your second spell: ");
    int numP22 = Main.scanner.nextInt();


    if (numP22 == 1) {
      spells.getFireSpells();
      spellsP2.add(spells.fireSpells.get(0).getName());


    } else if (numP22 == 2) {
      spells.getPoisonSpells();
      spellsP2.add(spells.poisonSpells.get(0).getName());

    } else if (numP22 == 3) {
      spells.getWaterSpells();
      spellsP2.add(spells.waterSpells.get(0).getName());

    } else if (numP22 == 4) {
      spells.getWoodCraftSpells();
      spellsP2.add(spells.woodCraftSpells.get(0).getName());


    } else if (numP22 == 5) {
      spells.getSummonSpells();
      spellsP2.add(spells.summonSpells.get(0).getName());
    }

    System.out.println();

    System.out.println();
    System.out.println(player1Name + " Choice:\n" + spellsP1);
    System.out.println("Make your move, 1 or 2: ");
    int choiceP1 = Main.scanner.nextInt();


    System.out.println(player2Name + " Choice:\n" + spellsP2);
    System.out.println("Make your move, 1 or 2: ");
    int choiceP2 = Main.scanner.nextInt();

    if (choiceP1 == 1 && choiceP2 == 1) {

      String s1 = spellsP1.get(0);
      String s2 = spellsP2.get(0);

      System.out.println("\n\n");
      System.out.println(player1Name + ": " + "    VS     " + player2Name + " resources: "
              + "\nGold: " + player1.getGold() + "                           " + "Gold: " + player2.getGold()
              + "\nTower: " + player1.getTower() + "                           " + "Tower: " + player2.getTower()
              + "\nKnowledge: " + player1.getKnowledge() + "                       " + "Knowledge: " + player2.getKnowledge()
              + "\nCloak: " + player1.getCloak() + "                           " + "Cloak: " + player2.getCloak()
              + "\nTotal: " + sumOfP1 + "                          " + "Total: " + sumOfP2);
      System.out.println();
      System.out.println(s1 + "                        " + s2);
      System.out.println();

      //Dices
      System.out.print(player1Name + ": \nPress 1 to roll the dice: ");
      Main.scanner.nextInt();
      System.out.println(dice1P1.getDice());
      System.out.println();

      System.out.print(player2Name + ": \nPress 1 to roll the dice: ");
      Main.scanner.nextInt();
      System.out.println(dice1P2.getDice());
      System.out.println();

      //Result
      System.out.println(player1Name + " cast : [" + s1 + "] with [+" + dice1P1.getDice() + "]");
      System.out.println(player2Name + " cast : [" + s2 + "] with [+" + dice1P2.getDice() + "]");
      //Result
      System.out.println(sumOfP1);
      System.out.println(sumOfP2);

      //IF fire
      if (s1.equals(spells.fireSpells.get(0).getName())) {
        sumOfP1 += 4;
        System.out.println(player1Name + ", you have casted a fire-spell, press 1 to roll a third dice: ");
        Main.scanner.nextInt();
        System.out.println(dice3P1.getDice());
        if (dice3P1.getDice() <= 3) {
          dice3P1.setDice(0);
          System.out.println("You lost control over the fire-spell, the extra dice is now lost");
        } else {
          System.out.println("Good job!, +" + dice3P1.getDice());
        }
      }
          if (s2.equals(spells.fireSpells.get(0).getName())) {
            sumOfP2 += 4;
            System.out.println(player2Name + ", you have casted a fire-spell, press 1 to roll a third dice: ");
            Main.scanner.nextInt();
            if (dice3P2.getDice() <= 3) {
              dice3P2.setDice(0);
              System.out.println("You lost control over the fire-spell, the extra dice is now lost");
            } else {
              System.out.println("Good job!, +" + dice3P2.getDice());
            }
          }
            //If water
            if (s2.equals(spells.waterSpells.get(0).getName())) {
              int diceEffectP1 = (dice1P1.getDice() + dice3P1.getDice()) / 2;
              System.out.println(diceEffectP1);
              System.out.println(player2Name + " has cast a water-spell!, your dice is now worth half [" + diceEffectP1+ "]");
            }

            if (s1.equals(spells.waterSpells.get(0).getName())) {
              int diceEffectP2 = (dice1P2.getDice() + dice3P2.getDice()) / 2;
              System.out.println(player1Name + " has cast a water-spell!, your dice is now worth half ["+ diceEffectP2 + "]");
            }

          }
          System.out.println(sumOfP1);
          System.out.println(sumOfP2);


        }
      }







