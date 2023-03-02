public class SistemaInterno {

    private String clave = "AluraCursosOnLine";

    public boolean autenticar(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        }else {
            System.out.println("Error de login");
            return false;
        }
    }
}
