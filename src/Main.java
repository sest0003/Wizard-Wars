import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Spells spells = new Spells();
        spells.spellsOfC1.add(spells.getFireSpells().get(0));
        System.out.println(spells.getSpellsOfC1().get(0).getName());

        Computers computers = new Computers();
        computers.setCPlayer();

        SetCharacter set = new SetCharacter();


        set.chooseName();
        set.chooseWizard();



            do {


            displayMenu();

            int option = getOption();

            if (option == 1) {
                spells.bocHord();




            } else if (option == 2) {




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
        System.out.println("^*^*^*^*  The spells of Boc-hord  ^*^*^*^*");
        System.out.println();
        System.out.println("1: Boc-Hord ");
        System.out.println("2: The battle of Dor");
        System.out.println("3: ");
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





