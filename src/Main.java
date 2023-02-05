import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);






    public static void main(String[] args) {

        Spells spells = new Spells();
        spells.setSpells();
        spells.getFireSpells();





        do {


            displayMenu();

            int option = getOption();

            if (option == 1) {
                WolfAttack wolfAttack = new WolfAttack();
                wolfAttack.wolAttack();


            } else if (option == 2) {


            } else if (option == 3) {
                BattleOfDor battleOfDor = new BattleOfDor();
                battleOfDor.storyLine();



            } else if (option == 4) {
                Rules rules = new Rules();
                rules.printRules();


            } else if (option == 5) {
                System.out.println("Exiting.....");
                break;
            }


        } while (true);


    }


    private static void displayMenu() {
        System.out.println("____________________\n - Wizard Wars -\n");
        System.out.println("1: The Wolfs");
        System.out.println("2: The market in Redwoods");
        System.out.println("3: The gathering in Wian");
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





