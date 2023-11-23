import javax.swing.JOptionPane;

public class ConversorIdade {
    public static void main(String[] args) {
        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos:"));

        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;
        int idadeHoras = idadeDias * 24;
        int idadeMinutos = idadeHoras * 60;

        String resultado = String.format("Idade em meses: %d\nIdade em dias: %d\nIdade em horas: %d\nIdade em minutos: %d",
                idadeMeses, idadeDias, idadeHoras, idadeMinutos);
        JOptionPane.showMessageDialog(null, resultado);
    }
}
