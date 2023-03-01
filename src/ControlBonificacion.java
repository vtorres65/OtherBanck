public class ControlBonificacion {

    private double suma;

    public double registrarSalario(Empleado empleado){
        this.suma = empleado.getBonificacion() + this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }

    public double registrarSalario(Gerente gerente){
        this.suma = gerente.getBonificacion() + this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }
}
