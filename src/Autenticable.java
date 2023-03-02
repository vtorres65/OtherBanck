public abstract interface Autenticable extends Empleado{

    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public abstract boolean iniciarSesion(String clave);

}
