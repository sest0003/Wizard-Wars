import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Computers computers = new Computers();
        computers.setCPlayer();
        System.out.println(computers.computerList.get(0).getName());
        System.out.println();
        System.out.println(computers.computerList.get(1).getName());
        System.out.println();
        System.out.println(computers.computerList.get(2).getName());


        SetCharacter set = new SetCharacter();
        Spells s = new Spells();
        System.out.println(s.getFireSpells().get(0).getdecription());




      /*  Spells spells = new Spells();

        System.out.println(spells.fireSpells.get(0).getName());

        System.out.println(spells.fireSpells.get(0).getName().indexOf("Dragon Blood"));

        Players players = new Players();

        String player1 = players.playerList.get(0).getName();

        System.out.println(player1);

        Players players1 = new Players();

        System.out.println(players.playerList.get(0).getDescription());*/

        //System.out.println(set.wizards.get(0).getDescription());


            do {


            displayMenu();

            int option = getOption();

            if (option == 1) {
                set.chooseWizard();
                System.out.println(set.wizards.get(0).getName());
                System.out.println(set.wizards.get(1).getName());


            } else if (option == 2) {
                Spells s1 = new Spells(); s1.bocHord();
                System.out.println(s1.spellsOfP1.get(0).getName() + "\n"+ (s1.spellsOfP1.get(1).getName()));

            } else if (option == 3) {


            } else if (option == 4) {
                Rules rules = new Rules();
                rules.printRules();


            } else if (option == 5) {
               // System.out.println(set.getPlayer1Name().toString() + set.wizards.get(0).getDescription());
               // System.out.println(set.getPlayer2Name().toString() + set.wizards.get(1).getDescription());

                System.out.println("Exiting.....");
                break;
            }


        } while (true);}




    private static void displayMenu() {
        System.out.println("^*^*^*^*  The spells of boc-hord  ^*^*^*^*");
        System.out.println();
        System.out.println("1:  Choose Wizard");
        System.out.println("2: The spells of boc-hord");
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





