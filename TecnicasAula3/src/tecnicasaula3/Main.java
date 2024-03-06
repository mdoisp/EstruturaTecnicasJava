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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa maeDoJoao = new Pessoa("Maria", "CPF", "genero", "telefone");
        Pessoa paiDoJoao = new Pessoa("José", "11111111111", "genero", "telefone", maeDoJoao);
        Pessoa Joao = new Pessoa("João", "CPF", "genero", "telefone", maeDoJoao, paiDoJoao);
        Pessoa irmaoJoao = new Pessoa("Jorel", "cpf", "genero", "telefone", maeDoJoao, paiDoJoao);
        System.out.println("João Dos Santos");
        System.out.println("Nome: "+ Joao.getNome());
        System.out.println("Mãe: "+ Joao.getMae());
        System.out.println("Pai: "+ Joao.getPai());
        System.out.println("CPF do josé: "+ Joao.getPai().getCPF());
        maeDoJoao.addFilho(Joao);
        maeDoJoao.addFilho(irmaoJoao);
        System.out.println("Mãe do João: "+ Joao.getMae().getNome());
        System.out.println("Irmão do João: "+ Joao.getMae().getListaFilhos()[1].getNome());
    }
    
}
