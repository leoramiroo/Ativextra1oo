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

    public Matriz multiplicarMatriz(Matriz outra) {
        if (this.colunas != outra.linhas) {
            System.out.println("Erro: O número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz.");
            return null;
        }

        Matriz resultado = new Matriz(this.linhas, outra.colunas);
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < outra.colunas; j++) {
                for (int k = 0; k < this.colunas; k++) {
                    resultado.elementos[i][j] += this.elementos[i][k] * outra.elementos[k][j];
                }
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

public class MultiplicacaoDeMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhas1 = scanner.nextInt();

        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunas1 = scanner.nextInt();

        Matriz matriz1 = new Matriz(linhas1, colunas1);

        System.out.println("Digite os elementos da primeira matriz:");
        matriz1.preencherMatriz(scanner);

        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhas2 = scanner.nextInt();

        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunas2 = scanner.nextInt();

        Matriz matriz2 = new Matriz(linhas2, colunas2);

        System.out.println("Digite os elementos da segunda matriz:");
        matriz2.preencherMatriz(scanner);

        Matriz resultado = matriz1.multiplicarMatriz(matriz2);

        if (resultado != null) {
            resultado.exibirMatriz();
        }

        scanner.close();
    }
}
