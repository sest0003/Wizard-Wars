public class BattleOfDor {

  static String player1Name = "Druid of Gord";
  static String player2Name = "Wizard of Oaks";

  public void storyLine() {

    Spells spells = new Spells();


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




    } else if (numP1 == 2) {
      //spells.getPoison();

    }
    else if (numP1 == 3)
      //spells.getWood();


    System.out.print(player2Name + "; Choose your first spell: ");
    int s11p2 = Main.scanner.nextInt();

    System.out.print("Press 1 to roll the dice: ");
    Main.scanner.nextInt();


    System.out.print("Spell nr 2; ");
    int spell1P2 = Main.scanner.nextInt();


  }
}




