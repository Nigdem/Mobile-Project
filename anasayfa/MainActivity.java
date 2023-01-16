package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adresgecis(View v)
    {
        Intent intent=new Intent(MainActivity.this, hakkimizda.class);
        startActivity(intent);

    }
    public void ekipman(View v)
    {
        Intent intent=new Intent(MainActivity.this, ekipman.class);
        startActivity(intent);
    }

    public void bilgisayar(View v)
    {
        Intent intent=new Intent(MainActivity.this, bilgisayar.class);
        startActivity(intent);

    }
}