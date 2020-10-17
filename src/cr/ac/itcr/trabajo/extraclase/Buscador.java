package cr.ac.itcr.trabajo.extraclase;


import java.util.Observable;

public class Buscador extends Observable {
    private int texfield;
    private int button;
    private int checkbutton;

    public Buscador(int texfield, int button, int checkbutton) {
        this.texfield = texfield;
        this.button = button;
        this.checkbutton = checkbutton;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }

    public int getCheckbutton() {
        return checkbutton;
    }

    public void setCheckbutton(int checkbutton) {
        this.checkbutton = checkbutton;
    }

    public int getTexfield() {
        return texfield;
    }

    public void setTexfield(int texfield) {
        this.texfield = texfield;
    }

    public void buscar(){
        //codigo que busca a los automoviles en un rango de fechas y los muestra con el metodo mostrar de Vehículo

    }
}

