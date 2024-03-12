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
        Pessoa maeDoJoao = new Pessoa("Maria", "CPF", 'F', "telefone");
        Pessoa paiDoJoao = new Pessoa("José", "CPF", 'M', "telefone");
        Pessoa Joao = new Pessoa("João", "CPF", 'M', "telefone", maeDoJoao, paiDoJoao);
        Pessoa irmaoJoao = new Pessoa("Jorel", "CPF", 'M', "telefone", maeDoJoao, paiDoJoao);
        System.out.println("João Dos Santos");
        System.out.println("Nome: "+ Joao.getNome());
        System.out.println("Mãe: "+ Joao.getMae().getNome());
        System.out.println("Pai: "+ Joao.getPai().getNome());
        System.out.println("CPF do josé: "+ Joao.getPai().getCPF());
        //maeDoJoao.addFilho(Joao);
        //maeDoJoao.addFilho(irmaoJoao);
        Joao.addIrmaos(irmaoJoao);
        irmaoJoao.addIrmaos(Joao);
        System.out.println("Irmão do João: "+ Joao.getMae().getListaFilhos()[1].getNome());
        System.out.println("Os filhos de Maria são: "+ maeDoJoao.retornaListaFilhos(maeDoJoao));
        System.out.println("Os irmãos de João são: "+ Joao.retornaListaIrmaos(Joao));
    }
    
}
