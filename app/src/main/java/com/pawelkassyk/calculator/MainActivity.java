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
                String newValue = "7";
                if (!screen.getText().toString().equals("0")) {
                    newValue = screen.getText().toString() + "7";
                }

                screen.setText(newValue);
            }
        });
    }

    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
