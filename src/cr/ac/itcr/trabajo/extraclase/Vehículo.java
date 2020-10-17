package cr.ac.itcr.trabajo.extraclase;

public class Vehículo {
    private int placa;
    private String foto;
    private int precio;
    private boolean estado;
    private boolean inventario;
    private int plazas;
    private String tipo;
    private String extras;

    public Vehículo(int placa, String foto, int precio, boolean estado, boolean inventario, int plazas, String tipo, String extras) {
        this.placa = placa;
        this.foto = foto;
        this.precio = precio;
        this.estado = estado;
        this.inventario = inventario;
        this.plazas = plazas;
        this.tipo = tipo;
        this.extras = extras;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isInventario() {
        return inventario;
    }

    public void setInventario(boolean inventario) {
        this.inventario = inventario;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
    public void eliminar(){
        //Codigo para eliminar el auto
    }
    public void mostrar(){
        //Codigo para mostrar el auto
    }
    public void enviarinfo(String info){
        Singleton singleton = Singleton.getInstance();
        singleton.conexion(info);
    }
}
