package dispositivo;

public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Dispositivo();
        Dispositivo d2 = new Dispositivo();
        d1.nombre="Teclado";
        d1.tipo="Entrada";
        d1.activo=true;

        d2.nombre="Mouse";
        d2.tipo="Entrada";
        d2.activo=false;

        d1.mostrarInformacion();
        d1.mostrarEstado();

        d2.mostrarInformacion();
        d2.mostrarEstado();

        d1.activo=false;
        d1.mostrarEstado();
    }
}