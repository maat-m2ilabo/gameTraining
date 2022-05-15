package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new Map(80);
        Character mat = new Character("mat", "M", 0, 0);

        for (int z = 0; z < 9; z++) {

            map.display(mat);
            mat.move(map);
        }
    }
}