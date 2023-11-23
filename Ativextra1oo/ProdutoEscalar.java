import java.util.Scanner;

class Vetor {
    private int tamanho;
    private double[] elementos;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new double[tamanho];
    }

    public void preencher(Scanner scanner) {
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = scanner.nextDouble();
        }
    }

    public double calcularProdutoEscalar(Vetor outro) {
        double resultado = 0.0;
        for (int i = 0; i < tamanho; i++) {
            resultado += this.elementos[i] * outro.elementos[i];
        }
        return resultado;
    }
}

public class ProdutoEscalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        Vetor vetor1 = new Vetor(tamanho);
        Vetor vetor2 = new Vetor(tamanho);

        vetor1.preencher(scanner);
        vetor2.preencher(scanner);

        double resultado = vetor1.calcularProdutoEscalar(vetor2);

        System.out.println("O produto escalar dos vetores é: " + resultado);

        scanner.close();
    }
}
