import java.util.List;


public class BattleOfDor {



    Players p;



    Dice dice1P1;
    Dice dice2P1;
    Dice dice3P1;

  int sumOfP1 = 0;
  int sumOfP2 = 0;
  int sumOfP3 = 0;

  int sumOfComputer1 = 0;
  int sumOfComputer2 = 0;
  int sumOfComputer3 = 0;




  public void storyLine(Spells spells, List<Player> playerList, List<Player> wizards, List<Player> computerList, List<String> playerNames) {


      System.out.println("Storyline");
        //uppställning

      vsplayers(playerNames, wizards, spells);
      System.out.println();
      System.out.println("----- VS -----");
      System.out.println();
      vsEnemy(computerList, wizards);

      battle(spells, playerList, wizards,computerList, playerNames);



    }

   public void battle(Spells spells, List<Player> playerList, List<Player> wizards, List<Player> computerList, List<String> playerNames) {

       System.out.println(playerNames.get(0) + " , your move, cast your spell! : ");

       spells.getSpellsOfP1();

       System.out.println("Choose a spell");
       int choice1 = Main.scanner.nextInt();

       if (choice1 == 1){
           System.out.println("Fire in the hole:");
           System.out.println(spells.spellsOfP1.get(0).getName());

       } else if (choice1 == 2) {
           System.out.println("Fire in the hole:");
           System.out.println(spells.spellsOfP1.get(1).getName());
       }
   }


    public void vsEnemy(List<Player> computerList, List<Player> wizards) {


          if (wizards.size() == 1 ) {

              System.out.println();
            System.out.println(computerList.get(0).getName());
            System.out.println(computerList.get(0).getDescription());
            System.out.println("Gold: " + computerList.get(0).getGold());
            System.out.println("Cloak: " + computerList.get(0).getCloak());
            System.out.println("Knowledge: " + computerList.get(0).getKnowledge());
            System.out.println("Tower: " + computerList.get(0).getTower());
          }

             else if (wizards.size() == 2 ) {

              System.out.println();

              System.out.println(computerList.get(0).getName());
              System.out.println(computerList.get(0).getDescription());
              System.out.println(computerList.get(0).getGold());
              System.out.println(computerList.get(0).getCloak());
              System.out.println(computerList.get(0).getKnowledge());
              System.out.println(computerList.get(0).getTower());
              System.out.println();
              System.out.println("------");
              System.out.println();
              System.out.println("Z:");
              System.out.println();
            System.out.println(computerList.get(1).getName());
            System.out.println(computerList.get(1).getDescription());
            System.out.println(computerList.get(1).getGold());
            System.out.println(computerList.get(1).getCloak());
            System.out.println(computerList.get(1).getKnowledge());
            System.out.println(computerList.get(1).getTower());
          }

             else if (wizards.size() == 3 ) {

              System.out.println();

              System.out.println(computerList.get(0).getName());
              System.out.println(computerList.get(0).getDescription());
              System.out.println(computerList.get(0).getGold());
              System.out.println(computerList.get(0).getCloak());
              System.out.println(computerList.get(0).getKnowledge());
              System.out.println(computerList.get(0).getTower());
              System.out.println();
              System.out.println("------");
              System.out.println();

              System.out.println();
              System.out.println(computerList.get(1).getName());
              System.out.println(computerList.get(1).getDescription());
              System.out.println(computerList.get(1).getGold());
              System.out.println(computerList.get(1).getCloak());
              System.out.println(computerList.get(1).getKnowledge());
              System.out.println(computerList.get(1).getTower());
              System.out.println("------");
              System.out.println();

              System.out.println();
              System.out.println(computerList.get(2).getName());
              System.out.println(computerList.get(2).getDescription());
              System.out.println(computerList.get(2).getGold());
              System.out.println(computerList.get(2).getCloak());
              System.out.println(computerList.get(2).getKnowledge());
              System.out.println(computerList.get(2).getTower());
              System.out.println();
             }

          }

    public void vsplayers(List<String> setCharacter, List<Player> wizards, Spells spells) {

        if (wizards.size() == 1 ) {
            System.out.println(wizards.get(0).getName());
            System.out.println(wizards.get(0).getDescription());
            System.out.println(wizards.get(0).getGold());
            System.out.println(wizards.get(0).getCloak());
            System.out.println(wizards.get(0).getKnowledge());
            System.out.println(wizards.get(0).getTower());
            System.out.println();
            System.out.println("spells:");
            spells.getSpellsOfP1();
        }


        else if (wizards.size() == 2 ) {


        }

        else if (wizards.size() == 3 ) {


        }

    }

        }








