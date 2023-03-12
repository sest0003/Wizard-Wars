import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Spells spells = new Spells();
        Players p = new Players();
        Computers computers = new Computers();
        computers.setComputerPlayer();
        SetCharacter set = new SetCharacter();

        //testkaraktär
        set.wizards.add(p.playerList.get(0));
        spells.spellsOfP1.add(spells.getFireSpells().get(0));
        spells.spellsOfP1.add(spells.getPoisonSpells().get(0));
       set.playerNames.add("Hox");
        System.out.println(set.getPlayerNames().get(0));


      /*  set.chooseName();
        set.chooseWizard();*/



            do {


            displayMenu();

            int option = getOption();

            if (option == 1) {
                spells.bocHord();




            } else if (option == 2) {
                BattleOfDor battle1 = new BattleOfDor();
                battle1.storyLine(spells, p.playerList, set.wizards, computers.computerList, set.playerNames);





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





