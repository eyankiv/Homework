package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Distance is: "+distance(5,8));
        System.out.println("Product is: "+multiply(3,12));
        System.out.println("x contains y exactly: "+containIn(3,7));
        System.out.println("x left over y: "+leftOver(3,11));
    }


    public static int distance(int a,int b){
        int small = a;
        int big = b;
        if(a>b){
            small=b;
            big=a;
        }
        int result = 0;
        while(small + result < big)
            result++;
        return result;
    }


    public static int multiply(int a, int b){
        int small = a;
        int big = b;
        if(a>b){
            small=b;
            big=a;
        }
        int result = 0;
        for (int i = 0; i < small; i++) {
            result += big;
        }
        return result;
    }

    public static int containIn(int x, int y){
        int result = 0;
        int count = 0;
       while(x+result<=y){
           result+=x;
           count++;
       }
        return count;
    }
//Left over functions start here
    public static int wholeIn(int x, int y){
        int wholeNum = 0;
        while(x+wholeNum<=y){
            wholeNum+=x;
        }
        return wholeNum;
    }

    public static int leftOver(int x, int y){
        int wholeInt = wholeIn(x,y);
        int left = 0;
        while(wholeInt + left < y)
            left++;
        return left;
    }
}
