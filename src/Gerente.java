public class Gerente extends Empleado{

    private String clave;
    private int contraseña;

    public void setClave(String clave){
        this.clave = clave;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnLine";
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }
    public double getBonificacion(){
        return super.getSalario() + super.getSalario() * 0.05;
    }
}
