package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class hakkimizda extends AppCompatActivity {
    private ScrollView sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hakkimizda);
        init();
    }

    private void init ()
    {
        sc=new ScrollView(this);
    }
    public void donus(View v)
    {
        Intent intent=new Intent(hakkimizda.this, MainActivity.class);
        startActivity(intent);
    }
    public void adresgecis1(View v)
    {
        Intent intent=new Intent(hakkimizda.this, bilgisayar.class);
        startActivity(intent);

    }
    public void adresgecis2(View v)
    {
        Intent intent=new Intent(hakkimizda.this, ekipman.class);
        startActivity(intent);

    }
}