package br.com.cristopher.araketu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_bar = findViewById(R.id.btn_bar);
        Button btn_musico = findViewById(R.id.btn_musico);

    }

    public void  vaiParaFormularioBar(View view){
        Intent intent = new Intent(MainActivity.this, FormularioBarActivity.class);
        startActivity(intent);
        //finish();
    }

    public void vaiParaFormularioMusico(View view){
        Intent intent = new Intent(MainActivity.this, FormularioMusicoActivity.class);
        startActivity(intent);
        //finish();
    }
}
