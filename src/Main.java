import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


      /*  Spells spells = new Spells();

        System.out.println(spells.fireSpells.get(0).getName());

        System.out.println(spells.fireSpells.get(0).getName().indexOf("Dragon Blood"));

        Players players = new Players();

        String player1 = players.playerList.get(0).getName();

        System.out.println(player1);

        Players players1 = new Players();

        System.out.println(players.playerList.get(0).getDescription());*/

        SetCharacter set = new SetCharacter();


        set.chooseName();
        set.chooseWizard();




            do {


            displayMenu();

            int option = getOption();

            if (option == 1) {
               // WizardChoice name = new WizardChoice();
                //  name.chooseName();
                //name.chooseWizard();


            } else if (option == 2) {
              //  BattleOfDor battleOfDor = new BattleOfDor();
               // battleOfDor.storyLine();

            } else if (option == 3) {


            } else if (option == 4) {
                Rules rules = new Rules();
                rules.printRules();


            } else if (option == 5) {
                System.out.println("Exiting.....");
                break;
            }


        } while (true);}




    private static void displayMenu() {
        System.out.println("____________________\n - Wizard Wars -\n");
        System.out.println("1: Wizard of choice");
        System.out.println("2: The market in Redwoods");
        System.out.println("3: The battle of Dor");
        System.out.println("4: Rules");
        System.out.println("5: Exit");
    }

    static int getOption() {
        System.out.print("\nEnter option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }
}





