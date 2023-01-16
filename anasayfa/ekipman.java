package com.example.anasayfa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ekipman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ekipman);
    }

    public void donus7(View v)
    {
        Intent intent=new Intent(ekipman.this, MainActivity.class);
        startActivity(intent);
    }

    public void donus8(View v)
    {
        Intent intent=new Intent(ekipman.this, bilgisayar.class);
        startActivity(intent);
    }

    public void donus9(View v)
    {
        Intent intent=new Intent(ekipman.this, hakkimizda.class);
        startActivity(intent);
    }
    public void adresgecis9(View v)
    {
        Intent intent=new Intent(ekipman.this, monitor.class);
        startActivity(intent);

    }
    public void adresgecis10(View v)
    {
        Intent intent=new Intent(ekipman.this, kulaklik.class);
        startActivity(intent);

    }
    public void adresgecis11(View v)
    {
        Intent intent=new Intent(ekipman.this, mouse.class);
        startActivity(intent);

    }

    public void adresgecis12(View v)
    {
        Intent intent=new Intent(ekipman.this, klavye.class);
        startActivity(intent);

    }

}