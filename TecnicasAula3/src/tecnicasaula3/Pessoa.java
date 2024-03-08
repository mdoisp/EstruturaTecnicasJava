/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasaula3;

/**
 *
 * @author Alunos
 */
public class Pessoa {
    //Atributos da classe
    private String nome;
    private String CPF;
    private String genero;
    private String telefone;
    private Pessoa mae;
    private Pessoa pai;
    private Pessoa[] listaFilhos = new Pessoa [10];
    private int qtdFilhos = 0;
    private Pessoa[] listaIrmaos = new Pessoa [10];
    private int qtdIrmaos = 0;
    //******************//
    public Pessoa(String nome, String CPF, String genero, String telefone){
        this.nome = nome;
        this.CPF = CPF;
        this.genero = genero;
        this.telefone = telefone;
    }
    public Pessoa(String nome, String CPF, String genero, String telefone, Pessoa mae){
        //this.nome = nome;
        this(nome, CPF, genero, telefone);
        this.mae = mae;
    }
    public Pessoa(String nome, String CPF, String genero, String telefone, Pessoa mae, Pessoa pai){
        //this(nome);
        this(nome, CPF, genero, telefone, mae);
        this.pai = pai;
    }
    //Métodos de acesso aos atributos
    //Métodos Get
    public String getNome(){
        if (this.genero.equals("M")){
            return "Sr. " + this.nome;
        }else if(this.genero.equals("F")){
            return "Sra. " + this.nome;
        }else{
            return this.nome;
        }
    }
    public String getCPF(){
        return this.CPF;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public Pessoa getMae(){
        return this.mae;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    public Pessoa[] getListaFilhos(){
    return this.listaFilhos;
    }
    public Pessoa[] getListaIrmaos(){
        return this.listaIrmaos;
    }
    //Métodos Setter
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String cpf){
        this.CPF = cpf;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setMae(Pessoa mae){
        this.mae = mae;
    }
    public void setPai(Pessoa pai){
        this.pai = pai;
    }
    public void setFilhos(Pessoa[] filhos){
        this.listaFilhos = filhos;
    }
    public void addFilho(Pessoa filho){
        listaFilhos[qtdFilhos] = filho;
        qtdFilhos++;
    }
    public void setIrmaos(Pessoa[] irmaos){
        this.listaIrmaos = irmaos;
    }
    public void addIrmaos(Pessoa irmao){
        listaIrmaos[qtdIrmaos] = irmao;
        qtdIrmaos++;
    }
    public String retornaListaFilhos(Pessoa pais){
    String filhos = "";
        for (int i = 0; i < qtdFilhos; i++){
            if (i < qtdFilhos-1){
                filhos += pais.getListaFilhos()[i].getNome() + ", ";
            }
            else{
                filhos += pais.getListaFilhos()[i].getNome() + '.';
            }
        }
    return filhos;
    }
    public String retornaListaIrmaos(Pessoa irmaos){
    String irmao = "";
        for (int i = 0; i < qtdIrmaos; i++ ){
            if (i < qtdIrmaos-1){
                irmao += irmaos.getListaIrmaos()[i].getNome() + " ,";
            }
            else{
                irmao += irmaos.getListaIrmaos()[i].getNome() + ".";
            }
        }
    return irmao;
    }
}