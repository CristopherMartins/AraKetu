package br.com.cristopher.araketu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class FormularioBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_bar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_formulario, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_save:
                Intent intent = new Intent(FormularioBarActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "OS DADOS FORAM SALVOS!!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_next:
                Intent vaiParaHome = new Intent(FormularioBarActivity.this, HomeActivity.class);
                startActivity(vaiParaHome);
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
