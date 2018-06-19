package br.com.cristopher.araketu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import br.com.cristopher.araketu.dao.DBHelper;
import br.com.cristopher.araketu.model.Musico;

public class FormularioMusicoActivity extends AppCompatActivity {
    private FormularioMusicoHelper helper;
    private Musico musico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_musico);

        helper = new FormularioMusicoHelper(FormularioMusicoActivity.this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_formulario, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_save:
                Musico musico = helper.pegaDadosDoFormularioMusico();

                DBHelper db = new DBHelper(FormularioMusicoActivity.this);

                db.salvaDadosMusico(musico);

                db.close();

                Toast.makeText(this, "O "+musico.getNome()+" foi salvo com sucesso!!!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(FormularioMusicoActivity.this, HomeActivity.class);
                startActivity(intent);

                finish();
                break;
            case R.id.menu_next:
                Intent vaiParaHome = new Intent(FormularioMusicoActivity.this, HomeActivity.class);
                startActivity(vaiParaHome);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
