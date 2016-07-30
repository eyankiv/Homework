package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of self is : "+sumSelf(1555));
        System.out.println("The reverse of int is : "+reverseInt(120));
        System.out.println("The root of int is : "+rootInt(24));
    }

    public static int sumSelf(int x){
        int num=x;
        int sum=0;
        while(num>0){

            sum = sum + num%10;
            num = num /10;
        }
        return sum;
    }

    public static int reverseInt(int x){
        int num=x;
        int sum=0;
        while(num!=0){
            sum = sum*10+num%10;
            num=num/10;
        }
        return sum;
    }

    public static int rootInt(int x){
        int num = x;
        int sum = 0;
        int i=1;
        if(num==0 || num==1)
            return 1;

        while((num/i)!=i){
            i++;
            if((num/i)<i)
                return i;
//need to make a condition to check if it is not a valid root number and round up to the nearest root number
        }
        return i;
    }
}
