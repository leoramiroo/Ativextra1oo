import javax.swing.JOptionPane;

public class VerificacaoParImpar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar.");
        }
    }
}
