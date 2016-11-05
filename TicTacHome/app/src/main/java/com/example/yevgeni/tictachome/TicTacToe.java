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

public class TicTacToe extends LinearLayout {
    Button b;

    char[] ticArray = new char[9];
    boolean player = true; //false = player x; true = player 0.
    int turn = 0;

    public TicTacToe(Context context) {
        super(context);
        super.setOrientation(VERTICAL);

        LinearLayout topRow = new LinearLayout(context);
        topRow.setOrientation(HORIZONTAL);

        LinearLayout midRow = new LinearLayout(context);
        midRow.setOrientation(HORIZONTAL);

        LinearLayout bottomRow = new LinearLayout(context);
        bottomRow.setOrientation(HORIZONTAL);

        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        this.addView(topRow,layoutParams);
        this.addView(midRow,layoutParams);
        this.addView(bottomRow,layoutParams);

        for (int i = 0; i < 9; i++) {
            b = new Button(context);
            b.setTag(i);
            switch (i)
            {
                case 0:
                case 1:
                case 2:
                        topRow.addView(b,layoutParams);
                    break;
                case 3:
                case 4:
                case 5:
                        midRow.addView(b,layoutParams);
                    break;
                case 6:
                case 7:
                case 8:
                        bottomRow.addView(b,layoutParams);
                    break;
            }
            b.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button btn = (Button)view;
                    //Toast.makeText(getContext(),"You Pressed button num "+view.getTag(),Toast.LENGTH_SHORT).show();
                    btn.setText(player?"X":"O");
                    int tag = Integer.valueOf(view.getTag().toString());
                    // false = x, true = o;
                    ticArray[tag] = player? 'X' : 'O';
                    player = !player;
                    turn++;
                    btn.setEnabled(false);
                    Toast.makeText(getContext(), Arrays.toString(ticArray), Toast.LENGTH_SHORT).show();
                        if (ticArray[0]== 'X' && ticArray[1]== 'X' && ticArray[2] =='X'){
                                Toast.makeText(getContext(),"The winner is X",Toast.LENGTH_SHORT).show();
                        }
                        if ((ticArray[0]== 'O' && ticArray[1]== 'O' && ticArray[2] =='O'))
                        Toast.makeText(getContext(),"The winner is O",Toast.LENGTH_SHORT).show();





                }
            });

        }

    }

}
