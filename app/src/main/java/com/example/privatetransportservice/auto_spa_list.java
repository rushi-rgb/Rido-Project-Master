package com.example.privatetransportservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class auto_spa_list extends AppCompatActivity {


    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_spa_list);

        b1=findViewById(R.id.Btn_book);
        b2=findViewById(R.id.Btn_book1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(auto_spa_list.this, "Booked Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(auto_spa_list.this, "Booked Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}