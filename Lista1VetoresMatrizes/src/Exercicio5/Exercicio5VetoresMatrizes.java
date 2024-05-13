package Exercicio5;

public class Exercicio5VetoresMatrizes {
    public static void main(String[] args) {
        float[][] matriz = new float[][]{
            {1, 8, 5, 7, 6.66f},
            {2, 3, 7, 5, 5},
            {3, 7, 4, 8, 6},
            {4, 0, 8, 7, 5},
            {5, 7, 4, 5, 5.33f}
        };
        float[][] resultados = new float[4][3];

        for (int col = 1; col < matriz[0].length; col++) {
            float soma = 0;
            int count = 0;
            float moda = 0;
            int freq = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += matriz[linha][col];
            }
            for (int linha = 0; linha < matriz.length; linha++) {
                freq = 0;
                for (int i = 0; i < matriz.length; i++) {
                    if (matriz[linha][col] == matriz[i][col]) {
                        freq++;
                    }
                }
                if (freq > count) {
                    count = freq;
                    moda = matriz[linha][col];
                }
            }
            float media = soma / matriz.length;
            resultados[col-1][0] = media;
            resultados[col-1][1] = moda;
            for (int row = 0; row < matriz.length; row++) {
                soma += (matriz[row][col] - media) * (matriz[row][col] - media);
            }
            float variancia = soma / matriz.length; // variancia
            resultados[col-1][2] = (float) Math.sqrt(variancia); // desvio padrao
        }
        for (int c=1; c < resultados[0].length; c++){
            
        }
        
        for (int i = 0; i < resultados.length; i++) {
            if(i<3){
                System.out.printf("P%d     | Media: ", i+1);
            }else{
                System.out.printf("PMedia%d| Media: ", i+1);
            }
            for (int j = 0; j < resultados[i].length; j++) {
                if (j > 0) {
                    System.out.printf(" | ");
                }
                if (j == 1) {
                    System.out.printf("Moda: ");
                } else if (j == 2) {
                    System.out.printf("Desvio Padrao: ");
                }
                System.out.printf("%.2f", resultados[i][j]);
            }
            System.out.println();
        }
    }
}
