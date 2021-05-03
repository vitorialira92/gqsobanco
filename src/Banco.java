public class Banco {

    private double saldo;

    public Banco(){
        this.saldo = 0;
    }

    public boolean deposito(double valor){
        //não é permitido depositar valores negativos
        if(valor <= 0){
            return false;
        }
        saldo += valor;
        return true;
    }
    public boolean saque(double valor){
        //não é possível sacar um valor maior que o saldo da conta
        if(saldo < valor){
            return false;
        }
        if(valor <= 0){
            return false;
        }
        saldo -= valor;
        return true;
    }
    public double saldo(){
        return saldo;
    }
}
