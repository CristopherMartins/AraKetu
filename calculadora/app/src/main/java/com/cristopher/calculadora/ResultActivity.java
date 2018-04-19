package com.cristopher.calculadora;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Cristopher on 11/04/2018.
 */

public class ResultActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        //pega o resultado calculado na mainActivity
        Bundle args = getIntent().getExtras();
        Integer result = args.getInt("resultado");

        TextView text = findViewById(R.id.result);
        text.setText(String.valueOf(result));

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(onClickVoltar());

    }

    private View.OnClickListener onClickVoltar(){
        return new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Button op = findViewById(R.id.btnVoltar);

                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);

                //calcular(valor1, valor2, rdOperacao);
            }
        };
    }

    private Context getContext() {
        return this;
    }
}
