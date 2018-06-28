package br.com.cristopher.araketu.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.cristopher.araketu.model.Musico;

public class DBHelper extends SQLiteOpenHelper {
    private static int VERSAO_BANCO = 1;

    public DBHelper(Context context) {
        super(context, "Cultura", null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS Musico(_id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT NOT NULL, telefone INTEGER, tipo TEXT, pagina TEXT, descricao TEXT);";
        db.execSQL(sql);
        String tb = "CREATE TABLE IF NOT EXISTS Bar(_id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT NOT NULL, endereco TEXT, tipo TEXT, descricao TEXT);";
        db.execSQL(tb);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    //     =============== MÉTODOS DA TABELA BAR ======================

    //     ============== MÉTODOS DA TABELA MÚSICO ===================

    public void salvaDadosMusico(Musico musico){
        SQLiteDatabase db = getWritableDatabase();

        ContentValues dados = new ContentValues();

        dados.put("nome", musico.getNome());
        dados.put("telefone", musico.getTelefone());
        dados.put("tipo", musico.getTipo());
        dados.put("pagina", musico.getPagina());
        dados.put("descricao", musico.getDescricao());

        db.insert("Musico",null,dados);
    }

    public Musico pegaMusicos(){
        SQLiteDatabase
    }
}
