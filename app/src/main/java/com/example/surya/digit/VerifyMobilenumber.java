package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerifyMobilenumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_mobilenumber);
    }

    public void gotocompleteprofile(View view) {
        Intent i=new Intent(VerifyMobilenumber.this,CompleteProfile.class);
        startActivity(i);
    }
}
