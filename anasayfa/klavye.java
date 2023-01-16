package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class klavye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klavye);
    }
    public void donus22(View v)
    {
        Intent intent=new Intent(klavye.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus23(View v)
    {
        Intent intent=new Intent(klavye.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus24(View v)
    {
        Intent intent=new Intent(klavye.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus25(View v)
    {
        Intent intent=new Intent(klavye.this, ekipman.class);
        startActivity(intent);
    }
}