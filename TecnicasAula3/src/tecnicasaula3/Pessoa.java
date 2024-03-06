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
        return "Sr." + this.nome;
    }
    public Pessoa[] getListaFilhos(){
        return listaFilhos;
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
    public Pessoa[] GetFilhos(){
        return this.listaFilhos;
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
    //Método para add um filho(a) a lista
    public void addFilho(Pessoa filho){
        listaFilhos[qtdFilhos] = filho;
        qtdFilhos++;
    }
    public String retornaListaFilhos(){
    /*Este método deve retornar uma string com todos os filhos concatenados e
      separados por vírgula e espaço*/
    String filhos = "";
    for (int i = 0; i < qtdFilhos; i++){
        
    }
    return "";
}
}
