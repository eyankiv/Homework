package com.company;

public class Main {

    public static void main(String[] args) {
        starGrid(5,6);
        starX(6);
        //starFrame(5,4);
        drawCircle(15, 10, 4); //from lecture

    }

    public static void starGrid(int x, int y){

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("(" + j +"," + i + ")");

            }
            System.out.println();

        }
    }

    /*public static void starX(int x){

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if(i==j||i+j==x-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }*/

    public static void starX(int x){
        System.out.println();
        System.out.println("Your "+x+" * long star:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                boolean isStar = i==j||i+j==x-1;
                System.out.print(isStar ? "*" : " ");
            }
            System.out.println();
        }
    }

    /*public static void starFrame(int x,int y){

       int i,j;
        for (i=0; i < y; i++) {
            for (j=0; j < x; j++) {
                if(i==0||j==0||i==y-1||j==x-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }*/

    public static void starFrame(int x,int y){
        System.out.println();
        System.out.println("Your "+x+" by "+y+" rectangle:");
        for (int i=0; i < y; i++) {
            for (int j=0; j < x; j++) {
                boolean isBox = i==0 || j==0|| i==y-1|| j==x-1;
                System.out.print(isBox ? "*" : " ");
            }
            System.out.println();
        }
    }
    // from lecture:

    public static void drawCircle(int a, int b, int radius) {
        for (int i = 0; i < b + radius + 10; i++) {
            for (int j = 0; j < a + radius + 10; j++) {
                System.out.print(isPointOnCircle(a, b, radius, j, i) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static boolean isPointOnCircle(int a, int b, int radius, int x, int y){
        int deltaX = a - x;
        int deltaY = b - y;
        int difference = (deltaX*deltaX + deltaY*deltaY) - radius * radius;
        if(difference < 0)
            difference *= -1;
        return difference < 5;
    }

}
