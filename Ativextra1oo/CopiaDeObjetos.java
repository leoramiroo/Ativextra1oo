class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + "]";
    }
}

public class CopiaDeObjetos {
    public static Aluno fazerCopia(Aluno original) {
        return new Aluno(original.getNome(), original.getNota());
    }

    public static void main(String[] args) {
        Aluno alunoOriginal = new Aluno("João", 7.5);

        System.out.println("Estado inicial do aluno:");
        System.out.println(alunoOriginal);

        Aluno alunoCopia = fazerCopia(alunoOriginal);

        alunoCopia.setNome("Maria");
        alunoCopia.setNota(9.0);
        System.out.println("\nEstado após a modificação da cópia:");
        System.out.println("Aluno Original: " + alunoOriginal);
        System.out.println("Aluno Cópia: " + alunoCopia);
    }
}
