package com.pawelkassyk.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button7, button8, button9, buttonTimes, button4, button5, button6, buttonMinus,
            button1, button2, button3, buttonPlus, buttonC, button0, buttonDivide, buttonEquals;

    private TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);


        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateScreenBy("7");
            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateScreenBy("8");
            }
        });
    }

    private void updateScreenBy(String clickedValue){
        String newValue = clickedValue;
        if (!screen.getText().toString().equals("0")) {
            newValue = screen.getText().toString() + clickedValue;
        }

        screen.setText(newValue);
    }
}
