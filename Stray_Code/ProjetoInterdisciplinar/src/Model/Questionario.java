
package Model;

import Model.Cnae;
import Model.RamoEmpresa;
import Model.TipoEmpresa;
import java.time.LocalDate;


public class Questionario {
    private int idQuestionario;
    private LocalDate dataQuestionario;
    private Cnae CnaeModel;
    private RamoEmpresa RamoEmpresaModel; 
    private TipoEmpresa TipoEmpresaModel; 

    public Questionario(int idQuestionario, LocalDate dataQuestionario, Cnae CnaeModel) {
        this.idQuestionario = idQuestionario;
        this.dataQuestionario = dataQuestionario;
        this.CnaeModel = CnaeModel;
    }

    public void setDataQuestionario(LocalDate dataQuestionario) {
        this.dataQuestionario = dataQuestionario;
    }

    public void setIdQuestionario(int idQuestionario) {
        this.idQuestionario = idQuestionario;
    }

    public void setCnaeModel(Cnae CnaeModel) {
        this.CnaeModel = CnaeModel;
    }

    public void setRamoEmpresaModel(RamoEmpresa RamoEmpresaModel) {
        this.RamoEmpresaModel = RamoEmpresaModel;
    }

    public void setTipoEmpresaModel(TipoEmpresa TipoEmpresaModel) {
        this.TipoEmpresaModel = TipoEmpresaModel;
    }

    public int getIdQuestionario() {
        return idQuestionario;
    }

    public LocalDate getDataQuestionario() {
        return dataQuestionario;
    }

    public Cnae getCnaeModel() {
        return CnaeModel;
    }

    public RamoEmpresa getRamoEmpresaModel() {
        return RamoEmpresaModel;
    }

    public TipoEmpresa getTipoEmpresaModel() {
        return TipoEmpresaModel;
    }
}
