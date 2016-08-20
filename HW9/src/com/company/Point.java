package com.company;

/**
 * Created by eyankiv on 08-Aug-16.
                        */
    public class Point {
                private int x,y;
                private Integer s;

    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        if(x < 0)
            return;
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        if(y < 0)
            return;
        this.y=y;
    }

    public double distanceTo(Point other){
        int deltaX = this.x - other.x;
        int deltaY = this.y - other.y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
}
