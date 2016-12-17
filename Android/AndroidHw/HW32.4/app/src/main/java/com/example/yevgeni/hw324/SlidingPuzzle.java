package com.example.yevgeni.hw324;

/**
 * Created by yevgeni on 13/12/2016.
 */

public class SlidingPuzzle {
    private int size;
    private int emptyPiece;
    private int movingPiece;

    public enum moveResult{
        VALID_MOVE,INVALID_MOVE,OUT_OF_BOUNDS
    }

    public SlidingPuzzle(int size) {
        this.size = size;
    }

    public void setMovingPiece(int movingPiece) {
        this.movingPiece = movingPiece;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void setEmptyPiece(int emptyPiece) {
        this.emptyPiece = emptyPiece;
    }

    public moveResult makeAmove(int size,int emptyPiece, int movingPiece){
        //if (emptyPieceArrayPosition > -1 && movingPiece > -1 && emptyPieceArrayPosition< size * size && movingPiece <size*size){
            if ((Math.abs(emptyPiece-movingPiece) == 1)|| (Math.abs(emptyPiece-movingPiece) == size))
                return moveResult.VALID_MOVE;
            return moveResult.INVALID_MOVE;
        //}
        //return moveResult.OUT_OF_BOUNDS;
    }

    /*public void victoryCheck(){

    }*/





}

