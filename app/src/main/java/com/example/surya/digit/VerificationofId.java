package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerificationofId extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificationof_id);
    }

    public void gotoselectDocumnet(View view) {
        Intent i=new Intent(VerificationofId.this,SelectDocument.class);
        startActivity(i);

    }

    public void gotoselectDocumnetem(View view) {
        Intent i=new Intent(VerificationofId.this,SelectDocument.class);
        startActivity(i);
    }

    public void gotoselectDocumneted(View view) {
        Intent i=new Intent(VerificationofId.this,SelectDocument.class);
        startActivity(i);
    }
}
