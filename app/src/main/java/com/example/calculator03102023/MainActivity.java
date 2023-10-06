package com.example.calculator03102023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    //1: khai báo các view sẽ tương tác
    TextInputEditText mTxtInputNumber1, mTxtInputNumber2;
    TextView mTxtResult;
    Button mBtnAdd, mBtnSub, mBtnMul, mBtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //2: ánh xạ
        mTxtInputNumber1 = findViewById(R.id.txtInputNumber1);
        mTxtInputNumber2 = findViewById(R.id.txtInputNumber2);

        mTxtResult = findViewById(R.id.txtResult);
        mBtnAdd = findViewById(R.id.btnAdd);
        mBtnSub = findViewById(R.id.btnSub);
        mBtnMul = findViewById(R.id.btnMul);
        mBtnDiv = findViewById(R.id.btnDiv);

        mBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNumber1 = mTxtInputNumber1.getText().toString();
                String txtNumber2 = mTxtInputNumber2.getText().toString();

                // kiêm tra giá trị
                if (txtNumber1.isEmpty() || txtNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                // có dữ liệu
                int number1 = Integer.parseInt(txtNumber1);
                int number2 = Integer.parseInt(txtNumber2);

                int result = number1 + number2;

                // setText để gán lại text
                mTxtResult.setText("Result: " + result);

            }
        });


        //viết phương thức phép trừ
        mBtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNumber1 = mTxtInputNumber1.getText().toString();
                String txtNumber2 = mTxtInputNumber2.getText().toString();

                if (txtNumber1.isEmpty() || txtNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(txtNumber1);
                int number2 = Integer.parseInt(txtNumber2);

                int result = number1 - number2;

                mTxtResult.setText("Result: "+ result);
            }
        });

        //viết phương thức cho phép nhân
        mBtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNumber1 = mTxtInputNumber1.getText().toString();
                String txtNumber2 = mTxtInputNumber2.getText().toString();

                if (txtNumber1.isEmpty() || txtNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(txtNumber1);
                int number2 = Integer.parseInt(txtNumber2);

                int result = number1 * number2;

                mTxtResult.setText("Result: "+result );

            }
        });

        // write method for Div
        mBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNumber1 = mTxtInputNumber1.getText().toString();
                String txtNumber2 = mTxtInputNumber2.getText().toString();

                if (txtNumber1.isEmpty() || txtNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                }

                int number1 = Integer.parseInt(txtNumber1);
                int number2 = Integer.parseInt(txtNumber2);

                if (number1 >= 0 && number2 > 0){
                    int result = number1 / number2;
                    mTxtResult.setText("Result: "+ result);
                    return;
                }else {
                    Toast.makeText(MainActivity.this, "Khong hop le", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}