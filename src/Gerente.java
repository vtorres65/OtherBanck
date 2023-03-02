public class Gerente extends Autenticable{

    // Sobre-escritura de metodo
    public double getBonificacion() {
        System.out.println("EJECUTANDO DESDE GERENTE");
        return 2000;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub

    }

    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        return false;
    }
}
