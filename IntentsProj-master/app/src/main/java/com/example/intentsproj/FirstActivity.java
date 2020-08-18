package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button btn;
    EditText num1, num2;
    String no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        btn = findViewById(R.id.buttonok);
    }

    @Override
    protected void onResume() {
        super.onResume();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = findViewById(R.id.no1);
                no1 = num1.getEditableText().toString();
                num2 = findViewById(R.id.no2);
                no2 = num2.getEditableText().toString();
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("Num1", no1);
                intent.putExtra("Num2", no2);
                startActivity(intent);
                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();
            }
        });
    }
}