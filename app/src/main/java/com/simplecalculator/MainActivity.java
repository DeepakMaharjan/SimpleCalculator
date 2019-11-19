package com.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etNumber;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear;
    Button btnAdd, btnSub, btnMul, btnDiv, btnEqual;

    Double firstNumber, secondNumber;
    String operator;
    Double result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNumber);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnClear = findViewById(R.id.btnClear);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEqual.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        String string = etNumber.getText().toString();

        switch (v.getId()){

            case R.id.btn0:
                etNumber.setText(string+btn0.getText());
                break;

            case R.id.btn1:
                etNumber.setText(string+btn1.getText());
                break;

            case R.id.btn2:
                etNumber.setText(string+btn2.getText());
                break;

            case R.id.btn3:
                etNumber.setText(string+btn3.getText());
                break;

            case R.id.btn4:
                etNumber.setText(string+btn4.getText());
                break;

            case R.id.btn5:
                etNumber.setText(string+btn5.getText());
                break;

            case R.id.btn6:
                etNumber.setText(string+btn6.getText());
                break;

            case R.id.btn7:
                etNumber.setText(string+btn7.getText());
                break;

            case R.id.btn8:
                etNumber.setText(string+btn8.getText());
                break;

            case R.id.btn9:
                etNumber.setText(string+btn9.getText());
                break;

            case R.id.btnClear:
                etNumber.setText("");
                break;


            case R.id.btnAdd:
                operator="+";
                firstNumber = Double.parseDouble(etNumber.getText().toString());
                etNumber.setText("");
                break;

            case R.id.btnSub:
                operator="-";
                firstNumber = Double.parseDouble(etNumber.getText().toString());
                etNumber.setText("");
                break;

            case R.id.btnMul:
                operator="*";
                firstNumber = Double.parseDouble(etNumber.getText().toString());
                etNumber.setText("");
                break;

            case R.id.btnDiv:
                operator="/";
                firstNumber = Double.parseDouble(etNumber.getText().toString());
                etNumber.setText("");
                break;

            case R.id.btnEqual:
                secondNumber = Double.parseDouble(etNumber.getText().toString());


                switch (operator){
                    case "+":
                        result = firstNumber + secondNumber;
                        break;

                    case "-":
                        result = firstNumber - secondNumber;
                        break;

                    case "*":
                        result = firstNumber * secondNumber;
                        break;

                    case "/":
                        result = firstNumber / secondNumber;
                        break;

                }
                etNumber.setText(result+"");
                break;

        }
    }
}
