package com.example.yevgeni.tictachome;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Arrays;

/**
 * Created by yevgeni on 05/11/2016.
 */

public class TicTacToe  {
    Button b;

    public enum  CellValue{X,O,EMPTY}

    public enum  MoveResult{
        VALID_MOVE,INVALID_MOVE,WIN,DRAW
    }

    private CellValue[] ticArray;
    private boolean player;
    private int turnNumber;



    public TicTacToe() {
        ticArray = new CellValue[9];
        resetGame();

    }

    public void resetGame(){
        for (int i = 0; i < 9; i++) {
            ticArray[i] = CellValue.EMPTY;
        }
        player = true;
        turnNumber = 0;
    }



    public MoveResult makeMove(int cell){
        if(cell < 1 || cell >9)
            return MoveResult.INVALID_MOVE;
        cell--;
        if (ticArray[cell] == CellValue.EMPTY){
            turnNumber++;
            ticArray[cell] = player? CellValue.X : CellValue.O;
            player =!player;
            if (turnNumber>=5 && CheckVictory(cell)){
                return MoveResult.WIN;
            }
            if (turnNumber==9)
                return MoveResult.DRAW;
            return MoveResult.VALID_MOVE;

        }
        return MoveResult.INVALID_MOVE;

    }

    private boolean  CheckVictory(int cell){
        int row = cell/3;
        int column = cell%3;
        if (ticArray[column] == ticArray[column+3] && ticArray[column] == ticArray[column+6])
            return true;
        row *=3;
        if (ticArray[row] == ticArray[row+1] && ticArray[row]== ticArray[row+2])
            return true;
        //now we check diagonal
        if(cell %2 ==0){
            boolean diagonal1 = ticArray[0] != CellValue.EMPTY && ticArray[0]==ticArray[4] &&
                    ticArray[0] == ticArray[8];
            if (diagonal1)
                return  true;
            boolean diagonal2 = ticArray[2] != CellValue.EMPTY && ticArray[2]==ticArray[4] &&
                    ticArray[2] == ticArray[6];
            if (diagonal2)
                return  true;
        }
        return false;
    }

    public boolean getPlayer(){
        return player;
    }

    public int getTurn(){
        return turnNumber;
    }


}
