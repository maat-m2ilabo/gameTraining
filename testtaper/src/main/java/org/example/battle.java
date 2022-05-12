package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class battle {

    public static void fight(Hero player, ArrayList<Monster> enemys) {
        String enemiesName = "";
        for (Monster enemy : enemys) {
            enemiesName = enemiesName + " " + enemy.getName() + ",";
        }
        System.out.println("The great" + enemiesName + " appear before you, screeching, howling");

        Integer enemiesCurrentHealth;
        do {
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
                            System.out.println("Who shall you strike?" + enemiesName);
                            String target = scan.next();
                            for (Monster enemy : enemys) {
                                if (enemy.getName().equals(target)) {
                                    enemy.takeHit(player.attack());
                                }
                            }

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
            for (Monster enemy : enemys) {
                if (enemy.getHp() > 0) {
                    player.takeHit(enemy.attack());
                }
                enemiesCurrentHealth = enemiesCurrentHealth + enemy.getHp();
            }
        }
        while (player.getHp() > 0 && enemiesCurrentHealth > 0);
    }
}
