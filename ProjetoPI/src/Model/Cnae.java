package Model;

public class Cnae {
    int id;
    int numeroCnae;
    String descricao;

    public Cnae(int id, int numeroCnae, String descricao) {
        this.id = id;
        this.numeroCnae = numeroCnae;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCnae() {
        return numeroCnae;
    }
    public void setNumeroCnae(int numeroCnae) {
        this.numeroCnae = numeroCnae;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
