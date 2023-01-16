package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class monitor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monitor);
    }
    public void donus10(View v)
    {
        Intent intent=new Intent(monitor.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus11(View v)
    {
        Intent intent=new Intent(monitor.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus12(View v)
    {
        Intent intent=new Intent(monitor.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus13(View v)
    {
        Intent intent=new Intent(monitor.this, ekipman.class);
        startActivity(intent);
    }
}