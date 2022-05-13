package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new Map(10);
        Player mat = new Player("mat", "M", 0, 0);

        for (int z = 0; z < 9; z++) {

            map.display(mat);
            map.printmap();
            mat.move(map);
        }
    }
}