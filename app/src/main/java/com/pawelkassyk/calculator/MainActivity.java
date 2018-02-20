package com.pawelkassyk.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button7, button8, button9, buttonTimes, button4, button5, button6, buttonMinus,
            button1, button2, button3, buttonPlus, buttonC, button0, buttonDivide, buttonEquals;

    private TextView screen;

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter();

        screen = findViewById(R.id.screen);

        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonTimes = findViewById(R.id.buttonTimes);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        buttonMinus = findViewById(R.id.buttonMinus);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonC = findViewById(R.id.buttonC);
        button0 = findViewById(R.id.button0);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEquals = findViewById(R.id.buttonEquals);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("9");
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("*");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("6");
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("-");
            }
        });
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("3");
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("+");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("0");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("0");
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayViaPresenter("=");
            }
        });
    }

    private void displayViaPresenter(String string) {
        String toDisplay = presenter.getScreenToDisplay(string, screen.getText().toString());
        screen.setText(toDisplay);
    }
}
