package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class medium extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium);
    }
    public void donus30(View v)
    {
        Intent intent=new Intent(medium.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus31(View v)
    {
        Intent intent=new Intent(medium.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus32(View v)
    {
        Intent intent=new Intent(medium.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus33(View v)
    {
        Intent intent=new Intent(medium.this, ekipman.class);
        startActivity(intent);
    }
}