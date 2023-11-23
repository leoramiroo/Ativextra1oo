import java.util.Scanner;

class Matriz {
    private int linhas;
    private int colunas;
    private int[][] elementos;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.elementos = new int[linhas][colunas];
    }

    public void preencherMatriz(Scanner scanner) {
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                elementos[i][j] = scanner.nextInt();
            }
        }
    }

    public Matriz somarMatriz(Matriz outra) {
        Matriz resultado = new Matriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado.elementos[i][j] = this.elementos[i][j] + outra.elementos[i][j];
            }
        }
        return resultado;
    }

    public void exibirMatriz() {
        System.out.println("A matriz resultante é:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(elementos[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class SomaDeMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        Matriz matriz1 = new Matriz(linhas, colunas);
        Matriz matriz2 = new Matriz(linhas, colunas);

        System.out.println("Digite os elementos da primeira matriz:");
        matriz1.preencherMatriz(scanner);

        System.out.println("Digite os elementos da segunda matriz:");
        matriz2.preencherMatriz(scanner);

        Matriz resultado = matriz1.somarMatriz(matriz2);

        resultado.exibirMatriz();

        scanner.close();
    }
}
