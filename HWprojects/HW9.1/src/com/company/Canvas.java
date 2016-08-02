package com.company;

/**
 * Created by eyankiv on 02-Aug-16.
 */
public class Canvas {
    private boolean[][] canvas;

    public void setCanvas(boolean[][] canvas) {
        this.canvas = canvas;
    }

    public void drawRectangle(int width, int height){
       // boolean isStar= i==0|| i==height-1 || j==0 || j== width-1;
        //out.print(isStar? "*" : " ");


    }

    public void renderScreen(){
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j];
            }
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
