import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int wolfs = 700;

        Scanner scanner = new Scanner(System.in);

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        Dice computer1 = new Dice();
        Dice computer2 = new Dice();


        List<Player> players = new ArrayList<>();

        players.add(new Player(200, 30, 50, 10, 60,5));
        players.add(new Player(200, 20, 60, 10,50, 10));







        System.out.println();
        System.out.print("Number of wizards: ");
        int nop = scanner.nextInt();

        if (nop == 1) {
          Player player1 = players.get(0);
        }

        else if (nop == 2) {
            Player player1 = players.get(0);
            Player player2 = players.get(1);

            int sumOfP1 = player1.getKnowledge();
            sumOfP1 += player1.getArmor();
            sumOfP1 += player1.getGold();
            sumOfP1 += player1.getAttack();
            sumOfP1 += player1.getSpells();
            sumOfP1 += player1.getTower();

            int sumOfP2 = player2.getKnowledge();
            sumOfP2 += player2.getArmor();
            sumOfP2 += player2.getGold();
            sumOfP2 += player2.getAttack();
            sumOfP2 += player2.getSpells();
            sumOfP2 += player2.getTower();


            storyLineRedwoods();

            System.out.println();

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


                System.out.println("Player 2, Attack! : ");
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
                    System.out.println("The wolfs are slayed!!\n Wolfs : " + sumWolfsTotal + "\nYou: " + sumOfPlayerTotal);

                }
            }

            else if (choice == 2) {
               int newArmourP1 = player1.getArmor() - 10;
               int newArmourP2 = player2.getArmor() - 10;
                player1.setArmor(newArmourP1);
                player2.setArmor(newArmourP2);
                System.out.println("Detour!\n -10 in Armour");
            }
            System.out.println(player1);
            System.out.println(player2);

        }














        }

    private static void storyLineRedwoods() {
        System.out.println();
        System.out.println("^*^* The battle of Redwoods ^*^* ");
    }
    private static void StoryLineTheWolfs() {
        System.out.println();

        System.out.println("On the way to the Redwoods you run in to a pack of wolfs, do you try to kill them or take ");
        System.out.println("detour and arrive to the battle with -10 in Armor? , attack enter 1 / detour enter 2: ");
    }

}






