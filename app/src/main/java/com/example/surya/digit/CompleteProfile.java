package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CompleteProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
    }

    public void gotocompleteprofilenext(View view) {
        Intent i=new Intent(CompleteProfile.this,CompleteProfilenext.class);
        startActivity(i);
    }
}
