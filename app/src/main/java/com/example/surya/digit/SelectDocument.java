package com.example.surya.digit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectDocument extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_document);
    }

    public void gotoEnterDetail(View view) {
        Intent i=new Intent(SelectDocument.this,EnterDetailP.class);
        startActivity(i);
    }

    public void gotoEnterDetailDL(View view) {
        Intent i=new Intent(SelectDocument.this,EnterDetail.class);
        startActivity(i);
    }

    public void gotoEnterDetailNID(View view) {
        Intent i=new Intent(SelectDocument.this,EnterDetail.class);
        startActivity(i);
    }

    public void gotoEnterDetailRP(View view) {
        Intent i=new Intent(SelectDocument.this,EnterDetail.class);
        startActivity(i);
    }
}
