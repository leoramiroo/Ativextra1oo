class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class TrocaDeValores {
    public static void trocarValores(Ponto ponto1, Ponto ponto2) {
        int tempX = ponto1.getX();
        int tempY = ponto1.getY();

        ponto1.setX(ponto2.getX());
        ponto1.setY(ponto2.getY());

        ponto2.setX(tempX);
        ponto2.setY(tempY);
    }

    public static void main(String[] args) {
        Ponto pontoA = new Ponto(1, 2);
        Ponto pontoB = new Ponto(3, 4);

        System.out.println("Valores iniciais:");
        System.out.println("Ponto A: " + pontoA);
        System.out.println("Ponto B: " + pontoB);

        trocarValores(pontoA, pontoB);

        System.out.println("\nValores após a troca:");
        System.out.println("Ponto A: " + pontoA);
        System.out.println("Ponto B: " + pontoB);
    }
}
