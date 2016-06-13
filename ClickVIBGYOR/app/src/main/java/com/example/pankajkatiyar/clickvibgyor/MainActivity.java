package com.example.pankajkatiyar.clickvibgyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView violet = (TextView)findViewById(R.id.txtViolet);
        TextView indigo = (TextView)findViewById(R.id.txtIndigo);
        TextView blue = (TextView)findViewById(R.id.txtBlue);
        TextView green = (TextView)findViewById(R.id.txtgreen);
        TextView yellow = (TextView)findViewById(R.id.txtyellow);
        TextView orange = (TextView)findViewById(R.id.txtorange);
        TextView red = (TextView)findViewById(R.id.txtred);
        
        violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Violet", Toast.LENGTH_SHORT).show();
            }
        });
        
        indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Indigo", Toast.LENGTH_SHORT).show();
            }
        });
        
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Blue", Toast.LENGTH_SHORT).show();
            }
        });
        
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Green", Toast.LENGTH_SHORT).show();
            }
        });
        
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Yellow", Toast.LENGTH_SHORT).show();
            }
        });
        
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Orange", Toast.LENGTH_SHORT).show();
            }
        });
        
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Red", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
