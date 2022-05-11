package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class battle {

    public static void fight(Hero player, Monster enemy){
        System.out.println("The great " + enemy.getName() + " appears before you, screeching, howling");

        do {
            for (int i = 0 ; i == 0; ) {
                Scanner scan = new Scanner(System.in);
                System.out.println("What will you do?");
                System.out.print("1 - fight   | 2 - flee  : ");
                try{

                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            enemy.takeHit(player.attack());
                            i++;
                            break;

                        case 2:
                            player.flee();
                            i++;
                            break;

                        default:
                            System.out.println("What are you doing? There's a monster here, make your choice!");
                    }
                } catch (InputMismatchException e) {
                    //scan.close();
                    System.out.println("Did you get hit too hard in the head?");
                }

            }
            if (enemy.getHp() > 0) {
                player.takeHit(enemy.attack());
            }
        }
        while (player.getHp() > 0 && enemy.getHp() > 0) ;
    }

}
