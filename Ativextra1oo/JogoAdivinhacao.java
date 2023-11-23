import java.util.Random;
import java.util.Scanner;

class JogoAdivinhacao {
    private int numeroAleatorio;
    private int tentativas;

    public JogoAdivinhacao() {
        Random random = new Random();
        this.numeroAleatorio = random.nextInt(10) + 1;
        this.tentativas = 0;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe o número entre 1 e 10.");

        do {
            System.out.print("Tentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativas.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente novamente. O número é maior.");
            } else {
                System.out.println("Tente novamente. O número é menor.");
            }

        } while (tentativas == 0 || tentativas != numeroAleatorio);

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        jogo.jogar();
    }
}
