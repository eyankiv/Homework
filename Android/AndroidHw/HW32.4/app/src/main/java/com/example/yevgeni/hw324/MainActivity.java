package com.example.yevgeni.hw324;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    LinearLayout board;
    int size = 3;
    int boardSize = size*size;
    SlidingPuzzle game;
    int[] puzzlePieces;
    int emptyPieceArrayPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        puzzlePieces = new int[boardSize];

        board = (LinearLayout)findViewById(R.id.boardLayout);
        game = new SlidingPuzzle(size);

        int width = board.getLayoutParams().width;
        int margin = 5;
        int buttonSize = (width/size-(margin*(size-1)));

        for (int i = 0; i < size; i++) {
            LinearLayout row = new LinearLayout(this);
            row.setOrientation(LinearLayout.HORIZONTAL);

            for (int j = 0; j < size; j++) {
                int puzzleCell = i*size+j+1;
                Button puzzlePiece = new Button(this);
                puzzlePiece.setOnClickListener(puzzleMoveListener);
                // cell with tag 9 is the empty cell
                puzzlePiece.setText((puzzleCell ==(boardSize))? "" : String.valueOf(puzzleCell));
                int arrayPiecePos = puzzleCell-1;
                this.puzzlePieces[arrayPiecePos] = puzzleCell;
                emptyPieceArrayPosition = boardSize-1;  // this will be used for initial position of puzzlePiece[position] of empty piece
                //so to clarify puzzlePieces[emptyPieceArrayPosition] = where the current empty piece is in this case puzzlePieces[8] = 9;
                LinearLayout.LayoutParams puzzlePieceLayout =
                        new LinearLayout.LayoutParams(buttonSize, buttonSize);
                puzzlePieceLayout.setMargins(margin, margin, margin, margin);
                puzzlePiece.setTag(puzzleCell);
                row.addView(puzzlePiece,puzzlePieceLayout);
            }
            LinearLayout.LayoutParams rowLayout =
                    new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            board.addView(row,rowLayout);
        }
    }

    private View.OnClickListener puzzleMoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            String emptyPieceText = "";
            String movingPieceText= "";
            int tag = (Integer)view.getTag();

            Button b = (Button)view.findViewWithTag(tag);
            Button emptyButton = (Button)board.findViewWithTag((emptyPieceArrayPosition+1));//tag is object but this is an int

            int emptyPieceValue = puzzlePieces[emptyPieceArrayPosition]; // value of empty piece
            int movingPiecePosition = tag -1;
            int movingPieceValue = puzzlePieces[movingPiecePosition]; //value of moving piece

            if(tag==emptyPieceValue)
                Toast.makeText(MainActivity.this, "You clicked on an Empty Piece", Toast.LENGTH_SHORT).show();
            Toast.makeText(MainActivity.this, "you clicked on a piece "+tag, Toast.LENGTH_SHORT).show();
            SlidingPuzzle.moveResult moveResult = game.makeAmove(size,(emptyPieceArrayPosition+1),tag);
            if(moveResult == SlidingPuzzle.moveResult.VALID_MOVE){
                int tempArrayValue; //temp storage for switching value between empty and moving piece
                tempArrayValue = emptyPieceValue;
                emptyPieceValue = movingPieceValue;
                movingPieceValue = tempArrayValue;

                puzzlePieces[emptyPieceArrayPosition] = movingPieceValue; // changing empty piece in array to moving piece value;
                puzzlePieces[movingPiecePosition] = emptyPieceValue;
                emptyPieceArrayPosition = movingPiecePosition; // here we set the new location of the emptyPiece location in the array.

                // now we switch the text between the two buttons
                //first we get the text
                emptyPieceText = emptyButton.getText().toString();
                movingPieceText = b.getText().toString();
                //now we switch the text
                emptyButton.setText(movingPieceText);
                b.setText(emptyPieceText);

            } else if(moveResult == SlidingPuzzle.moveResult.INVALID_MOVE){
                Toast.makeText(MainActivity.this, "Invalid Move", Toast.LENGTH_SHORT).show();
            } else if (moveResult == SlidingPuzzle.moveResult.OUT_OF_BOUNDS){
                Toast.makeText(MainActivity.this, "You are out of bounds", Toast.LENGTH_SHORT).show();
            }

        }
    };

    public void startGameRandomizer(){
        //// TODO: 17/12/2016 create a move randomizer that allows to choose how many moves forward
        // TODO: 17/12/2016 the computer will move the pieces, it will work by randomizing numbers 1 to 9 and moving only when a valid move will come up in the randomizer

    }


}
