package cr.ac.itcr.trabajo.extraclase;

public class Perfil {
    private String correo;
    private int cédula;
    private int telefono;
    private int fechaVencimiento;
    private String direccion;
    private String licencia;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCédula() {
        return cédula;
    }

    public void setCédula(int cédula) {
        this.cédula = cédula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(int fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Perfil(String correo, int cédula, int telefono, int fechaVencimiento, String direccion, String licencia) {
        this.correo = correo;
        this.cédula = cédula;
        this.telefono = telefono;
        this.fechaVencimiento = fechaVencimiento;
        this.direccion = direccion;
        this.licencia = licencia;
    }
    public void eliminar(){
        //Codigo para eliminar un usuario
    }
    public void mostrar(){
        //Codigo que muestra el perfil del usuario solicitado

    }
    public void enviarinfo(){
        Singleton singleton = Singleton.getInstance();
        singleton.conexion("Perfil");
    }
}
