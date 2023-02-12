public class WizardChoice {


    private String player1Name;
    private String player2Name;
    private String player3Name;


    private Wizard wizardOfFire = new Wizard(100, 20, 10, 20, "Wizard of Fire");

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


    public Wizard chooseWizard() {

        do {

            displayMenu();

            int option = getOption();

            if (option == 1) {
                System.out.println("^*^*^*^* Wizard of Fire ^*^*^*^*\n\nGold: 100\\nTower: 20\\nKnowledge: 10\\nCloak: 20\\nDouble the effect of Firespells\\nDecrease your opponent dice by half, if they use a water-spell.\n\n\nNormally a Fire Wizard is very impulsive and not so smart, that´s why the cashflow is low and the knowledge is lacking. \" +\n" +
                        "                        \"But a Wizard of Fire needs a big and strong tower to explore the effect of firespells, and also an High-cloak for protection against heat and explosions.");

                System.out.println();
                System.out.println();
                System.out.println("CV:");

                do {
                    System.out.println("Pick this wizard: Press 1");
                    System.out.println("Exit to the wizardlist: Press 2");
                    int c1 = Main.scanner.nextInt();
                    if (c1 == 1) {
                        Wizard w1 = new Wizard(100, 20, 10, 20, "Wizard of Fire");
                        return w1;


                    } else {
                        break;
                    }

                } while (true);


            } else if (option == 2) {
                System.out.println("^*^*^*^* Wizard of the Deep ^*^*^*^*");
                System.out.println();
                System.out.println("Gold: 150\nTower: 10\nKnowledge: 20\nCloak: 10\nDouble the effect of water-spells\nDecrease your opponent dice by half, if they use a fire-spell.");
                System.out.println();
                System.out.println("CV: \nWizard of the Deep. ");

            } else if (option == 3) {
                System.out.println("^*^*^*^* Wizard of Woodcraft ^*^*^*^*");
                System.out.println();
                System.out.println("Gold: 100\nTower: 20\nKnowledge: 10\nCloak: 10\nDouble the effect of woodcraft-spells\n");
                System.out.println();
                System.out.println("CV: \nWizard of Woodcraft.");


            } else if (option == 4) {
                System.out.println("^*^*^*^* Druid ^*^*^*^*");
                System.out.println();
                System.out.println("Gold: 200\nTower: 20\nKnowledge: 30 \nCloak: 5\nDouble the effect of poison-spells\n");
                System.out.println();
                System.out.println("CV: \nDruid.");

            } else if (option == 5) {
                System.out.println("^*^*^*^* Wizard of Black Art ^*^*^*^*");
                System.out.println();
                System.out.println("Gold: 150\nTower: 20\nKnowledge: 20 \nCloak: 10\nDouble the effect of Summon-spells\n");
                System.out.println();
                System.out.println("CV: \nBlack art.");


            } else if (option == 6) {
                System.out.println("Exiting.....");
                break;
            }

        } while (true);
        return null;
    }


        public String getPlayer1Name () {
            return player1Name;
        }

        public String getPlayer2Name () {
            return player2Name;
        }

        public String getPlayer3Name () {
            return player3Name;
        }

        @Override
        public String toString () {
            return ", player1Name='" + player1Name + '\'' +
                    ", player2Name='" + player2Name + '\'' +
                    ", player3Name='" + player3Name + '\'' +
                    '}';
        }
        private static void displayMenu () {
            System.out.println("____________________\n - Wizards -\n");
            System.out.println("1: Wizard of fire");
            System.out.println("2: Wizard of the Deep");
            System.out.println("3: Wizard of Woodcraft");
            System.out.println("4: Druid");
            System.out.println("5: Wizard of Light");
        }

        static int getOption () {
            System.out.print("\nEnter option: ");
            int option = Main.scanner.nextInt();
            Main.scanner.nextLine();
            System.out.println();
            return option;
        }


        public Wizard getWizardOfFire () {
            return wizardOfFire;
        }
    }

