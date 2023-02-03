import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {

       List<Player> players = new ArrayList<>();

        do {

            displayMenu();

            int option = getOption();

           if (option == 1)  {
               WolfAttack wolfAttack = new WolfAttack();
               wolfAttack.printWolf(); }

            else if (option == 3)
            {
                Player sumOfP1 = players.get(0);
                for (Player p : players) {
                    System.out.println(p);
                    System.out.println(p.getKnowledge());
                    System.out.println(p.getGold());
                    System.out.println(p.getTower());
                    System.out.println(p.getCloak());

                }

                System.out.println("Exiting....."); break; }



        } while (true);


    }

    private static void displayMenu() {
        System.out.println("____________________\n - Wizard Wars -\n");
        System.out.println("1: Redwood");
        System.out.println("2: Insert guest");
        System.out.println("3: Rename guest");
        System.out.println("4: Remove guest");
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






