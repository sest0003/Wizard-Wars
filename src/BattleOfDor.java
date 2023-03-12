import java.util.List;


public class BattleOfDor {



    Players p;
    SetCharacter setCharacter;
    Computers computers;

    Dice dice1P1;
    Dice dice2P1;
    Dice dice3P1;

  int sumOfP1 = 0;
  int sumOfP2 = 0;
  int sumOfP3 = 0;

  int sumOfComputer1 = 0;
  int sumOfComputer2 = 0;
  int sumOfComputer3 = 0;

  Computers computers = new Computers();


  public void storyLine(List<Spell> spellsOfP1, List<Spell> spellsOfP2, List<Spell> spellsOfP3, List<Player> playerList, List<Player> wizards, List<Player> computerList) {

      System.out.println("Storyline");

      System.out.println(spellsOfP1.get(0).getdecription());

      vsEnemy();

      vsplayers(setCharacter, spellsOfP1, spellsOfP2, spellsOfP3, wizards);

    }





    public void vsEnemy(List<Player> playerList, SetCharacter setCharacter) {


          if (setCharacter.getnPlayers() == 1 ) {

              System.out.println("This is who you are facing;");
              System.out.println("Bobba-W:");
              System.out.println();
            System.out.println(computers.computerList.get(0).getName());
            System.out.println(computers.computerList.get(0).getDescription());
            System.out.println(computers.computerList.get(0).getGold());
            System.out.println(computers.computerList.get(0).getCloak());
            System.out.println(computers.computerList.get(0).getKnowledge());
            System.out.println(computers.computerList.get(0).getTower());
          }

             else if (setCharacter.getnPlayers() == 2 ) {
              System.out.println("This is who you are facing;");
              System.out.println("Bobba-W:");
              System.out.println();

              System.out.println(computers.computerList.get(0).getName());
              System.out.println(computers.computerList.get(0).getDescription());
              System.out.println(computers.computerList.get(0).getGold());
              System.out.println(computers.computerList.get(0).getCloak());
              System.out.println(computers.computerList.get(0).getKnowledge());
              System.out.println(computers.computerList.get(0).getTower());
              System.out.println();
              System.out.println("------");
              System.out.println();
              System.out.println("Z:");
              System.out.println();
            System.out.println(computers.computerList.get(1).getName());
            System.out.println(computers.computerList.get(1).getDescription());
            System.out.println(computers.computerList.get(1).getGold());
            System.out.println(computers.computerList.get(1).getCloak());
            System.out.println(computers.computerList.get(1).getKnowledge());
            System.out.println(computers.computerList.get(1).getTower());
          }

             else if (setCharacter.getnPlayers() == 3 ) {
              System.out.println("Bobba-W:");
              System.out.println();
              System.out.println(computers.computerList.get(0).getName());
              System.out.println(computers.computerList.get(0).getDescription());
              System.out.println(computers.computerList.get(0).getGold());
              System.out.println(computers.computerList.get(0).getCloak());
              System.out.println(computers.computerList.get(0).getKnowledge());
              System.out.println(computers.computerList.get(0).getTower());
              System.out.println();
              System.out.println("------");
              System.out.println();
              System.out.println("Z:");
              System.out.println();
              System.out.println(computers.computerList.get(1).getName());
              System.out.println(computers.computerList.get(1).getDescription());
              System.out.println(computers.computerList.get(1).getGold());
              System.out.println(computers.computerList.get(1).getCloak());
              System.out.println(computers.computerList.get(1).getKnowledge());
              System.out.println(computers.computerList.get(1).getTower());
              System.out.println();
              System.out.println("------");
              System.out.println();
              System.out.println("Coco-Trollkarl:");
              System.out.println();
              System.out.println(computers.computerList.get(2).getName());
              System.out.println(computers.computerList.get(2).getDescription());
              System.out.println(computers.computerList.get(2).getGold());
              System.out.println(computers.computerList.get(2).getCloak());
              System.out.println(computers.computerList.get(2).getKnowledge());
              System.out.println(computers.computerList.get(2).getTower());
              System.out.println();
             }

          }

    public void vsplayers(SetCharacter setCharacter, List<Spell> spellsOfP1, List<Spell> spellsOfP2, List<Spell> spellsOfP3, List<Player> wizards) {

        if (setCharacter.getnPlayers() == 1 ) {
            System.out.println(spellsOfP1.get(0).getdecription());
        }


        else if (setCharacter.getnPlayers() == 2 ) {
            System.out.println(spellsOfP1.get(0).getdecription());
            System.out.println("-----------------");
            System.out.println(spellsOfP1.get(1).getdecription());

        }

        else if (setCharacter.getnPlayers() == 3 ) {
            System.out.println("-----------------");
            System.out.println(spellsOfP1.get(0).getdecription());
            System.out.println("-----------------");
            System.out.println(spellsOfP1.get(1).getdecription());
            System.out.println("-----------------");
            System.out.println(spellsOfP1.get(2).getdecription());

        }

    }

        }








