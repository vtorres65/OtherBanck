public abstract class Cuenta {

    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private  static int total;

    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total ++;
    }

    public abstract void depositar(double valor);

    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            this.retirar(valor);
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0){
            this.agencia = agencia;
        }
        System.out.println("No esta permitido valores negativos");
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("No puede ser el valor menor o igual a 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
