import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros:"));

        double imc = peso / (altura * altura);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 39.9) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III";
        }

        JOptionPane.showMessageDialog(null, String.format("Seu IMC é: %.2f\nClassificação de IMC: %s", imc, classificacao));
    }
}
