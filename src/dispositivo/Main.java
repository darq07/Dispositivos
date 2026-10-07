package dispositivo;

public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo();
        Dispositivo d2 = new Dispositivo();
        d1.setNombre("Teclado");
        d1.setTipo("Entrada");
        d1.setActivo(true);

        d2.setNombre("Mouse");
        d2.setTipo("Entrada");
        d2.setActivo(false);

        d1.mostrarInformacion();
        d1.mostrarEstado();

        d2.mostrarInformacion();
        d2.mostrarEstado();

        d2.setNombre("");
        System.out.println(d2.getNombre());


    }
}