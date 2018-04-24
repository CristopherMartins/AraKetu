package com.cristopher.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot;
    private Button btnSomar, btnSubtrair, btnMultiplicar, btnDividir, btnIgual, btnLimpar, btnBackSpace;
    private TextView valor1, valor2;
    private TextView operacao, resultado;
    private String result; //String para mostrar o resultado na TextView
    private Boolean validador = true; // validador para evitar que entrem novos parametros no campo valor2 após o cálculo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //botoes de numeros da calculadora
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);

        //botoes de operacoes
        btnSomar = findViewById(R.id.btnSoma);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnDot = findViewById(R.id.btnDot);
        btnIgual = findViewById(R.id.btnIgual);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnBackSpace = findViewById(R.id.btnBackSpace);

        //campos com os valores
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        operacao = findViewById(R.id.operacao);
        resultado = findViewById(R.id.resultado);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                     String v1 = valor1.getText().toString();
                     valor1.setText(v1 + "1");
                }else{
                     if(validador){
                         String v2 = valor2.getText().toString();
                         valor2.setText(v2 + "1");
                     }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "2");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "2");
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "3");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "3");
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "4");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "4");
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "5");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "5");
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "6");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "6");
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "7");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "7");
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "8");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "8");
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "9");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "9");
                    }
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    valor1.setText(v1 + "0");
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        valor2.setText(v2 + "0");
                    }
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    if (!v1.contains(".")){
                        valor1.setText(v1 + ".");
                    }
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        if (!v2.contains(".")){
                            valor2.setText(v2 + ".");
                        }
                    }
                }
            }
        });

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao.setText("+");
            }
        });

        btnSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao.setText("-");
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao.setText("x");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao.setText("/");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double val1, val2, resultOp;
                val1 = Double.valueOf(valor1.getText().toString());
                val2 = Double.valueOf(valor2.getText().toString());
                resultOp = calcular(val1, val2, operacao.getText().toString());
                result = String.valueOf(resultOp);
                resultado.setText(result);
                Toast.makeText(MainActivity.this, "O resultado da operação é: " + resultOp, Toast.LENGTH_SHORT).show();
                validador = false;
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacao.setText("?");
                valor1.setText(null);
                valor2.setText(null);
                resultado.setText(null);
                validador = true;
            }
        });

        btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operacao.getText().toString().equals("?")){
                    String v1 = valor1.getText().toString();
                    int input = v1.length();
                    if (input > 0){
                        valor1.setText(v1.substring(0, input -1));
                    }
                }else{
                    if(validador){
                        String v2 = valor2.getText().toString();
                        int input = v2.length();
                        if (input > 0){
                            valor2.setText(v2.substring(0, input -1));
                        }
                    }
                }
            }
        });
    }

    /*private View.OnClickListener onClickCalcular(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText v1 = findViewById(R.id.valor1);
                Integer valor1;
                valor1 = Integer.valueOf(v1.getText().toString());

                EditText v2 = findViewById(R.id.valor2);
                Integer valor2;
                valor2 = Integer.valueOf(v2.getText().toString());

                RadioGroup op = findViewById(R.id.rdOperacao);
                String rdOperacao =((RadioButton)findViewById(op.getCheckedRadioButtonId())).getText().toString();

                Intent intent = new Intent(getContext(), ResultActivity.class);
                int resultado = calcular(valor1, valor2, rdOperacao);
                Bundle params = new Bundle();
                params.putInt("resultado", resultado);
                intent.putExtras(params);
                startActivity(intent);

            }
        };
    }*/

    private double calcular(double valor1, double valor2, String operacao){
        double result = 0;
        switch (operacao){
            case "+":
                result = valor1 + valor2;
                break;
            case "-":
                result = valor1 - valor2;
                break;
            case "x":
                result = valor1 * valor2;
                break;
            case "/":
                result = valor1 / valor2;
                break;
        }
        return result;
    }

    private Context getContext() {
        return this;
    }
}
