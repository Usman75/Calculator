package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean isOpPressed = false;
    private double fNum = 0;
    private double secNum = 0;
    private int secNumIndex = 0;
    private char currentOp;
    private String screenContent = "";
    private double result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        // Select all elements
        final TextView calculaterScreen = findViewById(R.id.calculaterScreen);
        final Button n0  = findViewById(R.id.n0);
        final Button n1  = findViewById(R.id.n1);
        final Button n2  = findViewById(R.id.n2);
        final Button n3  = findViewById(R.id.n3);
        final Button n4  = findViewById(R.id.n4);
        final Button n5  = findViewById(R.id.n5);
        final Button n6  = findViewById(R.id.n6);
        final Button n7  = findViewById(R.id.n7);
        final Button n8  = findViewById(R.id.n8);
        final Button n9  = findViewById(R.id.n9);
        final Button point  = findViewById(R.id.point);
        final Button equals  = findViewById(R.id.equal);
        final Button addition  = findViewById(R.id.add);
        final Button subtraction = findViewById(R.id.subtract);
        final Button multiplication  = findViewById(R.id.multiply);
        final Button division  = findViewById(R.id.division);
        final Button delete = findViewById(R.id.delete);
        final Button clear  = findViewById(R.id.clear);

        //Add onCLickListener
        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.n0:
                        calculaterScreen.append("0");
                        break;
                    case R.id.n1:
                        calculaterScreen.append("1");
                        break;
                    case R.id.n2:
                        calculaterScreen.append("2");
                        break;
                    case R.id.n3:
                        calculaterScreen.append("3");
                        break;
                    case R.id.n4:
                        calculaterScreen.append("4");
                        break;
                    case R.id.n5:
                        calculaterScreen.append("5");
                        break;
                    case R.id.n6:
                        calculaterScreen.append("6");
                        break;
                    case R.id.n7:
                        calculaterScreen.append("7");
                        break;
                    case R.id.n8:
                        calculaterScreen.append("8");
                        break;
                    case R.id.n9:
                        calculaterScreen.append("9");
                        break;
                    case R.id.point:
                        calculaterScreen.append(".");
                        break;
                        //Equal Operations
                    case R.id.equal:

                        if(isOpPressed){
                            switch (currentOp){
                                case '+':
                                    screenContent = calculaterScreen.getText().toString();
                                    String secString = screenContent.
                                            substring(secNumIndex,screenContent.length());
                                    secNum  = Double.parseDouble(secString);
                                     result = fNum + secNum;
                                    calculaterScreen.setText(String.valueOf(result));
                                    break;
                                case '-':
                                    screenContent = calculaterScreen.getText().toString();
                                    String secString2 = screenContent.
                                            substring(secNumIndex,screenContent.length());
                                    secNum  = Double.parseDouble(secString2);
                                     result = fNum - secNum;
                                    calculaterScreen.setText(String.valueOf(result));
                                    break;
                            }
                            // Addition Operation
//                            if(currentOp == '+'){
//                                screenContent = calculaterScreen.getText().toString();
//                                 secNum  = Double.parseDouble(screenContent.
//                                        substring(secNumIndex,screenContent.length()));
//                                secNum += fNum;
//                                calculaterScreen.setText(String.valueOf(secNum));
//                            }
//                            // Subtrction Operator
//                            if(currentOp == '-'){
//                                screenContent = calculaterScreen.getText().toString();
//                                 secNum  = Double.parseDouble(screenContent.
//                                        substring(secNumIndex,screenContent.length()));
//                                 double result = fNum - secNum;
//                                calculaterScreen.setText(String.valueOf(result));
//                            }

                        }
                        break;
                    case R.id.division:

                        break;
                    case R.id.multiply:

                        break;
                    case R.id.add:
                        screenContent = calculaterScreen.getText().toString();
                        secNumIndex = screenContent.length();
                        fNum = Double.parseDouble(screenContent);
                        calculaterScreen.append("+");
                        isOpPressed = true;
                        currentOp = '+';
                        break;
                    case R.id.subtract:
                        screenContent = calculaterScreen.getText().toString();
                        secNumIndex = screenContent.length();
                        fNum = Double.parseDouble(screenContent);
                        calculaterScreen.append("-");
                        isOpPressed = true;
                        currentOp = '-';
                        break;

                    case R.id.delete:
                        String dispElements = calculaterScreen.getText().toString();
                        int len = dispElements.length();
                        if(len >0 ){
                            dispElements = dispElements.substring(0,len-1);
                            calculaterScreen.setText(dispElements);
                        }
                        break;
                    case R.id.clear:
                            calculaterScreen.setText("");
                        break;



                }
            }
        };
        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        point.setOnClickListener(calculatorListener);
        equals.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        clear.setOnClickListener(calculatorListener);
        delete.setOnClickListener(calculatorListener);

    }
}