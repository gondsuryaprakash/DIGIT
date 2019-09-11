package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EnterDetailP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_detail_p);
    }

    public void gotoEnterDetailp(View view) {
        Intent i=new Intent(EnterDetailP.this,uploadimageagain.class);
        startActivity(i);
    }
}
