package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class uploadimageagain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploadimageagain);
    }

    public void gotoverificacomple(View view) {
        Intent i=new Intent(uploadimageagain.this,verificationcomplete.class);
        startActivity(i);
    }
}
