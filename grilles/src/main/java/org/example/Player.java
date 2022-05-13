package org.example;

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
        map.setGrid(posX, posY, "X");
        posX +=1;
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
