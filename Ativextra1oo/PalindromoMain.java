import java.util.Scanner;

class VerificadorPalindromo {
    private String palavra;

    public VerificadorPalindromo(String palavra) {
        this.palavra = palavra;
    }

    private String limparPalavra() {
        return palavra.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    public boolean verificarPalindromo() {
        String palavraLimpa = limparPalavra();
        int tamanho = palavraLimpa.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavraLimpa.charAt(i) != palavraLimpa.charAt(tamanho - i - 1)) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = scanner.nextLine();

        VerificadorPalindromo verificador = new VerificadorPalindromo(entrada);

        if (verificador.verificarPalindromo()) {
            System.out.println("A palavra \"" + entrada + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + entrada + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}
