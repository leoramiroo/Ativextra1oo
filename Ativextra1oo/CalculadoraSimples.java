import javax.swing.JOptionPane;

public class CalculadoraSimples {
    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        String escolhaOperacao = JOptionPane.showInputDialog(
                "Escolha a operação:\n" +
                        "1. Adição\n" +
                        "2. Subtração\n" +
                        "3. Multiplicação\n" +
                        "4. Divisão\n" +
                        "Opção:");

        int opcao = Integer.parseInt(escolhaOperacao);

        double resultado;
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
