package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Battle {

    public static void targetedAttack(Hero player, ArrayList<Monster> ennemies) {
        Scanner scan = new Scanner(System.in);
        // String enemiesName = "";  class arraylist ennemies à faire
        System.out.println("Who shall you strike?");//+ enemiesName);

        for (Monster ennemy : ennemies) {
            System.out.print(ennemies.indexOf(ennemy) + "-");
            System.out.print(ennemy.getName() + "  |  ");

        }

        Integer target = scan.nextInt();

        for (Monster enemy : ennemies) {

            if (ennemies.indexOf(enemy) == target) {
                enemy.takeHit(player.attack());
            }
            ;
        }
        ennemies.removeIf(element -> (element.getHp() <= 0));
    }

    public static void printFightersStatus(Hero player, ArrayList<Monster> ennemies) {
        System.out.println(player.getName() + " -- " + player.getHp());
        for (Monster ennemy : ennemies) {
            System.out.print(ennemy.getName() + " -- " + ennemy.getHp() + " | ");
        }
        System.out.println();
    }

    public static void battle(Hero player, ArrayList<Monster> ennemies) {

        String ennemiesName = "";
        for (Monster ennemy : ennemies) {
            ennemiesName = ennemiesName + " " + ennemy.getName() + "?";
        }
//        System.out.println("The great" + enemiesName + " appear before you, screeching, howling");
        System.out.println("The great hero " + player.getName() + " has encountered monsters!");

        Integer ennemiesCurrentHealth;
        do {
            printFightersStatus(player, ennemies);
            ennemiesCurrentHealth = 0;
            //pas propre ça
            for (boolean i = false; i == false; ) {
                Scanner scan = new Scanner(System.in);
                System.out.println("What will you do?");
                System.out.print("1 - fight   | 2 - flee  : ");
                try {

                    int choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            targetedAttack(player, ennemies);
                            i = true;
                            break;

                        case 2:
                            player.flee();
                            i = true;
                            break;

                        default:
                            System.out.println("What are you doing? There's a monster here, make your choice!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Did you get hit too hard in the head?");
                }
            }

            //Tour des monstres, chacun attaque le joueur si vivant.
            for (Monster ennemy : ennemies) {
                if (ennemy.getHp() > 0 && player.getHp() > 0) {
                    player.takeHit(ennemy.attack());
                }
                //Calcule la vie restante des monstres à la fin du tour.
                ennemiesCurrentHealth = ennemiesCurrentHealth + ennemy.getHp();
            }
            //--------------------------------------------------------------------
        }
        while (player.getHp() > 0 && ennemiesCurrentHealth > 0);
    }
}