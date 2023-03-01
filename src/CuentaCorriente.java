public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    @Override
    public boolean retirar(double valor) {
        double comision = valor + 1.2;
        return super.retirar(comision);
    }
}
