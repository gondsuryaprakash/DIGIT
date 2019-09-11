package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Begincheck extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begincheck);
    }

    public void gotoverificationid(View view) {
        Intent i=new Intent(Begincheck.this,VerificationofId.class);
        startActivity(i);
    }
}
