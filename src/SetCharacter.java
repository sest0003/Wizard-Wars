public class SetCharacter {

    private int nPlayers;
    private String player1Name;
    private String player2Name;
    private String player3Name;

    public void chooseName() {
        System.out.println();
        System.out.print("Enter the number of players: ");
        int nPlayers =  Main.scanner.nextInt();

        if (nPlayers == 1) {
            System.out.println("What is your name wizard?");
            String player1Name = Main.scanner.next();

        }

        if (nPlayers == 2) {
            System.out.println("Player 1; what is your name?");
            String player1Name = Main.scanner.next();
            Main.scanner.nextLine();

            System.out.println("Player 2, what is your name?");
            String player2Name = Main.scanner.next();
            Main.scanner.nextLine();
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

    public void chooseWizard(){
        System.out.println(player1Name + " Choose your Wizard");

        do {

            displayMenu();

            int option= getOption();

            if (option == 1) { Players p = new Players(); System.out.println(p.playerList.get(0).getDescription()); }

            else if (option == 2) {  Players p = new Players(); System.out.println(p.playerList.get(0).getDescription()); }

            else if (option == 3) {  Players p = new Players(); System.out.println(p.playerList.get(0).getDescription());}

            else if (option == 4) {  Players p = new Players(); System.out.println(p.playerList.get(0).getDescription()); }

            else if (option == 5) {  Players p = new Players(); System.out.println(p.playerList.get(0).getDescription()); }

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
