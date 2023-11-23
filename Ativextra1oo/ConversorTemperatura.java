import javax.swing.JOptionPane;

public class ConversorTemperatura {
    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog(
                "Escolha o tipo de conversão:\n" +
                "1. Celsius para Fahrenheit\n" +
                "2. Fahrenheit para Celsius");

        int opcao = Integer.parseInt(escolha);

        String inputTemperatura = JOptionPane.showInputDialog("Digite a temperatura:");

        double temperatura = Double.parseDouble(inputTemperatura);

        switch (opcao) {
            case 1:
                double resultadoFahrenheit = celsiusParaFahrenheit(temperatura);
                JOptionPane.showMessageDialog(null, "Resultado em graus Fahrenheit: " + resultadoFahrenheit);
                break;
            case 2:
                double resultadoCelsius = fahrenheitParaCelsius(temperatura);
                JOptionPane.showMessageDialog(null, "Resultado em graus Celsius: " + resultadoCelsius);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

