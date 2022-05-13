package org.example;


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

    public void display(Player player){
        for (int i = 0 ; i < this.size ; i++) {
            for (int y = 0; y < this.size; y++) {
                this.grid[i][y] = "X";
            }
        }
        this.grid[player.getPosX()][player.getPosY()] = player.getToken();
        printmap();
    }








    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }






}
