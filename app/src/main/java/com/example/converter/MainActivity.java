package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.text.Editable;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textview;
    private EditText editext;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.output);
        editext = findViewById(R.id.input);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
//
//
///       }
//
//        }
//
//    });
    }

    public void calculate(View view) {
        Toast.makeText(this, "Converted", Toast.LENGTH_SHORT).show();
        String s = editext.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        textview.setText("The value in pound is " + pound);
    }
}