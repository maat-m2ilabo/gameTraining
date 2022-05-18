package fr.neobab;
import java.util.ArrayList;
import java.util.Scanner;
public class PickSquad {
    public static ArrayList pickSquad() {
        ArrayList<Fighter> fighters = new ArrayList<>();
        ArrayList<Fighter> squad = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int chooseFighter;
        fighters = GeneratePool.generateFighters();

        System.out.println("Choisissez 5 combatants \n");
        for (int i = 0; i < fighters.size(); i++) {
            System.out.println("Fighter N°" + (i+1) + " : " + fighters.get(i).getName());
            System.out.print(" \n Voulez-vous choisir ce combatant ? (1 pour oui, 2 pour non) : ");
            chooseFighter = scanner.nextInt();
            if (chooseFighter == 1) {
                squad.add(new Fighter(
                        fighters.get(i).getId(),
                        fighters.get(i).getName(),
                        fighters.get(i).getPunchline(),
                        fighters.get(i).getHitPoints(),
                        fighters.get(i).getAttackDmg(),
                        fighters.get(i).getArmorValue()));
                if (squad.size() == 5) {
                    break;
                } continue;
            } continue;
        }
        System.out.println("Félicitation, vous avez terminé votre séléction !");
        for (int i=0; i<squad.size();i++) {
            String squadToFormat = fighters.get(i).toString();
            System.out.println("Vous avez choisi : " + squadToFormat);
        }
        return squad;
    }
}
