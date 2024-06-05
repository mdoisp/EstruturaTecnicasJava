
package Model;

import Model.Cnae;

public class Tributacao {
    private int idTributacao;
    private String tiposNota;
    private String descricao;
    private Cnae CnaeModel;

    public Tributacao(int idTributacao, String tiposNota, String descricao, Cnae CnaeModel) {
        this.idTributacao = idTributacao;
        this.tiposNota = tiposNota;
        this.descricao = descricao;
        this.CnaeModel = CnaeModel;
    }

    
    public void setIdTributacao(int idTributacao) {
        this.idTributacao = idTributacao;
    }

    public void setTiposNota(String tiposNota) {
        this.tiposNota = tiposNota;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCnaeModel(Cnae CnaeModel) {
        this.CnaeModel = CnaeModel;
    }
    
    public int getIdTributacao() {
        return idTributacao;
    }

    public String getTiposNota() {
        return tiposNota;
    }

    public String getDescricao() {
        return descricao;
    }

    public Cnae getCnaeModel() {
        return CnaeModel;
    }
}
