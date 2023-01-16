package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class large extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.large);
    }

    public void donus34(View v)
    {
        Intent intent=new Intent(large.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus35(View v)
    {
        Intent intent=new Intent(large.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus36(View v)
    {
        Intent intent=new Intent(large.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus37(View v)
    {
        Intent intent=new Intent(large.this, ekipman.class);
        startActivity(intent);
    }
}