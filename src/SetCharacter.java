import java.util.ArrayList;
import java.util.List;



public class SetCharacter {

    static int nPlayers;

    String player1Name;
    String player2Name;
    String player3Name;

    String name;

    static List<String> playerNames = new ArrayList<>();

    int wChoiceP1 = 0;
    int wChoiceP2 = 0;
    int wChoiceP3 = 0;


    List<Player> wizards = new ArrayList<>();


    public void chooseName() {
        // CHOOSE NUM PLAYERS AND NAME

        System.out.println();
        System.out.print("Enter the number of players: ");
        nPlayers = Main.scanner.nextInt();

        if (nPlayers == 1) {
            System.out.println("What is your name wizard?");
            player1Name = Main.scanner.next();


        }

        if (nPlayers == 2) {
            System.out.println("Player 1; what is your name?");
            player1Name = Main.scanner.next();

            System.out.println("Player 2, what is your name?");
            player2Name = Main.scanner.next();

        }

        if (nPlayers == 3) {
            System.out.println("Player 1, what is your name?");
            player1Name = Main.scanner.next();


            System.out.println("Player 2, what is your name?");
            player2Name = Main.scanner.next();


            System.out.println("Player 3, what is your name?");
            player3Name = Main.scanner.next();


        } else if (nPlayers >= 4) {
            System.out.println("There can only be max 3 players, please try again");

        }

        playerNames.add(player1Name);
        playerNames.add(player2Name);
        playerNames.add(player3Name);

    }

    public void chooseWizard() {


        // CHOOSE WIZARD
        if (nPlayers == 1) {

            Boolean chooseW = false;

            System.out.println();
            System.out.println(player1Name + " Choose your Wizard");

            do {

                displayMenu();

                int option = getOption();

                if (option == 1) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(0).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(0));
                    }
                } else if (option == 2) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(1).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(1));
                    }
                } else if (option == 3) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(2).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(2));
                    }


                } else if (option == 4) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(3).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(3));
                    }


                } else if (option == 5) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(4).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(4));
                    }
                } else if (option == 6) {
                    System.out.println("Exiting.....");
                    break;
                }

                if (wChoiceP1 == 1) {
                    chooseW = true;
                }


            } while (chooseW = false);

        }

        //2 players
        if (nPlayers == 2) {

            Boolean chooseW = false;

            System.out.println();
            System.out.println(player1Name + " Choose your Wizard");

            do {

                displayMenu();

                int option = getOption();

                if (option == 1) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(0).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(0));
                    }
                } else if (option == 2) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(1).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(1));
                    }
                } else if (option == 3) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(2).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(2));
                    }


                } else if (option == 4) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(3).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(3));
                    }


                } else if (option == 5) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(4).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(4));
                    }
                } else if (option == 6) {
                    System.out.println("Exiting.....");
                    break;
                }

                if (wChoiceP1 == 1) {
                    chooseW = true;
                }


            } while (chooseW = false);

           //player 2
            Boolean chooseW2 = false;

            System.out.println();
            System.out.println(player2Name + " Choose your Wizard");

            do {

                displayMenu();

                int option = getOption();

                if (option == 1) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(0).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(0));
                    }
                } else if (option == 2) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(1).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(1));
                    }
                } else if (option == 3) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(2).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(2));
                    }


                } else if (option == 4) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(3).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(3));
                    }


                } else if (option == 5) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(4).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(4));
                    }
                } else if (option == 6) {
                    System.out.println("Exiting.....");
                    break;
                }

                if (wChoiceP2 == 1) {
                    chooseW2 = true;
                }


            } while (chooseW2 = false);


        }

        if (nPlayers == 3) {
            Boolean chooseW = false;

            System.out.println();
            System.out.println(player1Name + " Choose your Wizard");

            do {

                displayMenu();

                int option = getOption();

                if (option == 1) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(0).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(0));
                    }
                } else if (option == 2) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(1).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(1));
                    }
                } else if (option == 3) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(2).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(2));
                    }


                } else if (option == 4) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(3).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(3));
                    }


                } else if (option == 5) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(4).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP1 == 1) {
                        wizards.add(p.playerList.get(4));
                    }
                } else if (option == 6) {
                    System.out.println("Exiting.....");
                    break;
                }

                if (wChoiceP1 == 1) {
                    chooseW = true;
                }


            } while (chooseW = false);

            //player 2
            Boolean chooseW2 = false;

            System.out.println();
            System.out.println(player2Name + " Choose your Wizard");

            do {

                displayMenu();

                int option = getOption();

                if (option == 1) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(0).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(0));
                    }
                } else if (option == 2) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(1).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(1));
                    }
                } else if (option == 3) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(2).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(2));
                    }


                } else if (option == 4) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(3).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP2 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(3));
                    }


                } else if (option == 5) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(4).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP1 = Main.scanner.nextInt();

                    if (wChoiceP2 == 1) {
                        wizards.add(p.playerList.get(4));
                    }
                } else if (option == 6) {
                    System.out.println("Exiting.....");
                    break;
                }

                if (wChoiceP2 == 1) {
                    chooseW2 = true;
                }


            } while (chooseW2 = false);

            //player 3
            Boolean chooseW3 = false;

            System.out.println();
            System.out.println(player3Name + " Choose your Wizard");

            do {

                displayMenu();

                int option = getOption();

                if (option == 1) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(0).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP3 = Main.scanner.nextInt();

                    if (wChoiceP3 == 1) {
                        wizards.add(p.playerList.get(0));
                    }
                } else if (option == 2) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(1).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP3 = Main.scanner.nextInt();

                    if (wChoiceP3 == 1) {
                        wizards.add(p.playerList.get(1));
                    }
                } else if (option == 3) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(2).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP3 = Main.scanner.nextInt();

                    if (wChoiceP3 == 1) {
                        wizards.add(p.playerList.get(2));
                    }


                } else if (option == 4) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(3).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP3 = Main.scanner.nextInt();

                    if (wChoiceP3 == 1) {
                        wizards.add(p.playerList.get(3));
                    }


                } else if (option == 5) {
                    Players p = new Players();
                    System.out.println(p.playerList.get(4).getDescription());
                    System.out.println();
                    System.out.println("To choose this Wizard, press [1] to exit press [2]");
                    wChoiceP3 = Main.scanner.nextInt();

                    if (wChoiceP3 == 1) {
                        wizards.add(p.playerList.get(4));
                    }
                } else if (option == 6) {
                    System.out.println("Exiting.....");
                    break;
                }

                if (wChoiceP3 == 1) {
                    chooseW3 = true;
                }


            } while (chooseW3 = false);
        }





    }
    private static void displayMenu () {
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


    static int getOption () {
        System.out.print("\nEnter option: ");
        int option = Main.scanner.nextInt();
        Main.scanner.nextLine();
        System.out.println();
        return option;
    }

    public List<String> getPlayerNames() {
        return playerNames;
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

    public int getnPlayers() {
        return nPlayers;
    }

    @Override
    public String toString() {
        return "SetCharacter{" +
                "wizards=" + wizards +
                '}';
    }



}
