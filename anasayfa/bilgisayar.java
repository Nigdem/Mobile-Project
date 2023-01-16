package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bilgisayar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bilgisayar);
    }
    public void donus2(View v)
    {
        Intent intent=new Intent(bilgisayar.this, MainActivity.class);
        startActivity(intent);
    }

    public void donus3(View v)
    {
        Intent intent=new Intent(bilgisayar.this, hakkimizda.class);
        startActivity(intent);
    }

    public void donus4(View v)
    {
        Intent intent=new Intent(bilgisayar.this, ekipman.class);
        startActivity(intent);
    }

    public void donus5(View v)
    {
        Intent intent=new Intent(bilgisayar.this, small.class);
        startActivity(intent);
    }
    public void donus6(View v)
    {
        Intent intent=new Intent(bilgisayar.this, medium.class);
        startActivity(intent);
    }
    public void donus40(View v)
    {
        Intent intent=new Intent(bilgisayar.this, large.class);
        startActivity(intent);
    }
}