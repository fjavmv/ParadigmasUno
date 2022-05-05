package francisco;

public class CumpleMascota {
    private  String n;
    private double e;

    public CumpleMascota(){

    }

    public CumpleMascota(String datosMascota){

    }
    public CumpleMascota(double edad, String nobre){
        this.n = nobre;
        this.e = edad;
    }

    private String nombreM(){
        return n;
    }

    private double edadM(){
        return e;
    }

    private String concetradorDeDatos(){

        return  "Mi mascota se llama: "+ nombreM() + " " + " y tienen: " + edadM() + " años de edad";
    }


    public  void mostrarDatosM(){
        System.out.println(concetradorDeDatos());
    }

}
