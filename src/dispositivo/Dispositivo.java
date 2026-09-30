package dispositivo;

public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre+ "\nTipo: "+tipo+"\nActivo: "+activo);

    }

    void mostrarEstado() {
        String estado = activo?"estado activo":"estado inactivo";
        System.out.println(nombre+""+estado);
    }
}
