package com.example.alculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private int first, second;
    private String whichOperationToDo = "";
    private boolean isOperetionClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_0);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.bten_1:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperetionClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }

                break;
            case R.id.bten_2:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperetionClick) {
                    textView.setText("2");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.bten_3:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperetionClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.bten_4:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperetionClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.bten_5:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperetionClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.bten_6:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperetionClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.ten_7:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperetionClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.bten_8:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperetionClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.bten_9:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperetionClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.ten_0:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else if (isOperetionClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
            case R.id.bten_AC:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
        }
        isOperetionClick = false;
    }

    @SuppressLint("SetTextI18n")
    public void onOperetionClick(View view) {
        switch (view.getId()) {
            case R.id.bten_plus:
                first = Integer.parseInt(textView.getText().toString());
                whichOperationToDo = "sum";
                break;
            case R.id.bten_equally:
                switch (whichOperationToDo) {
                    case "sum": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first + second));
                        break;
                    }
                    case "subtract": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first - second));
                        break;
                    }
                    case "multiply":
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first * second));
                        break;
                    case "divide": {
                        second = Integer.parseInt(textView.getText().toString());
                        textView.setText(Integer.toString(first / second));
                        break;
                    }
                }
                break;
            case R.id.bten_minus:
                first = Integer.parseInt(textView.getText().toString());
                whichOperationToDo = "subtract";
                break;
            case R.id.bten_x:
                first = Integer.parseInt(textView.getText().toString());
                whichOperationToDo = "multiply";
                break;
            case R.id.btn_divide:
                first = Integer.parseInt(textView.getText().toString());
                whichOperationToDo = "divide";
            default:
        }
        isOperetionClick = true;
    }
}