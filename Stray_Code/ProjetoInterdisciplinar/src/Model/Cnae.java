
package Model;

import Model.RamoEmpresa;

public class Cnae {
    private int idCnae;
    private String NumeroCnae;
    private String descricao;
    private RamoEmpresa RamoEmpresaModel;

    public Cnae(int idCnae, String NumeroCnae, String descricao, RamoEmpresa RamoEmpresaModel) {
        this.idCnae = idCnae;
        this.NumeroCnae = NumeroCnae;
        this.descricao = descricao;
        this.RamoEmpresaModel = RamoEmpresaModel;
    }

    public void setNumeroCnae(String NumeroCnae) {
        this.NumeroCnae = NumeroCnae;
    }

    public void setIdCnae(int idCnae) {
        this.idCnae = idCnae;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setRamoEmpresaModel(RamoEmpresa RamoEmpresaModel) {
        this.RamoEmpresaModel = RamoEmpresaModel;
    }

    public int getIdCnae() {
        return idCnae;
    }

    public String getNumeroCnae() {
        return NumeroCnae;
    }

    public String getDescricao() {
        return descricao;
    }

    public RamoEmpresa getRamoEmpresaModel() {
        return RamoEmpresaModel;
    }
}
