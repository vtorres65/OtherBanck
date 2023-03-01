public class Contador extends Empleado{

    @Override
    public double getBonificacion() {
        System.out.println("ejecutando contador");
        return super.getBonificacion();
    }
}
