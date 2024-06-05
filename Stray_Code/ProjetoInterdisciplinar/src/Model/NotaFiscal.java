
package Model;

import Model.TipoEmpresa;

public class NotaFiscal {
    private int idNotaFical;

   
    private String tiposNota;
    private String descricao;
    private TipoEmpresa tipoEmpresaModel;

    public NotaFiscal(int idNotaFical, String tiposNota, String descricao, TipoEmpresa tipoEmpresaModel) {
        this.idNotaFical = idNotaFical;
        this.tiposNota = tiposNota;
        this.descricao = descricao;
        this.tipoEmpresaModel = tipoEmpresaModel;
    }

    public void setIdNotaFical(int idNotaFical) {
        this.idNotaFical = idNotaFical;
    }
     
    public void setTiposNota(String tiposNota) {
        this.tiposNota = tiposNota;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipoEmpresaModel(TipoEmpresa tipoEmpresaModel) {
        this.tipoEmpresaModel = tipoEmpresaModel;
    }

    public int getIdNotaFical() {
        return idNotaFical;
    }

    public String getTiposNota() {
        return tiposNota;
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoEmpresa getTipoEmpresaModel() {
        return tipoEmpresaModel;
    }
    
}
