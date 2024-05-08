package Exercicio4;

public class MediaModaDesvio {
    
    public MediaModaDesvio(){
    }
    
    public float[][] calculaMMD(float[][] matriz){
        for(int c=1; c<matriz[c].length; c++){
            float somador = 0;
            if (c!=2){ 
                for(int l=0; l<matriz.length; l++){
                    somador += matriz[l][c];
                }
            } 
            if(c==1){
                //media
            } else if(c==2){
                //moda
            }else{
                //desvio
            }
        }
        return matriz;
    }
}

