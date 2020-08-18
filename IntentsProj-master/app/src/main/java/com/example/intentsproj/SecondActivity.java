package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String take1, take2, res;
    TextView tview1, tview2, tview3;
    Button btnad, btnsb, btnml, btndv;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tview1 = findViewById(R.id.view1);
        tview2 = findViewById(R.id.view2);
        tview3 = findViewById(R.id.result);
        btnad = findViewById(R.id.buttonadd);
        btnsb = findViewById(R.id.buttonsub);
        btnml = findViewById(R.id.buttonmul);
        btndv = findViewById(R.id.buttondiv);
        Intent myIntent = getIntent();
        take1 = myIntent.getStringExtra("Num1");
        take2 = myIntent.getStringExtra("Num2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        btnad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.valueOf(take1) + Integer.valueOf(take2);
                res = result.toString();
                tview3.setText(res);
            }
        });
        btnsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.valueOf(take1) - Integer.valueOf(take2);
                res = result.toString();
                tview3.setText(res);
            }
        });
        btnml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.valueOf(take1) * Integer.valueOf(take2);
                res = result.toString();
                tview3.setText(res);
            }
        });
        btndv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result = Integer.valueOf(take1) / Integer.valueOf(take2);
                res = result.toString();
                tview3.setText(res);
            }
        });
        tview1.setText(take1);
        tview2.setText(take2);
    }
}