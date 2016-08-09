package com.company;

/**
 * Created by eyankiv on 02-Aug-16.
 */
public class Canvas {
    private boolean[][] canvas;

    public Canvas(){
        canvas = new boolean[40][60];
    }

    public void drawRectangle(int x, int y,int width, int height){
        for (int i = 0; i < height; i++) {
            canvas[y+i][x] = true;
            canvas[y+i][x + width-1]= true;
        }
        for (int i = 0; i < width; i++) {
            canvas[y][x+i] = true;
            canvas[y+ height -1][x+i] = true;
    }

    }

    public void renderScreen(){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] ? "*" : " " );
            }
            System.out.println();
        }
    }
    //efficient method
    /*for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < height-2; i++) {
            System.out.print("*");
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }*/

    /*public void renderScreen(){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.println("*");
            }
        }
    }*/
}
