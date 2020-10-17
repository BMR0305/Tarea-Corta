package cr.ac.itcr.trabajo.extraclase;

import java.util.Observable;
import java.util.Observer;

public class Ventana implements Observer {
    private int button;
    private int textArea;
    private int textField;
    private int panel;
    private int scrollbar;

    public Ventana(int button, int textArea, int textField, int panel, int scrollbar) {
        this.button = button;
        this.textArea = textArea;
        this.textField = textField;
        this.panel = panel;
        this.scrollbar = scrollbar;
    }

    public void founcionalidadBotones(){
        //codigo de la funcion de los botonones
    }
    public void textRestriccion(){
        //codigo que restringe los caracteres en los textarea
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
