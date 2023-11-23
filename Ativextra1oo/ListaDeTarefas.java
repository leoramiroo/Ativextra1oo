import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            String comando = JOptionPane.showInputDialog(
                "Comandos disponíveis:\n" +
                "- \"adicionar\" para adicionar uma nova tarefa\n" +
                "- \"listar\" para listar as tarefas\n" +
                "- \"concluir\" para marcar uma tarefa como concluída\n" +
                "- \"sair\" para sair do programa\n\n" +
                "Digite um comando:");

            switch (comando.toLowerCase()) {
                case "adicionar":
                    String descricao = JOptionPane.showInputDialog("Digite a descrição da tarefa:");
                    tarefas.add(descricao);
                    JOptionPane.showMessageDialog(null, "Tarefa adicionada com sucesso!");
                    break;
                case "listar":
                    if (tarefas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa pendente.");
                    } else {
                        StringBuilder listaTarefas = new StringBuilder("Tarefas pendentes:\n");
                        for (int i = 0; i < tarefas.size(); i++) {
                            listaTarefas.append(i + 1).append(". ").append(tarefas.get(i)).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, listaTarefas.toString());
                    }
                    break;
                case "concluir":
                    if (tarefas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa para concluir.");
                    } else {
                        int numeroTarefa = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tarefa a ser concluída:"));
                        if (numeroTarefa > 0 && numeroTarefa <= tarefas.size()) {
                            String tarefaConcluida = tarefas.remove(numeroTarefa - 1);
                            JOptionPane.showMessageDialog(null, "Tarefa \"" + tarefaConcluida + "\" marcada como concluída.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Número de tarefa inválido.");
                        }
                    }
                    break;
                case "sair":
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido. Tente novamente.");
            }
        }
    }
}
