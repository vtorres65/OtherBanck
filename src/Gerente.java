public class Gerente extends Empleado implements Autenticable{

    // Sobre-escritura de metodo
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

    @Override
    public void setClave(String clave) {

    }

    public boolean iniciarSesion(String clave) {
        return false;
    }
}
