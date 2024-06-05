package com.example.gridview_nizar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity {
    private CardView btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn1 = findViewById(R.id.btn1);
       btn2 = findViewById(R.id.btn2);
       btn3 = findViewById(R.id.btn3);
       btn4 = findViewById(R.id.btn4);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(getApplicationContext(), "HOLLA INI MENU A", Toast.LENGTH_SHORT).show();
           }
       });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HOLLA INI MENU B", Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HOLLA INI MENU C", Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HOLLA INI MENU D", Toast.LENGTH_SHORT).show();
            }
        });
    }
}