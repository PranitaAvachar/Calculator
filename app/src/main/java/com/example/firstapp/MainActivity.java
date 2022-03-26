package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private TextView textView1;

    private Button btn9, btn8, btn7, btndiv;
    private Button btn6, btn5, btn4, btnmulti;
    private Button btn3, btn2, btn1, btnsub;
    private Button btnclear, btn0, btnequal, btnplus;
    Float sum, num1, num2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearLayout);
        linearLayout1 = findViewById(R.id.linearlayout1);
        linearLayout2 = findViewById(R.id.linearlayout2);
        linearLayout3 = findViewById(R.id.linearlayout3);
        linearLayout4 = findViewById(R.id.linearlayout4);

        textView1 = findViewById(R.id.textView1);


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

        btnclear = findViewById(R.id.btnclear);
        btnplus = findViewById(R.id.btnplus);
        btnsub = findViewById(R.id.btnsub);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);
        btnequal=findViewById(R.id.btnequal);

        btnclear.setOnClickListener(new btnclear());
        btnplus.setOnClickListener(new btnplus());
        btnsub.setOnClickListener(new btnsub());
        btnmulti.setOnClickListener(new btnmulti());
        btndiv.setOnClickListener(new btndiv());
        btnequal.setOnClickListener(new btnequal());
        btn1.setOnClickListener(new btn1());
        btn2.setOnClickListener(new btn2());
        btn3.setOnClickListener(new btn3());
        btn4.setOnClickListener(new btn4());
        btn5.setOnClickListener(new btn5());
        btn6.setOnClickListener(new btn6());
        btn7.setOnClickListener(new btn7());
        btn8.setOnClickListener(new btn8());
        btn9.setOnClickListener(new btn9());
        btn0.setOnClickListener(new btn0());

    }

    private class btnclear implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            textView1.setText("");
        }
    }

    private class btn1 implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Button btn1 = new Button(MainActivity.this);
            btn1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("1");


        }
    }

    private class btn2 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn2 = new Button(MainActivity.this);
            btn2.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("2");

        }
    }

    private class btn3 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn3 = new Button(MainActivity.this);
            btn3.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("3");

        }
    }

    private class btn4 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn4 = new Button(MainActivity.this);
            btn4.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

            textView1.setText("4");
        }

    }

    private class btn5 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn5 = new Button(MainActivity.this);
            btn5.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("5");
        }
    }

    private class btn6 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn6 = new Button(MainActivity.this);
            btn6.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("6");
        }
    }

    private class btn7 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn7 = new Button(MainActivity.this);
            btn7.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("7");
        }
    }

    private class btn8 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn8 = new Button(MainActivity.this);
            btn8.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("8");
        }
    }

    private class btn9 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn9 = new Button(MainActivity.this);
            btn9.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("9");

        }
    }

    private class btn0 implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            Button btn0 = new Button(MainActivity.this);
            btn0.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            textView1.setText("0");
        }
    }

    private class btnplus implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            num1 = Float.parseFloat(textView1.getText() + "");
            textView1.setText("");
            add = true;


        }
    }

    private class btnsub implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            num1 = Float.parseFloat(textView1.getText() + "");
            textView1.setText("");
            sub = true;
        }
    }

    private class btnmulti implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            num1 = Float.parseFloat(textView1.getText() + "");
            textView1.setText("");
            mul = true;
        }
    }

    private class btndiv implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            num1 = Float.parseFloat(textView1.getText() + "");
            textView1.setText("");
            div = true;
        }
    }

    private class btnequal implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (add == true) {
                num2 = Float.parseFloat(textView1.getText() + "");
                sum = num1 + num2;
                textView1.setText(sum + "");
                add = false;
            }
            if (sub == true) {
                num2 = Float.parseFloat(textView1.getText() + "");
                sum = num1 - num2;
                textView1.setText(sum + "");
                sub = false;
            }
            if (mul == true) {
                num2 = Float.parseFloat(textView1.getText() + "");
                sum = num1 * num2;
                textView1.setText(sum + "");
                mul = false;
            }
            if (add == true) {
                num2 = Float.parseFloat(textView1.getText() + "");
                sum = num1 / num2;
                textView1.setText(sum + "");
                div = false;
            }

        }
    }
}
