/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2vetoresmatriz;

/**
 *
 * @author Alunos
 */
public class VetoresMatrizes {
    public static void main(String[] args) {
        VetoresMatrizes vM1 = new VetoresMatrizes();
        //Exercício 1 //////////////////////////////////////////////////////////
        int[] entrada = new int[] {0,1,2,3,4,5,6,7};
        int[] saida;
        saida = vM1.inverterVetor(entrada);
        String entradaConcatenado = "";
        String retorno = "";
        for (int i=0; i<8; i++){
            entradaConcatenado += entrada[i];
            retorno += saida[i];
        }
        System.out.println("Vetor entrada: " + entradaConcatenado);
        System.out.println("Vetor invertido: " + retorno);
        
        int matrizRetorno[][] = vM1.concatenaVetorEmMatriz(new int[] {0,1,2,3,4,5,6,7},
            new int[] {0,1,2,3,4,5,6,7}, new int[] {0,1,2,3,4,5,6,7});
        System.out.println("FIM");
    }
    public int[] inverterVetor(int[] vetorEntrada){
        /*Crie um método que inverta o vetor de entrada
        e retorne o vetor invertido.
        */
        int[] vetorSaida = new int[8];
        for(int i=0; i<8; i++){
            vetorSaida[7-i] = vetorEntrada[i];
        }
        return vetorSaida;
    }
    //Exercício 2 //////////////////////////////////////////////////////////////
    public int[][] concatenaVetorEmMatriz(int[] vetor1, int[] vetor2, int[] vetor3){
    /*Recebe 3 vetores de 8 posições e retorna uma matriz de 8x3 posições
    com os vetores concatenados
    */
    int[][] matrizSaida = new int[8][3];

    for(int i=0; i<8; i++){
        matrizSaida[i][0] = vetor1 [i];
        matrizSaida[i][1] = vetor2 [i];
        matrizSaida[i][2] = vetor3 [i];
    }
    return matrizSaida;
    }
}