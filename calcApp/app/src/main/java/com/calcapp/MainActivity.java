package com.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnC, btnSigno, btnCheck, btnDiv, btn7,
            btn8, btn9, btnMult, btn4, btn5, btn6, btnMenos,
            btn1, btn2, btn3, btnSum, btn0, btnPunto, btnIgual;
    private TextView tvDisplay;
    private String textDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
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
        btnPunto = findViewById(R.id.btnPunto);
        btnSum = findViewById(R.id.btnSum);
        btnMenos = findViewById(R.id.btnMenos);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnSigno = findViewById(R.id.btnSigno);
        btnCheck = findViewById(R.id.btnCheck);
        btnC = findViewById(R.id.btnC);
        btnIgual = findViewById(R.id.btnIgual);
        tvDisplay = findViewById(R.id.tvDisplay);

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
        btnPunto.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnMenos.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSigno.setOnClickListener(this);
        btnCheck.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnIgual.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn0: setTextDisplay("0");
                break;
            case R.id.btn1: setTextDisplay("1");
                break;
            case R.id.btn2: setTextDisplay("2");
                break;
            case R.id.btn3: setTextDisplay("3");
                break;
            case R.id.btn4: setTextDisplay("4");
                break;
            case R.id.btn5: setTextDisplay("5");
                break;
            case R.id.btn6: setTextDisplay("6");
                break;
            case R.id.btn7: setTextDisplay("7");
                break;
            case R.id.btn8: setTextDisplay("8");
                break;
            case R.id.btn9: setTextDisplay("9");
                break;
            case R.id.btnPunto: setTextDisplay(".");
                break;
            case R.id.btnSum: setTextDisplay("+");
                break;
            case R.id.btnMenos: setTextDisplay("-");
                break;
            case R.id.btnMult: setTextDisplay("*");
                break;
            case R.id.btnDiv: setTextDisplay("/");
                break;
            case R.id.btnSigno: setTextDisplay("^");
                break;
            case R.id.btnCheck: setTextDisplay("✓");
                break;
            case R.id.btnC: setTextDisplay("C");
                break;
            case R.id.btnIgual: setTextDisplay("=");
                break;
        }
    }

    private void setTextDisplay(String dato) {
        if (!dato.equalsIgnoreCase("C")){
            textDisplay = tvDisplay.getText().toString();
            Log.e("TAG", textDisplay);
            tvDisplay.setText(textDisplay.concat(dato));
        }else {
            textDisplay = "";
            tvDisplay.setText("");
        }
    }
}
