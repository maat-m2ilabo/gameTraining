package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Map {

    private String[][] grid ;
    private int size;
    public Map(int size) {
        this.grid = new String[size][size];
        this.size = size;
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(int x, int y, String token) {
        grid[x][y] = token;
    }

    public void printmap(){
        for (int i = 0 ; i < size ; i++){
            System.out.println(Arrays.deepToString(grid[i]));
        }
    }

    public void display(Character character, ArrayList<Monster> ennemies){
        for (int i = 0 ; i < this.size ; i++) {
            for (int y = 0; y < this.size; y++) {
                this.grid[i][y] = ".";
            }
        }
        this.grid[character.getPosX()][character.getPosY()] = character.getToken();
        for (Monster ennemy : ennemies) {
            this.grid[ennemy.getPosX()][ennemy.getPosY()] = ennemy.getToken();
        }
        printmap();
    }








    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }






}
