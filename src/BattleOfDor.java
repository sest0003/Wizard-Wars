import lombok.*;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class BattleOfDor {



    Players p;

    Dice dice1P1 = new Dice();
    Dice dice1Comp1 = new Dice();

    int sumOfP1 = 0;
   int sumOfP3 = 0;

  int sumOfComputer1 = 0;
  int sumOfComputer2 = 0;
  int sumOfComputer3 = 0;





  public void storyLine(Spells spells, List<Player> playerList, List<Player> wizards, List<Player> computerList, List<String> playerNames) {

      //Storyline
      System.out.println("Storyline");

      //Uppställning
      vsplayers(playerNames, wizards, spells);
      System.out.println();
      System.out.println("----- VS -----");
      System.out.println();
      vsEnemy(computerList, wizards);

      battle(spells, playerList, wizards,computerList, playerNames);
    }

   public void battle(Spells spells, List<Player> playerList, List<Player> wizards, List<Player> computerList, List<String> playerNames) {

   /*     //Skapa id till spells
       HashMap<String, Integer> spellsAndIdP1 = new HashMap<>();
       for (Spell s : spells.spellsOfP1) {
           spellsAndIdP1.put(s.getName(), s.getId());
       }
       HashMap<String, Integer> spellsAndIdP2 = new HashMap<>();
       for (Spell s : spells.spellsOfP2) {
           spellsAndIdP2.put(s.getName(), s.getId());
       }
       HashMap<String, Integer> spellsAndIdP3 = new HashMap<>();
       for (Spell s : spells.spellsOfP3) {
           spellsAndIdP3.put(s.getName(), s.getId());
       }
       HashMap<String, Integer> spellsAndIdC1 = new HashMap<>();
       for (Spell s : spells.spellsOfC1) {
           spellsAndIdC1.put(s.getName(), s.getId());
       }
       HashMap<String, Integer> spellsAndIdC2 = new HashMap<>();
       for (Spell s : spells.spellsOfC2) {
           spellsAndIdC2.put(s.getName(), s.getId());
       }
       HashMap<String, Integer> spellsAndIdC3 = new HashMap<>();
       for (Spell s : spells.spellsOfC3) {
           spellsAndIdC3.put(s.getName(), s.getId());
       }*/

       //1. kasta tärning + ge info om tärningen plus comptärning
       System.out.println("Roll your first dice, press [1]: ");
       System.out.println("Kill yourself, press [2]: ");
       int diceAction = Main.scanner.nextInt();

       if (diceAction == 1) {
           System.out.println("you rolled: " + dice1P1.getDice());
           System.out.println();
           System.out.println(computerList.get(0).getName() + " rolled: " + dice1Comp1.getDice());
           System.out.println();
       }
          else if (diceAction == 2) {
               System.out.println("idiot... Well well..");
               return;

          } else {
               System.out.println("invalid number..");
           }


           //2 välj spell från spellsOfP1
           System.out.println("choose your first spell by pressing: [Number of spell]:");
            spells.getSpellsOfP1();
           int spellChoice1 = Main.scanner.nextInt();
           System.out.println("fire in the hole!..");


           //3. resultat av spells player och comp

       if (spellChoice1 == 1) {
           dragonBloodAction(wizards, spells, spellChoice1);
       }

       if (spellChoice1 == 2) {
           ForestFireAction(wizards, spells, spellChoice1);
       }

       //mer alternativ
       else {
           System.out.println("skriver mer kod");
       }

       if (spells.randomSpell().getId() == 1) {
           dragonBloodActionEnemy(spells, wizards, computerList);
       }

       }

    private void ForestFireAction(List<Player> wizards, Spells spells, int spellChoice1) {
        //4 Action of spell + info about the fx of spell wizard and computer
        sumOfP1 =+ 4;

        wizards.get(0).setCloak(wizards.get(0).getCloak() + 10);

        //Printing action of spell.
        if(spellChoice1 == 1 && spells.spellsOfP1.get(0).getSpellGroup() == 2)
        {
            //div dice of opponent
            int diceDecrease = dice1Comp1.getDice() / 2;

            System.out.println("Your total score increases by 4");
            System.out.println("your Cloak increases by 10");
            System.out.println("your opponents dice get divide by half ");
            System.out.println("you get a chance to add 2 extra dices in the fight");
        }
        else {
            System.out.println("Your total score increases by 4");
            System.out.println("your Cloak increases by 10");
            System.out.println("you get a chance to add 2 extra dices in the fight");
        }

        //Extra dice
        System.out.println("\n If you roll 3 or over you get 2 extra dices. Go!, press [1]");
        int diceAction = Main.scanner.nextInt();

        Dice dice = new Dice();
        System.out.println("You rolled a " + dice.getDice());

        if (dice.getDice() >= 3){
            System.out.println("Congrats, You get 2+ dices, please roll them now by pressing [1]");
            int diceAction2 = Main.scanner.nextInt();
            Dice dicePlus1 = new Dice();
            Dice dicePlus2 = new Dice();

            int totalDiceScore = dicePlus1.getDice() + dicePlus2.getDice() + dice1P1.getDice();

            System.out.println("You rolled: " + dicePlus1.getDice() + " and " + dicePlus2.getDice());
            System.out.println("Your total dice score is now: " + totalDiceScore);

        } else {
            System.out.println("Sorry...");
        }
    }
    }

    private void dragonBloodAction(List<Player> wizards, Spells spells, int spellChoice1) {

    //4 Action of spell + info about the fx of spell wizard and computer
        sumOfP1 =+ 4;

        wizards.get(0).setCloak(wizards.get(0).getCloak() + 10);

        //Printing action of spell.
        if(spellChoice1 == 1 && spells.spellsOfP1.get(0).getSpellGroup() == 2)
            {
                //div dice of opponent
            int diceDecrease = dice1Comp1.getDice() / 2;

                System.out.println("Your total score increases by 4");
                System.out.println("your Cloak increases by 10");
                System.out.println("your opponents dice get divide by half ");
                System.out.println("you get a chance to add 2 extra dices in the fight");
            }
        else {
            System.out.println("Your total score increases by 4");
            System.out.println("your Cloak increases by 10");
            System.out.println("you get a chance to add 2 extra dices in the fight");
        }

        //Extra dice
        System.out.println("\n If you roll 3 or over you get 2 extra dices. Go!, press [1]");
        int diceAction = Main.scanner.nextInt();

            Dice dice = new Dice();
            System.out.println("You rolled a " + dice.getDice());

            if (dice.getDice() >= 3){
                System.out.println("Congrats, You get 2+ dices, please roll them now by pressing [1]");
                int diceAction2 = Main.scanner.nextInt();
                Dice dicePlus1 = new Dice();
                Dice dicePlus2 = new Dice();

                int totalDiceScore = dicePlus1.getDice() + dicePlus2.getDice() + dice1P1.getDice();

                System.out.println("You rolled: " + dicePlus1.getDice() + " and " + dicePlus2.getDice());
                System.out.println("Your total dice score is now: " + totalDiceScore);

            } else {
                System.out.println("Sorry...");
            }
    }


    private void dragonBloodActionEnemy(Spells spells, List<Player> wizards, List<Player> computerList) {


        //4 Action of spell + info about the fx of spell

        sumOfComputer1 =+ 4;

       computerList.get(0).setCloak(computerList.get(0).getCloak() + 10);

        //Printing action of spell.
        if(spells.randomSpell().getSpellGroup() == 2)
        {
            //div dice of opponent
            int diceDecrease = dice1P1.getDice() / 2;
            System.out.println("Your opponent casts a Fire Blood");
            System.out.println("The opponents total score increases by 4");
            System.out.println("The opponents Cloak increases by 10");
            System.out.println("Your dice get divide by half ");
            System.out.println("The opponent get a chance to add 2 extra dices in the fight");
        }
        else {
            System.out.println("Your opponent casts a Fire Blood");
            System.out.println("The opponents total score increases by 4");
            System.out.println("The opponents Cloak increases by 10");
            System.out.println("The opponent get a chance to add 2 extra dices in the fight");
        }

        //Extra dice
        System.out.println("\n If your opponent roll 3 or over, the Bastard get 2 extra dices. See what happens by pressing [1]");
        int diceAction = Main.scanner.nextInt();

        Dice dice = new Dice();
        System.out.println("The bastard rolled " + dice.getDice());

        if (dice.getDice() >= 3){
            System.out.println("Sorry, the W-man gets to more dices, see how lucky he is by pressing [1]");
            int diceAction2 = Main.scanner.nextInt();
            Dice dicePlus1 = new Dice();
            Dice dicePlus2 = new Dice();

            int compTotalDiceScore = dicePlus1.getDice() + dicePlus2.getDice() + dice1Comp1.getDice();

            System.out.println("W-man Bastard rolled: " + dicePlus1.getDice() + " and " + dicePlus2.getDice());
            System.out.println("Your opponents total dice score is: " + compTotalDiceScore);

        } else {
            System.out.println("Congrats!,the Wizard has no luck.");
        }
    }
/*
    public void forestFire() {
        System.out.println("DICE-ACTION! \n If you roll 3 or over you get 2 extra dices. Go, press [1]");
        int diceAction = Main.scanner.nextInt();

        Dice dice = new Dice();
        System.out.println("You rolled a " + dice.getDice());

        if (dice.getDice() >= 3){
            System.out.println("Congrats, You get 2+ dices, please roll them now by pressing [1]");
            int diceAction2 = Main.scanner.nextInt();
            Dice dicePlus1 = new Dice();
            Dice dicePlus2 = new Dice();

            int totalDiceScore = dicePlus1.getDice() + dicePlus2.getDice() + dice1P1.getDice();

            System.out.println("You rolled: " + dicePlus1.getDice() + " and " + dicePlus2.getDice());
            System.out.println("Your total dice score is now: " + totalDiceScore);

        } else {
            System.out.println("Sorry...No extra dice");
        }




    }
*/



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








