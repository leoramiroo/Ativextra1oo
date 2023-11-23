import java.util.Scanner;

public class TransposicaoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int numLinhas = scanner.nextInt();
        System.out.print("Digite o número de colunas: ");
        int numColunas = scanner.nextInt();

        System.out.println("Digite os elementos da matriz:");
        int[][] matrizOriginal = criarMatriz(numLinhas, numColunas);

        int[][] matrizTransposta = transporMatriz(matrizOriginal);

        System.out.println("\nA matriz transposta é:");
        exibirMatriz(matrizTransposta);
    }

    public static int[][] criarMatriz(int numLinhas, int numColunas) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[numLinhas][numColunas];
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] transporMatriz(int[][] matriz) {
        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;
        int[][] transposta = new int[numColunas][numLinhas];
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}