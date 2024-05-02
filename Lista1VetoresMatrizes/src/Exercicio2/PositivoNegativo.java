package Exercicio2;

public class PositivoNegativo {
    
    public PositivoNegativo(){ 
    }
    
    public void verificaNumero(double[] vetor){
    int i;
        for(i=0; i<vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println('N');
            }
            else{
                System.out.println('P');
            }
        }
    }
}
