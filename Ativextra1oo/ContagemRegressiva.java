import javax.swing.JOptionPane;

public class ContagemRegressiva {
    public static void main(String[] args) {
        int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inicial:"));

        while (numeroInicial >= 1) {
            System.out.println(numeroInicial);
            numeroInicial--;
        }
    }
}
