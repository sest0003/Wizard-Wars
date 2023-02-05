import java.util.ArrayList;
import java.util.List;

public class BattleOfDor {

  static String player1Name = "Druid of Gord";
  static String player2Name = "Wizard of Oaks";

  public void storyLine() {

    Spells spells = new Spells();
    spells.setSpells();

    String [] sOfChoiceP1 = new String[10];
    String [] sOfChoiceP2 = new String[10];

    Dice dice1P1 = new Dice();
    Dice dice2P1 = new Dice();

    Dice dice1P2 = new Dice();
    Dice dice2P2 = new Dice();


    Player player1 = new Player(200, 20, 10, 10, "Wizard of Oak");
    Player player2 = new Player(200, 20, 20, 10, "Druid");


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

    System.out.println();


    System.out.print(player1Name + "; Choose your first spell: ");

    int numP1 = Main.scanner.nextInt();

    if (numP1 == 1) {
     spells.getFireSpells();
     sOfChoiceP1 [0] = "Fire";


    } else if (numP1 == 2) {
      spells.getPoisonSpells();
      sOfChoiceP1 [0] = "Poison";

    } else if (numP1 == 3) {
      spells.getWaterSpells();
      sOfChoiceP1 [0] = "Water";

    } else if (numP1 == 4) {
    spells.getWoodCraftSpells();
      sOfChoiceP1 [0] = "Wood";



    } else if (numP1 == 5) {
    spells.getSummonSpells();
      sOfChoiceP1 [0] = "Summon";
  }




    System.out.print(player2Name + "; Choose your first spell: ");
    int numP2 = Main.scanner.nextInt();


    if (numP2 == 1) {
      spells.getFireSpells();
      sOfChoiceP2 [0] = "Fire";


    } else if (numP2 == 2) {
      spells.getPoisonSpells();
      sOfChoiceP2 [0] = "Poison";

    } else if (numP2 == 3) {
      spells.getWaterSpells();
      sOfChoiceP2 [0] = "Water";

    } else if (numP2 == 4) {
      spells.getWoodCraftSpells();
      sOfChoiceP2 [0] = "Wood";


    } else if (numP2 == 5) {
      spells.getSummonSpells();
      sOfChoiceP2 [0] = "Summon";
    }


    System.out.print(player1Name + "; Choose your second spell: ");

    int numP12 = Main.scanner.nextInt();

    if (numP12 == 1) {
      spells.getFireSpells();
      sOfChoiceP1 [1] = "Fire";


    } else if (numP12 == 2) {
      spells.getPoisonSpells();
      sOfChoiceP1 [1] = "Poison";

    } else if (numP12 == 3) {
      spells.getWaterSpells();
      sOfChoiceP1 [1] = "Water";

    } else if (numP12 == 4) {
      spells.getWoodCraftSpells();
      sOfChoiceP1 [1] = "Wood";

    } else if (numP12 == 5) {
      spells.getSummonSpells();
      sOfChoiceP1 [1] = "Summon";
    }




    System.out.print(player2Name + "; Choose your second spell: ");
    int numP22 = Main.scanner.nextInt();


    if (numP22 == 1) {
      spells.getFireSpells();
      sOfChoiceP2 [1] = "Fire";


    } else if (numP22 == 2) {
      spells.getPoisonSpells();
      sOfChoiceP2 [1] = "Poison";

    } else if (numP22 == 3) {
      spells.getWaterSpells();
      sOfChoiceP2 [1] = "Water";

    } else if (numP22 == 4) {
      spells.getWoodCraftSpells();
      sOfChoiceP2 [1] = "Wood";


    } else if (numP22 == 5) {
      spells.getSummonSpells();
      sOfChoiceP2 [1] = "Summon";
    }

    System.out.println(sOfChoiceP1[0]);
    System.out.println(sOfChoiceP1[1]);
    System.out.println("Make your move, 1 or 2: ");
    int choice = Main.scanner.nextInt();

    if (choice == 1) {
      System.out.println("första valet");
    }

    System.out.print(player1Name + "Press 1 to roll the dice: ");
    Main.scanner.nextInt();
    System.out.println(dice1P1.getDice());


    System.out.print("Spell nr 2; ");
    int spell1P2 = Main.scanner.nextInt();


  }
}




