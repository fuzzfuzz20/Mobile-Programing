package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {



    EditText a, b, c, d, e, f, g, h, i, j, k, l, m, n, o;
    Button BtnAdd;
    TextView TextResult;
    String num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    Double result1, result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        getSupportActionBar().setIcon(R.drawable.calculator2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        c = (EditText) findViewById(R.id.c);
        d = (EditText) findViewById(R.id.d);
        e = (EditText) findViewById(R.id.e);
        f = (EditText) findViewById(R.id.f);
        g = (EditText) findViewById(R.id.g);
        h = (EditText) findViewById(R.id.h);
        i = (EditText) findViewById(R.id.i);
        j = (EditText) findViewById(R.id.j);
        k = (EditText) findViewById(R.id.k);
        l = (EditText) findViewById(R.id.l);
        m = (EditText) findViewById(R.id.m);
        n = (EditText) findViewById(R.id.n);
        o = (EditText) findViewById(R.id.o);

        BtnAdd = (Button) findViewById(R.id.BtnAdd);

        TextResult = (TextView) findViewById(R.id.TextResult);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = b.getText().toString();
                num2 = e.getText().toString();
                num3 = h.getText().toString();
                num4 = k.getText().toString();
                num5 = n.getText().toString();

                num6 = c.getText().toString();
                num7 = f.getText().toString();
                num8 = i.getText().toString();
                num9 = l.getText().toString();
                num10 = o.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("") || num3.trim().equals("") || num4.trim().equals("") || num5.trim().equals("") || num6.trim().equals("") || num7.trim().equals("") || num8.trim().equals("") || num9.trim().equals("") || num10.trim().equals("")) {
                    Toast.makeText(getApplicationContext() , "숫자를 적어주세요.", 0)
                            .show();
                } else {
                    result1 = (Double.parseDouble(num1)
                            + Double.parseDouble(num2)
                            + Double.parseDouble(num3)
                            + Double.parseDouble(num4)
                            + Double.parseDouble(num5)) / 5;

                    result2 = (Double.parseDouble(num6)
                            + Double.parseDouble(num7)
                            + Double.parseDouble(num8)
                            + Double.parseDouble(num9)
                            + Double.parseDouble(num10));

                    TextResult.setText("총 학점 : " + result1.toString() + "       이수학점 : " + result2.toString());
                }
            }
        });
    }
}
