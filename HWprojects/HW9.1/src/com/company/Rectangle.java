package com.company;

/**
 * Created by eyankiv on 02-Aug-16.
 */
public class Rectangle {
    private int width, height;

    public Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);
    }

    public void setWidth(int width){
        if(width>=0)
            this.width = width;
    }
    public void setHeight(int height){
        if(this.height >=0)
            this.height = height;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public double area(){
        return width * height;
    }
}
