import java.util.Scanner;


class Vetor {
    private int tamanho;
    private int[] elementos;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.elementos = new int[tamanho];
    }

    public void preencher(Scanner scanner) {
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            elementos[i] = scanner.nextInt();
        }
    }

    public Vetor somar(Vetor outro) {
        Vetor resultado = new Vetor(tamanho);
        for (int i = 0; i < tamanho; i++) {
            resultado.elementos[i] = this.elementos[i] + outro.elementos[i];
        }
        return resultado;
    }

    public void exibir() {
        System.out.print("O vetor resultante é: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

public class SomaDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        Vetor vetor1 = new Vetor(tamanho);
        Vetor vetor2 = new Vetor(tamanho);

        vetor1.preencher(scanner);
        vetor2.preencher(scanner);

        Vetor resultado = vetor1.somar(vetor2);

        resultado.exibir();

        scanner.close();
    }
}
