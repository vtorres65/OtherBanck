public class TestEmpleado {

    public static void main(String[] args) {
        Empleado diego = new Empleado();
        diego.setNombre("Diego");
        diego.setIdentificacion("123456");
        diego.setSalario(1000.0);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
