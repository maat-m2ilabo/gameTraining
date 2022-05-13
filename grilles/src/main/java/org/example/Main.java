package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new Map(10);
        Player mat = new Player("mat", "M", 0, 0);

        for (boolean i = true; i = false;) {
            map.display(mat);
            map.printmap();
            mat.move(map);
            scanner.nextLine();
        }
    }
}