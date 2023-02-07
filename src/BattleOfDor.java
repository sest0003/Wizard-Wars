import java.util.ArrayList;
import java.util.List;

public class BattleOfDor {

  static String player1Name = "Druid of Gord";
  static String player2Name = "Wizard of Oaks";

  ArrayList<String> spellsP1 = new ArrayList<>();
  ArrayList<String> spellsP2 = new ArrayList<>();

  public void storyLine() {

    Dice dice1P1 = new Dice();
    Dice dice2P1 = new Dice();

    Dice dice1P2 = new Dice();
    Dice dice2P2 = new Dice();


    Player player1 = new Player(200, 20, 10, 10);
    Player player2 = new Player(200, 20, 20, 10);


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


    System.out.println(sumOfP1);

    System.out.println(sumOfP2);


    spellChoice();

    System.out.println(spellsP1);
    System.out.println();
    System.out.println(player1Name + " Choice:\n" + spellsP1);
    System.out.println("Make your move, 1 or 2: ");
    int choiceP1 = Main.scanner.nextInt();

    System.out.println(spellsP1);
    System.out.println(player2Name + " Choice:\n" + spellsP1);
    System.out.println("Make your move, 1 or 2: ");
    int choiceP2 = Main.scanner.nextInt();



    if (choiceP1 == 1 && choiceP2 == 1) {

      String s1 = spellsP1.get(0);
      String s2 = spellsP2.get(0);

      System.out.println("\n\n");
      System.out.println(player1Name + " resources: "+"    VS     " + player2Name + " resources: "
              + "\nGold: " + player1.getGold()  +     "                           " + "Gold: " + player2.getGold()
              + "\nTower: " + player1.getTower() +"                           " + "Tower: " + player2.getTower()
              + "\nKnowledge: " + player1.getKnowledge() +"                       " + "Knowledge: " + player2.getKnowledge()
              + "\nCloak: " + player1.getCloak() +"                           " + "Cloak: " + player2.getCloak()
              + "\nTotal: " + sumOfP1 + "                          " + "Total: " + sumOfP2);
      System.out.println(s1 +"                        " + s2);


      System.out.println();
      System.out.println(s1 + " VS " + s2);


    }


    System.out.print(player1Name + ": \nPress 1 to roll the dice: ");
    Main.scanner.nextInt();
    System.out.println(dice1P1.getDice());

    System.out.print(player2Name + ": \nPress 1 to roll the dice: ");
    Main.scanner.nextInt();
    System.out.println(dice1P1.getDice());
    //IF
    //IF





  }







  private void spellChoice() {




    Spells spells = new Spells();
    spells.setSpells();


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



    }
  }






