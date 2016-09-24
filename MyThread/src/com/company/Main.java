package com.company;

public class Main {

    public static void main(String[] args) {


        String [] words = {"zero","one","two","three","four","five"};
        String word = "three";

        SearchThread.ItemFoundListener listener = new SearchThread.ItemFoundListener(){

            int positionByThread1 = -2;
            int positionByThread2 = -2;
            boolean  proceed = true;


            @Override
            public void itemFound(int id, int position) {
                if (id == 1)
                    positionByThread1  = position;
                else
                    positionByThread2 = position;

                if(position == -1) {
                    if (positionByThread1 == positionByThread2)
                        System.out.println("not found");
                }else{
                    System.out.println("found at "+ position +" by Thread  "+id);
                    proceed = false;
                }

            }

            @Override
            public boolean proceed() {
                return proceed;
            }
        };

        SearchThread t1 = new SearchThread(0,words.length/2,words,word,listener ,1);
        SearchThread t2 = new SearchThread(words.length/2,words.length,words,word,listener,2);
        t1.start();
        t2.start();


    }











}
