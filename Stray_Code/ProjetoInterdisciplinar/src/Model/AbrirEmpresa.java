
package Model;

import Model.Tributacao;

public class AbrirEmpresa {
    private int idAbrirEmpresa;
    private String formasAbrirEmpresa;
    private String descricao;
    private Tributacao TributacaoModel;

    public AbrirEmpresa(int idAbrirEmpresa, String formasAbrirEmpresa, String descricao, Tributacao TributacaoModel) {
        this.idAbrirEmpresa = idAbrirEmpresa;
        this.formasAbrirEmpresa = formasAbrirEmpresa;
        this.descricao = descricao;
        this.TributacaoModel = TributacaoModel;
    }

    public void setIdAbrirEmpresa(int idAbrirEmpresa) {
        this.idAbrirEmpresa = idAbrirEmpresa;
    }

    public void setFormasAbrirEmpresa(String formasAbrirEmpresa) {
        this.formasAbrirEmpresa = formasAbrirEmpresa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTributacaoModel(Tributacao TributacaoModel) {
        this.TributacaoModel = TributacaoModel;
    }

    public int getIdAbrirEmpresa() {
        return idAbrirEmpresa;
    }

    public String getFormasAbrirEmpresa() {
        return formasAbrirEmpresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Tributacao getTributacaoModel() {
        return TributacaoModel;
    }
}
