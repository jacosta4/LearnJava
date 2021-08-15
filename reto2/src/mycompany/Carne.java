package mycompany;

public class Carne extends Producto {
    String animal;
    String pelo;

    public Carne(String nombre, long identificador, int cantidad, String animal, boolean pelo ) {
        super(nombre, identificador, cantidad);
        this.animal = animal;
        this.pelo = pelo ? "Si" : "No";
    }

    public String toString() {
        return "\tCarne - Id: " + identificador + "\n\tCantidad: " + cantidad + " Kg" + "\n\tNombre: " + nombre + "\n\tAnimal: " + animal + "\n\tTiene pelo: " + pelo + "\n";

    }

}
