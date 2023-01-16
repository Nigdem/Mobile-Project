package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mouse);
    }
    public void donus18(View v)
    {
        Intent intent=new Intent(mouse.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus19(View v)
    {
        Intent intent=new Intent(mouse.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus20(View v)
    {
        Intent intent=new Intent(mouse.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus21(View v)
    {
        Intent intent=new Intent(mouse.this, ekipman.class);
        startActivity(intent);
    }
}