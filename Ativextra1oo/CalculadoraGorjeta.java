import javax.swing.JOptionPane;

public class CalculadoraGorjeta {
    public static void main(String[] args) {
        // Solicita ao usuário o valor total da conta
        String inputConta = JOptionPane.showInputDialog("Digite o valor total da conta:");
        double valorConta = Double.parseDouble(inputConta);

        // Solicita ao usuário a porcentagem de gorjeta desejada
        String inputPorcentagem = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar:");
        double porcentagemGorjeta = Double.parseDouble(inputPorcentagem);

        // Calcula o valor da gorjeta e o total a ser pago
        double valorGorjeta = (valorConta * porcentagemGorjeta) / 100;
        double totalPago = valorConta + valorGorjeta;

        // Formata a saída
        String output = String.format("Valor da gorjeta: $%.2f\nTotal a ser pago: $%.2f", valorGorjeta, totalPago);

        // Exibe a saída utilizando JOptionPane
        JOptionPane.showMessageDialog(null, output);
    }
}
