package com.example.yevgeni.tictachome;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.Telephony.Mms.Part.TEXT;

/**
 * Created by yevgeni on 12/11/2016.
 */

public class GameOverFragmentDialog extends DialogFragment {
    public static final String TEXT = "text";
    public static final String TITLE = "title";
    private String txt;
    private String title;

    private  GameOverDialogListener listener;

    public void setListener(GameOverDialogListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.game_over_xml,container);
        TextView txtGameOver =(TextView)view.findViewById(R.id.txtGameOver);
        txtGameOver.setText(txt);
        Button newGameBtn = (Button)view.findViewById(R.id.btnNewGame);
        newGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null)
                    listener.onStartNewGame();
                dismiss();
            }
        });
        getDialog().setTitle(title);//ask regarding this part
        return view;
    }

    @Override
    public void setArguments(Bundle args) {
        if(args != null){
            txt = args.getString(TEXT);
            title = args.getString(TITLE);
        }


    }

    public static interface GameOverDialogListener{
        void onStartNewGame();
    }
}
