import javax.swing.JOptionPane;

public class MediaPonderada {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina 1 (de 0 a 10):"));
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da disciplina 1:"));

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina 2 (de 0 a 10):"));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da disciplina 2:"));

        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina 3 (de 0 a 10):"));
        double peso3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da disciplina 3:"));

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        JOptionPane.showMessageDialog(null, "A média ponderada das notas é: " + mediaPonderada);
    }
}
