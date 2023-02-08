public class WizardChoice {

    private Wizard wizardDruid = new Wizard("Druid");
    private Wizard wizardOfDarkness = new Wizard("Wizard of Darkness");
    private Wizard wizardOfLight = new Wizard("Wizard of Fire");
    private Wizard wizardOfTrees = new Wizard("Wizard of Trees");
    private Wizard wizardDark = new Wizard("Wizard of the Deep");

    private String player1Name;
    private String player2Name;
    private String player3Name;

    public WizardChoice() {

    }

    public void chooseName() {

        System.out.println("how many players: ");
       int nPlayers = Main.scanner.nextInt();

        if (nPlayers == 1) {
            System.out.println("What is your name wizard?");
            String player1Name = Main.scanner.nextLine();
        }

        if (nPlayers == 2) {
            System.out.println("Wizard 1, what is your name?");
            String player1Name = Main.scanner.nextLine();
            Main.scanner.nextLine();

            System.out.println("Wizard 2, what is your name?");
            String player2Name = Main.scanner.nextLine();

        }
        if (nPlayers == 3) {
            System.out.println("Wizard 1, what is your name?");
            String player1Name = Main.scanner.nextLine();

            System.out.println("Wizard 2, what is your name?");
            String player2Name = Main.scanner.nextLine();

            System.out.println("Wizard 3, what is your name?");
            String player3Name = Main.scanner.nextLine();

        } else if (nPlayers >= 4) {
            System.out.println("There can only be max 3 players, please try again");
        }

    }


    public void chooseWizard() {
        System.out.println(player1Name + " What type of wizard are you");

     do {

         displayMenu();

         int option = getOption();

         if (option == 1) {
             System.out.println("^*^*^*^* Wizard of Fire ^*^*^*^*");
             System.out.println();
             System.out.println("Gold: 100\nTower: 20\nKnowledge: 10\nCloak: 20\nDouble the effect of Firespells\nDecrease your opponent dice by half, if they use a water-spell.");
             System.out.println();
             System.out.println("CV: \n\nNormally a Fire Wizard is very impulsive and not so smart, that´s why the cashflow is low and the knowledge is lacking. " +
                     "But a Wizard of Fire needs a big and strong tower to explore the effect of firespells, and also an High-cloak for protection against heat and explotions. ");


         } else if (option == 2) {
             System.out.println("^*^*^*^* Wizard of the Deep ^*^*^*^*");
             System.out.println();
             System.out.println("Gold: 150\nTower: 10\nKnowledge: 20\nCloak: 10\nDouble the effect of water-spells\nDecrease your opponent dice by half, if they use a fire-spell.");
             System.out.println();
             System.out.println("CV: \n\nWizard of the Deep. ");

         } else if (option == 3) {
             System.out.println("^*^*^*^* Wizard of Woodcraft ^*^*^*^*");
             System.out.println();
             System.out.println("Gold: 100\nTower: 20\nKnowledge: 10\nCloak: 10\nDouble the effect of woodcraft-spells\n");
             System.out.println();
             System.out.println("CV: \n\nWizard of Woodcraft.");



         } else if (option == 4) {
             System.out.println("^*^*^*^* Druid ^*^*^*^*");
             System.out.println();
             System.out.println("Gold: 200\nTower: 20\nKnowledge: 30 \nCloak: 5\nDouble the effect of poison-spells\n");
             System.out.println();
             System.out.println("CV: \n\nDruid.");

         } else if (option == 5) {
             System.out.println("^*^*^*^* Wizard of Black Art ^*^*^*^*");
             System.out.println();
             System.out.println("Gold: 150\nTower: 20\nKnowledge: 20 \nCloak: 10\nDouble the effect of Summon-spells\n");
             System.out.println();
             System.out.println("CV: \n\nBlack art.");


         } else if (option == 6) {
             System.out.println("Exiting.....");
             break;
         }


     } while (true);

    }

    public WizardChoice(Wizard wizardDruid, Wizard wizardOfDarkness, Wizard wizardOfLight, Wizard wizardOfTrees, Wizard wizardDark, String player1Name, String player2Name, String player3Name) {
        this.wizardDruid = wizardDruid;
        this.wizardOfDarkness = wizardOfDarkness;
        this.wizardOfLight = wizardOfLight;
        this.wizardOfTrees = wizardOfTrees;
        this.wizardDark = wizardDark;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player3Name = player3Name;
    }

    public Wizard getWizardDruid() {
        return wizardDruid;
    }

    public Wizard getWizardOfDarkness() {
        return wizardOfDarkness;
    }

    public Wizard getWizardOfLight() {
        return wizardOfLight;
    }

    public Wizard getWizardOfTrees() {
        return wizardOfTrees;
    }

    public Wizard getWizardDark() {
        return wizardDark;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public String getPlayer3Name() {
        return player3Name;
    }

    @Override
    public String toString() {
        return ", player1Name='" + player1Name + '\'' +
                ", player2Name='" + player2Name + '\'' +
                ", player3Name='" + player3Name + '\'' +
                '}';
    }
    private static void displayMenu() {
        System.out.println("____________________\n - Wizards -\n");
        System.out.println("1: Wizard of fire");
        System.out.println("2: Wizard of the Deep");
        System.out.println("3: Wizard of Woodcraft");
        System.out.println("4: Druid");
        System.out.println("5: Wizard of Light");
    }

    static int getOption() {
        System.out.print("\nEnter option: ");
        int option = Main.scanner.nextInt();
        Main.scanner.nextLine();
        System.out.println();
        return option;
    }
}
