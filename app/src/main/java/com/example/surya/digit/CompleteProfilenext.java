package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CompleteProfilenext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profilenext);
    }

    public void gotobegincheck(View view) {
        Intent i=new Intent(CompleteProfilenext.this,Begincheck.class);
        startActivity(i);
    }
}
