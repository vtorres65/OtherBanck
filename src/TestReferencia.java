public class TestReferencia {

    public static void main(String[] args) {
        Empleado empleado = new Contador();
        empleado.setNombre("Luisa");
        empleado.setSalario(4000);

        Gerente gerente = new Gerente();
        gerente.setNombre("Jairo");
        gerente.setSalario(8000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

    }
}
