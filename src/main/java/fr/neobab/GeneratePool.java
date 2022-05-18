package fr.neobab;

import java.util.ArrayList;

public class GeneratePool {

    public static ArrayList<Fighter> generateFighters() {

        ArrayList<Fighter> fighters = new ArrayList<>();

        fighters.add(new Fighter(1,"Daemon","Il faisait moins chaud en enfer...", 400,40,40));
        fighters.add(new Fighter(2,"Electra","Le bruit de l'orage m'appaise", 350,45,40));
        fighters.add(new Fighter(3,"Starlight","Brillant même de nuit", 350,35,50));
        fighters.add(new Fighter(4,"Aealaenor","Le grand problème avec l'espace, c'est que c'est grand et vide.", 300,35,55));
        fighters.add(new Fighter(5,"Devilstrand","Fait de la meilleure fibre", 500,35,35));
        fighters.add(new Fighter(6,"Kasparov","Tu la verra sans doute pas venir", 550,35,30));
        fighters.add(new Fighter(7,"Vivmir","Je vais t'apprendre à respecter tes anciens", 250,25,70));
        fighters.add(new Fighter(8,"Lynceul","L'eternité c'est long, surtout vers la fin", 700,25,25));
        fighters.add(new Fighter(9,"Tyrael","Purger les hérétiques !", 250,70,25));
        fighters.add(new Fighter(10,"Ceheta","Ceheta était là et toi Tehete plus là", 800,20,20));

        return fighters;
    }

    public static ArrayList<Tank> generateTanks() {

        ArrayList<Tank> tanks = new ArrayList<>();

        tanks.add(new Tank(1,"Saela","J'aimais à cours d'idées !", 400,20,60));
        tanks.add(new Tank(2,"Narvaal","J'en ai refroidi des plus enflamés", 350,25,60));
        tanks.add(new Tank(3,"Helios","Brillant même de nuit... 2 !", 350,25,60));
        tanks.add(new Tank(4,"Myhriad","Le problèmes avec le vide, c'est que c'est plein d'espace", 300,25,65));
        tanks.add(new Tank(5,"Stellaria","D'une étoile à l'autre", 500,25,45));
        tanks.add(new Tank(6,"Ehlidel","La tendresse est une force", 550,15,50));
        tanks.add(new Tank(7,"Nvenha","MAYHEM !", 250,15,80));
        tanks.add(new Tank(8,"Serios","Un petit coup de dague bien placé et...", 700,15,35));
        tanks.add(new Tank(9,"Melamenahn","Sagesse, patiente et boule de feu viendront à bout de tout ennemi", 250,50,55));
        tanks.add(new Tank(10,"Levidim","Abracada...Plus là !", 800,10,30));

        return tanks;
    }


}
