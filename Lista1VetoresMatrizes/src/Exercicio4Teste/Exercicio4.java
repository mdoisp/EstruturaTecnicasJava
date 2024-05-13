package Exercicio4Teste;

public class Exercicio4 {
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
            for (int linha = 0; linha < matriz.length; linha++) {
                soma += (matriz[linha][col] - media) * (matriz[linha][col] - media);
            }
            float variancia = soma / matriz.length-1; // variancia
            resultados[col-1][2] = (float) Math.sqrt(variancia); // desvio padrao
        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.printf("Prova %d: Media = %.2f, Moda = %.2f, Desvio Padrao = %.2f%n", i+1, resultados[i][0], resultados[i][1], resultados[i][2]);
        }
    }
}
