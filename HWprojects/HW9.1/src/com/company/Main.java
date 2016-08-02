package com.company;

public class Main {

    public static void main(String[] args) {
       // Canvas[][] mySquare = new Canvas[3][4];
        drawRectangle(4,5);
    }



    public static void drawRectangle(int width, int height){
       //method efficient old
        /* for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < height-2; i++) {
            System.out.print("*");
            for (int j = 0; j < width-2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }*/

        //method simple old
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean isStar= i==0|| i==height-1 || j==0 || j== width-1;
                System.out.print(isStar? "*" : " ");
            }
            System.out.println();
        }


    }
}
