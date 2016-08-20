package com.company;


public class MyList1 implements Listable {

    private int[] nums;
    private int pos;


    public MyList1(){
        nums = new int[10];
        pos = 0;

    }

    @Override
    public void add(int num) {
        if(pos == nums.length){//out of space
            int[] tempNums = new int[nums.length+1];
            for (int i = 0; i < nums.length; i++) {
                tempNums[i] = nums[i];
            }
            for (int i = 0; i < tempNums.length; i++) {
                nums[i] = tempNums[i];
            }
        }
        nums[++pos] = num;


    }

    @Override
    public void remove(int index) {

        int[] tempNums = new int[nums.length-1];
        for (int i = 0; i < nums.length; i++) {
            if(i<index){
                tempNums[i] = nums[i];
            }
            else if(i > index){
                tempNums[i-1] = nums[i];
            }
        }
        nums = new int[nums.length-1];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = tempNums[i];
        }

    }

    @Override
    public void addAt(int index, int num) {

    }

    @Override
    public void set(int index, int num) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public int indexOf(int num) {
        return 0;
    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
