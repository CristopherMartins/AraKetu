package br.com.alura.agenda;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.List;

import br.com.alura.agenda.DAO.AlunoDAO;
import br.com.alura.agenda.converter.AlunoConverter;
import br.com.alura.agenda.modelo.Aluno;

public class EnviaAlunosTask extends AsyncTask<Object, Object, String> {
    private Context context;
    private ProgressDialog progress;

    public EnviaAlunosTask(Context context) {
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        progress = ProgressDialog.show(context, "Aguarde", "Enviando alunos...", true, true);
    }

    @Override
    protected String doInBackground(Object... params) {
        AlunoDAO dao = new AlunoDAO(context);
        List<Aluno> alunos = dao.buscaAlunos();
        dao.close();

        AlunoConverter conversor = new AlunoConverter();
        String json = conversor.converterParaJSON(alunos);

        WebClient client = new WebClient();
        String resposta = client.post(json);
        return resposta;
    }

    @Override
    protected void onPostExecute(String resposta) {
        progress.dismiss();
        Toast.makeText(context, resposta, Toast.LENGTH_SHORT).show();
    }
}
