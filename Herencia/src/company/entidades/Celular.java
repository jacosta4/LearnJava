package company.entidades;

public abstract class Celular {

    private String teclas;
    private String numero;

    // Para interactuar con atributos privados o protegidos toca hacerlo desde metodos
    // getter: Para obtener un valor de un atributo privado
    public String getTeclas() {
        return teclas;
    }

    // setter: Para asignar/modificar el valor de un atributo privado
    public void setTeclas(String teclas) {
        this.teclas = teclas;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public void llamar() {
        System.out.println("Llamando...");
    }

    public void recibirLlamadas() {}

    public void cargarBateria() {}

    // metodo abstracto:
    public abstract void cargarBateriaAbstracta();


}
