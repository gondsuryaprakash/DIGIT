package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EnterDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_detail);
    }

    public void gotouploadimageagain(View view) {
        Intent i=new Intent(EnterDetail.this,uploadimageagain.class);
        startActivity(i);
    }
}
