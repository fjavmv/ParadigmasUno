package francisco;

public class Principal {
    public static void main(String[] args) {
        CumpleMascota cu = new CumpleMascota(2.5, "Jose");
        CumpleMascota c = new CumpleMascota("Jose 2.5");
        CumpleMascota a = new CumpleMascota();

        cu.mostrarDatosM();
    }
}
