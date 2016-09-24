package com.example.eyankiv.hw1;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void btnGoThirdActivity(View view) {
        Intent intent = new Intent(this,ThirdActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//this will kill current activity before opening new one.
        startActivity(intent);
        finish();
    }

    public void btnGoMainActivity(View view) {
        finish();
    }
}
