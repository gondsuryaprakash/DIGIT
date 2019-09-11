package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    Button getOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getOtp = (Button) findViewById(R.id.otpButton);
        getOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(SignUp.this,VerifyMobilenumber.class);
                startActivity(i);
            }
        });

    }

//    public void gotoverifymobile(View view) {
//        Intent i=new Intent(SignUp.this,VerifyMobilenumber.class);
//        startActivity(i);
//    }
//
//    public void gotoverifymobile1(View view) {
//        Intent i=new Intent(SignUp.this,VerifyMobilenumber.class);
//        startActivity(i);
//    }
}
