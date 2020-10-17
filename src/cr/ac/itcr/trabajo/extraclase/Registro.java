package cr.ac.itcr.trabajo.extraclase;

public class Registro {
    private String correo;
    private int numeroCedula;
    private int telefono;
    private String fechaVencimiento;
    private String direccion;
    private String licencia;

    public Registro(String correo, int numeroCedula, int telefono, String fechaVencimiento, String direccion, String licencia) {
        this.correo = correo;
        this.numeroCedula = numeroCedula;
        this.telefono = telefono;
        this.fechaVencimiento = fechaVencimiento;
        this.direccion = direccion;
        this.licencia = licencia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
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

    public void verificar(){
        //codigo que verifica el correo de la persona
    }
    public void registrar(){
        //codigo que ingresa a la persona al sistema
    }
}
