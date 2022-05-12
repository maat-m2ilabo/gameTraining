package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class battle {

    public static void targetedAttack(Hero player, ArrayList<Monster> enemies) {
        Scanner scan = new Scanner(System.in);
        // String enemiesName = "";  class arraylist ennemies à faire
        System.out.println("Who shall you strike?");//+ enemiesName);

        for (Monster enemy : enemies) {
            System.out.print(enemies.indexOf(enemy) + "-");
            System.out.print(enemy.getName() + "  |  ");

        }

        Integer target = scan.nextInt();

        for (Monster enemy : enemies) {

            if (enemies.indexOf(enemy) == target) {
                enemy.takeHit(player.attack());
            }
            ;
        }
        enemies.removeIf(element -> (element.getHp() <= 0));
    }

    public static void printFightersStatus(Hero player, ArrayList<Monster> enemies) {
        System.out.println(player.getName() + " -- " + player.getHp());
        for (Monster enemy : enemies) {
            System.out.print(enemy.getName() + " -- " + enemy.getHp() + " | ");
        }
        System.out.println();
    }

    public static void battle(Hero player, ArrayList<Monster> enemies) {

        String enemiesName = "";
        for (Monster enemy : enemies) {
            enemiesName = enemiesName + " " + enemy.getName() + "?";
        }
//        System.out.println("The great" + enemiesName + " appear before you, screeching, howling");
        System.out.println("The great hero " + player.getName() + " has encountered monsters!");

        Integer enemiesCurrentHealth;
        do {
            printFightersStatus(player, enemies);
            enemiesCurrentHealth = 0;
            //pas propre ça
            for (int i = 0; i == 0; ) {
                Scanner scan = new Scanner(System.in);
                System.out.println("What will you do?");
                System.out.print("1 - fight   | 2 - flee  : ");
                try {

                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            targetedAttack(player, enemies);

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
            for (Monster enemy : enemies) {
                if (enemy.getHp() > 0) {
                    player.takeHit(enemy.attack());
                }
                enemiesCurrentHealth = enemiesCurrentHealth + enemy.getHp();
            }
        }
        while (player.getHp() > 0 && enemiesCurrentHealth > 0);
    }
}
