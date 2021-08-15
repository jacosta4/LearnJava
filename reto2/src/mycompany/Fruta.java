package mycompany;

public class Fruta extends Producto {
    String color;
    public Fruta(String nombre, long identificador, int cantidad, String color) {
        super(nombre, identificador, cantidad);
        this.color = color;
    }

    public String toString() {
        return "\tFruta - Id: " + identificador + "\n\tCantidad: " + cantidad + " items" + "\n\tNombre: " + nombre + "\n\tColor: " + color + "\n";
    }

}
