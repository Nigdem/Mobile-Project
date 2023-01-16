package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kulaklik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kulaklik);
    }
    public void donus14(View v)
    {
        Intent intent=new Intent(kulaklik.this, MainActivity.class);
        startActivity(intent);
    }
    public void donus15(View v)
    {
        Intent intent=new Intent(kulaklik.this, hakkimizda.class);
        startActivity(intent);
    }
    public void donus16(View v)
    {
        Intent intent=new Intent(kulaklik.this, bilgisayar.class);
        startActivity(intent);
    }
    public void donus17(View v)
    {
        Intent intent=new Intent(kulaklik.this, ekipman.class);
        startActivity(intent);
    }
}