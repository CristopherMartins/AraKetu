package com.c.cristopher.sistemacompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox ckAndroidAcao, ckGoogleAndroid, ckUseCabeca, ckDesenvolvimento, ckDesignPatterns;
    Button btnComprar, btnLimpar;
    TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckAndroidAcao = findViewById(R.id.ckAndroidAcao);
        ckGoogleAndroid = findViewById(R.id.ckGoogleAndroid);
        ckUseCabeca = findViewById(R.id.ckUseCabeca);
        ckDesenvolvimento = findViewById(R.id.ckDesenvolvimento);
        ckDesignPatterns = findViewById(R.id.ckDesignPatterns);

        btnComprar = findViewById(R.id.btnComprar);
        btnLimpar = findViewById(R.id.btnLimpar);

        tvTotal = findViewById(R.id.tvTotalCompra);

        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double valor = 0;
                if (ckAndroidAcao.isChecked()){
                    valor += 70.69;
                }if (ckGoogleAndroid.isChecked()){
                    valor += 180;
                }if (ckUseCabeca.isChecked()){
                    valor += 100;
                }if (ckDesenvolvimento.isChecked()){
                    valor += 80.30;
                }if (ckDesignPatterns.isChecked()){
                    valor += 66;
                }
                tvTotal.setText(String.valueOf(valor));
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvTotal.setText(null);
                ckAndroidAcao.setChecked(false);
                ckGoogleAndroid.setChecked(false);
                ckUseCabeca.setChecked(false);
                ckDesenvolvimento.setChecked(false);
                ckDesignPatterns.setChecked(false);
            }
        });

    }
}
