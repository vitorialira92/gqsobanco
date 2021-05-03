public class Banco {

    private double saldo;

    public Banco(){
        this.saldo = 0;
    }

    public void deposito(double valor){
        saldo += valor;
    }
    public void saque(double valor){
        saldo -= valor;
    }
    public double saldo(){
        return saldo;
    }
}
