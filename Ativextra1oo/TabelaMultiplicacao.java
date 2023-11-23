import java.util.Scanner;

class TabelaMultiplicacao {
    private int numero;

    public TabelaMultiplicacao(int numero) {
        this.numero = numero;
    }

    public void gerarTabela() {
        System.out.println("Tabela de multiplicação para " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(i + " x " + numero + " = " + resultado);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabela de multiplicação: ");
        int numero = scanner.nextInt();

        TabelaMultiplicacao tabela = new TabelaMultiplicacao(numero);
        tabela.gerarTabela();

        scanner.close();
    }
