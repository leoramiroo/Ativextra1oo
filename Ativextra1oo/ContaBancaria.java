class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "ContaBancaria [saldo=" + saldo + "]";
    }
}

public class ModificacaoDeObjetos {
    public static void realizarDeposito(ContaBancaria conta, double valor) {
        conta.depositar(valor);
    }

    public static void main(String[] args) 
        ContaBancaria minhaConta = new ContaBancaria(1000.0);

        System.out.println("Saldo inicial da conta: " + minhaConta.getSaldo());

        realizarDeposito(minhaConta, 500.0);

        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());
    }
}
