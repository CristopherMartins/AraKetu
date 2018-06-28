package br.com.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import br.com.alura.agenda.modelo.Prova;

public class DetalhesProvaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_prova);

        Intent intent = getIntent();
        Prova prova = (Prova) intent.getSerializableExtra("prova");

        TextView campoMateria = findViewById(R.id.detalhes_prova_materia);
        campoMateria.setText(prova.getMateria());

        TextView campoData = findViewById(R.id.detalhes_prova_data);
        campoData.setText(prova.getData());

        ListView campoTopico = findViewById(R.id.detalhes_prova_topicos);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, prova.getTopicos());

        campoTopico.setAdapter(adapter);
    }
}
