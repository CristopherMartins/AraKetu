package com.c.cristopher.calculasalario;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Button btnCalcular;
    private EditText edsalario;
    private RadioGroup rdPorcentagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalcular = findViewById(R.id.btnCalcular);
        edsalario = findViewById(R.id.valorSalario);
        rdPorcentagem = findViewById(R.id.rdPorcentagem);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edsalario != null){
                    double salario = Double.parseDouble(edsalario.getText().toString());
                    double total = 0;
                    int op = rdPorcentagem.getCheckedRadioButtonId(); // pegar o id do radioButton
                    RadioButton rbmsg = findViewById(op); //pegar o radioButton selecionado
                    String msg = rbmsg.getText().toString();

                    if (op == R.id.rb40)
                        total = salario * 1.40;
                    else if (op == R.id.rb45)
                        total = salario * 1.45;
                    else
                        total = salario * 1.5;

                    AlertDialog.Builder alertaSalario = new AlertDialog.Builder(MainActivity.this);
                    alertaSalario.setTitle("Novo salário:");
                    alertaSalario.setMessage("Seu novo salário com acréscimo de "+ msg +" é: "+ total);
                    alertaSalario.setNeutralButton("OK",null);
                    alertaSalario.show();
                }
            }
        });
    }
}
