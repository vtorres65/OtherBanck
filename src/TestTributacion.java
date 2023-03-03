public class TestTributacion {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(222,333);
        cc.depositar(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImpuesto cal = new CalculadorDeImpuesto();

        cal.registra(cc);
        cal.registra(seguro);

        System.out.println(cal.getTotalImpuesto());
    }
}
