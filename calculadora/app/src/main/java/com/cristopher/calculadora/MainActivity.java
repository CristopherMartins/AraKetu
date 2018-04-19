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

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCalcular = findViewById(R.id.btnCalcular);

        btCalcular.setOnClickListener(onClickCalcular());
    }

    private View.OnClickListener onClickCalcular(){
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
    }

    private int calcular(int valor1, int valor2, String operacao){
        int result = 0;
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
