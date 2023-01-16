package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class small extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.small);
    }
    public void donus26(View v)
    {
        Intent intent=new Intent(small.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus27(View v)
    {
        Intent intent=new Intent(small.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus28(View v)
    {
        Intent intent=new Intent(small.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus29(View v)
    {
        Intent intent=new Intent(small.this, ekipman.class);
        startActivity(intent);
    }
}