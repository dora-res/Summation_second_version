package com.example.xml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText augentText, addedText;
    Button sumButton;
    TextView resText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        augentText = findViewById(R.id.augent);
        addedText = findViewById(R.id.added);
        sumButton = findViewById(R.id.sun);
        resText = findViewById(R.id.res);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String augStr = augentText.getText().toString();
                double augent = Double.parseDouble(augStr);
                double added = Double.parseDouble(addedText.getText().toString());
                double res = added+augent;
                resText.setText(Double.valueOf(res).toString());
            }
        });
    }
}