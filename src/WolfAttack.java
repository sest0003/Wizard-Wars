import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WolfAttack {

    public void wolAttack() {

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice computer1 = new Dice();
        Dice computer2 = new Dice();

        int wolfs = 715;

       Player player1 = new Player(200, 20, 10,10);
        Player player2 = new Player(200, 20, 20,10);

    Scanner scanner = new Scanner(System.in);


        System.out.println();
        System.out.print("Number of wizards: ");

    int nPlayers = scanner.nextInt();

        if (nPlayers == 1) {

            System.out.println(player1);
            System.out.println(player2);
        }

        else if (nPlayers == 2) {



            int sumOfP1 = player1.getKnowledge();
        sumOfP1 += player1.getGold();
        sumOfP1 += player1.getTower();

        int sumOfP2 = player2.getKnowledge();
        sumOfP2 += player2.getGold();;
        sumOfP2 += player2.getTower();




        System.out.println(sumOfP1);
        System.out.println(sumOfP2);



        StoryLineTheWolfs();

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("the wolfs attacks with " + wolfs + "\nPlayer1, cast you spell by entering: 1 ");
            scanner.nextInt();

            int sumOfDicesP1 = d1.getDice() + d2.getDice();

            int somOfWolfs1 = computer1.getDice() + computer2.getDice();

            System.out.println("Player 1 rolled an " + sumOfDicesP1 );
            System.out.println();
            System.out.println("The wolfs attacked with " + somOfWolfs1);
            System.out.println();


            System.out.println("Player 2, Attack!: ");
            scanner.nextInt();

            int sumOfDicesP2 = d1.getDice() + d2.getDice();

            int somOfWolfs2 = computer1.getDice() + computer2.getDice();

            System.out.println("Player 2 rolled an " + sumOfDicesP2 );
            System.out.println();
            System.out.println("The wolfs attacked with " + somOfWolfs2);
            System.out.println();

            int sumWolfsTotal = somOfWolfs1 + somOfWolfs2 + wolfs;
            int sumOfPlayerTotal = sumOfDicesP1 + sumOfDicesP2 + sumOfP1 + sumOfP2;

            if (sumOfPlayerTotal > sumWolfsTotal) {
                System.out.println("The wolfs are fucked!.. and dead \n\nWolfs : " + sumWolfsTotal + "\nYou: " + sumOfPlayerTotal);

            } else if (sumOfPlayerTotal == sumWolfsTotal) {
                System.out.println("Draw! , but this does not look good for you, and the wolfs couldnt care less.   \n\nWolfs : " + sumWolfsTotal + "\nYou: " + sumOfPlayerTotal);

            }
            else {
                System.out.println(" you are fucked!...and dead.......\n\nWolfs : " + sumWolfsTotal + "\nYou: " + sumOfPlayerTotal);
            }
        }

        else if (choice == 2) {
            int newCloakP1 = player1.getCloak() - 10;
            int newCloakP2 = player2.getCloak() - 10;
            player1.setCloak(newCloakP1);
            player2.setCloak(newCloakP2);
            System.out.println("Detour!\n -10 in Armour");
        }


    }














}

    private static void storyLineRedwoods() {
        System.out.println();
        System.out.println("^*^* The battle of Redwoods ^*^* ");
    }
    private static void StoryLineTheWolfs() {
        System.out.println();

        System.out.println("On the way to the Redwoods you run into a pack of wolfs, do you try to kill them or take ");
        System.out.println("detour and arrive to the battle with -10 in Armor? , attack enter 1 / detour enter 2: ");
    }




}
