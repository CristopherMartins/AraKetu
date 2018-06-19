package br.com.cristopher.araketu;

import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import br.com.cristopher.araketu.model.Musico;

public class FormularioMusicoHelper {
    private EditText campoNome;
    private EditText campoTelefone;
    private Spinner campoTipo;
    private EditText campoPagina;
    private EditText campoDescricao;

    private Musico musico;

    public FormularioMusicoHelper(FormularioMusicoActivity activity){
        campoNome = activity.findViewById(R.id.formulario_musico_nome);
        campoTelefone = activity.findViewById(R.id.formulario_musico_telefone);
        campoTipo = activity.findViewById(R.id.formulario_musico_spinner);
        campoPagina = activity.findViewById(R.id.formulario_musico_pagina);
        campoDescricao = activity.findViewById(R.id.formulario_musico_descricao);
        musico = new Musico();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(activity, R.layout.support_simple_spinner_dropdown_item, musico.getTipos());
        campoTipo.setAdapter(adapter);

    }

    public Musico pegaDadosDoFormularioMusico(){
        musico.setNome(campoNome.getText().toString());
        musico.setTelefone(campoTelefone.getText().toString());
        musico.setTipo(campoTipo.getSelectedItem().toString());
        musico.setPagina(campoPagina.getText().toString());
        musico.setDescricao(campoDescricao.getText().toString());
        return musico;
    }

    public void preencheFormularioMusico(Musico musico){
        campoNome.setText(musico.getNome());
        campoTelefone.setText(musico.getTelefone());
        campoTipo.setSelection(musico.selecionaTipoSpinner(musico.getTipo()));
        campoPagina.setText(musico.getPagina());
        campoDescricao.setText(musico.getDescricao());
        this.musico = musico;
    }

    @Override
    public String toString() {
        return musico.getNome();
    }
}
