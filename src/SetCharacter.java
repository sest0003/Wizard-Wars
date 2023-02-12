import java.util.ArrayList;
import java.util.List;

public class SetCharacter {

    private int nPlayers;

    private String player1Name;
    private String player2Name;
    private String player3Name;

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public String getPlayer3Name() {
        return player3Name;
    }

    List<Player> wizards = new ArrayList<>();


    public void chooseName() {
        System.out.println();
        System.out.print("Enter the number of players: ");
        int nPlayers =  Main.scanner.nextInt();

        if (nPlayers == 1) {
            System.out.println("What is your name wizard?");
            player1Name = Main.scanner.next();

        }

        if (nPlayers == 2) {
            System.out.println("Player 1; what is your name?");
            String player1Name = Main.scanner.next();

            System.out.println("Player 2, what is your name?");
            String player2Name = Main.scanner.next();

        }
        if (nPlayers == 3) {
            System.out.println("Player 1, what is your name?");
            player1Name = Main.scanner.next();



            System.out.println("Player 2, what is your name?");
            String player2Name = Main.scanner.next();


            System.out.println("Player 3, what is your name?");
            String player3Name = Main.scanner.next();


        } else if (nPlayers >= 4) {
            System.out.println("There can only be max 3 players, please try again");
        }

    }
    // player x choose wizard
    public void chooseWizard(){


        System.out.println("Choose your Wizard");

                do {

                    displayMenu();

                    int option= getOption();

                    if (option == 1) {
                        Players p = new Players();
                        System.out.println(p.playerList.get(0).getDescription());
                System.out.println();
                System.out.println("To choose this Wizard, press [1] to exit press [2]");
                int cP1 = Main.scanner.nextInt();

                if (cP1 == 1) {
                    wizards.add(p.playerList.get(0));

                } else { break; }
            }

            else if (option == 2) {
                Players p = new Players();
                System.out.println(p.playerList.get(1).getDescription());
                System.out.println();
                System.out.println("To choose this Wizard, press [1] to exit press [2]");
                int cP1 = Main.scanner.nextInt();

                if (cP1 == 1) {
                    wizards.add(p.playerList.get(1));

                } else { break; }
            }

            else if (option == 3) {
                Players p = new Players();
                System.out.println(p.playerList.get(2).getDescription());
                System.out.println();
                System.out.println("To choose this Wizard, press [1] to exit press [2]");
                int cP1 = Main.scanner.nextInt();

                if (cP1 == 1) {
                    wizards.add(p.playerList.get(2));

                } else { break; }
            }

            else if (option == 4) {
                Players p = new Players();
                System.out.println(p.playerList.get(3).getDescription());
                System.out.println();
                System.out.println("To choose this Wizard, press [1] to exit press [2]");
                int cP1 = Main.scanner.nextInt();

                if (cP1 == 1) {
                    wizards.add(p.playerList.get(3));

                } else { break; }
            }

            else if (option == 5) {
                Players p = new Players();
                System.out.println(p.playerList.get(4).getDescription());
                System.out.println();
                System.out.println("To choose this Wizard, press [1] to exit press [2]");
                int cP1 = Main.scanner.nextInt();

                if (cP1 == 1) {
                    wizards.add(p.playerList.get(4));

                } else { break; }
            }

            else if (option == 6) { System.out.println("Exiting....."); break; }


        } while (true);

    }

    @Override
    public String toString() {
        return "SetCharacter{" +
                "player1Name='" + player1Name + '\'' +
                ", player2Name='" + player2Name + '\'' +
                ", player3Name='" + player3Name + '\'' +
                '}';
    }


    private static void displayMenu() {
        System.out.println();
        System.out.println("^*^*^*^*  Wizards  ^*^*^*^*");
        System.out.println();
        System.out.println("1: Wizard of Fire");
        System.out.println("2: Wizard of the Deep");
        System.out.println("3: Wizard of Woodcraft");
        System.out.println("4:  Druid");
        System.out.println("5: Wizard of the Dark");
        System.out.println("6: Exit");
    }

    static int getOption() {
        System.out.print("\nEnter option: ");
        int option = Main.scanner.nextInt();
        Main.scanner.nextLine();
        System.out.println();
        return option;
    }


}
