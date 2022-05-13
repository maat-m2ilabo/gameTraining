package org.example;

import java.util.Scanner;

public class Player {
    private String name;
    private String token;
    private int posX;
    private int posY;

    public Player(String name, String token, int posX, int posY) {
        this.name = name;
        this.token = token;
        this.posX = posX;
        this.posY = posY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(Map map){
        Scanner scan = new Scanner(System.in);
        System.out.println("Which way?");
        System.out.println("z - top  |  s - bottom  |  q - left  |  d - right");
        String choice = scan.nextLine();
        map.setGrid(posX, posY, "X");
        switch (choice) {
            case "z":
                posX -= 1;
                break;
            case "s":
                posX += 1;
                break;
            case "q":
                posY -= 1;
                break;
            case "d":
                posY += 1;
                break;
        }
        map.setGrid(posX, posY, token);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
