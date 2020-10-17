package cr.ac.itcr.trabajo.extraclase;

public class Factura {

    private int monto;
    private Object vehiculo;
    private Object perfil;

    public Factura(int monto, Object vehiculo, Object perfil) {
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.perfil = perfil;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Object getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Object vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Object getPerfil() {
        return perfil;
    }

    public void setPerfil(Object perfil) {
        this.perfil = perfil;
    }
    public void enviar(){
        //codigo para enviar la factura
    }
}