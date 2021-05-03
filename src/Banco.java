public class Banco {

    private double saldo;

    public Banco(){
        this.saldo = 0;
    }

    public boolean deposito(double valor){
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }
    public boolean saque(double valor){
        saldo -= valor;
        return true;
    }
    public double saldo(){
        return saldo;
    }
}
