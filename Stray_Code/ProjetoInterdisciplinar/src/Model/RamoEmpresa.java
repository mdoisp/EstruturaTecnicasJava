
package Model;

import Model.TipoEmpresa;

public class RamoEmpresa {
    private int idRamoEmpresa;
    private String Secao;
    private String NomeRamoEmpresa;
    private TipoEmpresa TipoEmpresaModel;

    public RamoEmpresa(int idRamoEmpresa, String Secao, String NomeRamoEmpresa, TipoEmpresa TipoEmpresaModel) {
        this.idRamoEmpresa = idRamoEmpresa;
        this.Secao = Secao;
        this.NomeRamoEmpresa = NomeRamoEmpresa;
        this.TipoEmpresaModel = TipoEmpresaModel;
    }

    public void setIdRamoEmpresa(int idRamoEmpresa) {
        this.idRamoEmpresa = idRamoEmpresa;
    }

    public void setSecao(String Secao) {
        this.Secao = Secao;
    }

    public void setNomeRamoEmpresa(String NomeRamoEmpresa) {
        this.NomeRamoEmpresa = NomeRamoEmpresa;
    }

    public void setTipoEmpresaModel(TipoEmpresa TipoEmpresaModel) {
        this.TipoEmpresaModel = TipoEmpresaModel;
    }

    public int getIdRamoEmpresa() {
        return idRamoEmpresa;
    }

    public String getSecao() {
        return Secao;
    }

    public String getNomeRamoEmpresa() {
        return NomeRamoEmpresa;
    }

    public TipoEmpresa getTipoEmpresaModel() {
        return TipoEmpresaModel;
    }
}
