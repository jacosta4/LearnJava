package company.entidades;

public class Celular {

    private String teclas;
    private String numero;

    // Para iunteractuar con atributos privados o protegidos toca hacerlo desde metodos
    // getter: Para asignarle un valor 
    public String getTeclas() {
        return teclas;
    }

    // setter: Para obtener el valor
    public void setTeclas(String teclas) {
        this.teclas = teclas;
    }

    public void llamar() {}

    public void recibirLlamadas() {}

    protected void llamar2G() {
        llamar();
    }


}
