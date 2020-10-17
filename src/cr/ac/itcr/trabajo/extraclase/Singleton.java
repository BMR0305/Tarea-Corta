package cr.ac.itcr.trabajo.extraclase;

public class Singleton {
    public static Singleton instance = null;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;

    }
    public void conexion(String info){
        if (info == "Vehiculo" || info == "Perfil"){
            this.conBase();
        }
        else if (info == "Registro"){
            this.conFace();

        }
        else{
            this.conNacional();
        }
    }
    public void conNacional(){
        //codigo que para conectarse con el registro
        System.out.println("Se realizo la conexion con el registro");
    }
    public void conBase(){
        //codigo que para conectarse con la base de datos
        System.out.println("Se realizo la conexion con la base de datos");
    }
    public void conFace(){
        //codigo que para conectarse con Facebook
        System.out.println("Se realizo la conexion con Facebook");
    }
}

