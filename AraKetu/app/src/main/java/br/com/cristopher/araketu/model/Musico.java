package br.com.cristopher.araketu.model;

public class Musico {
    private long id;
    private String nome;
    private String telefone;
    private String tipo;
    private String pagina;
    private String[] tipos = {"Rock", "Pop"};
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String[] getTipos() {
        return tipos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int selecionaTipoSpinner(String tipo){
        int id=0, i;
        for(i = 0; i < tipos.length; i++){
            if (tipo.equals(tipos[i])){
                id = i;
            }
        }
        return id;
    }
}
