package company.entidades;

import company.entidades.Celular;

public class smartphone extends Celular {

    /*
    * Extends extiende/herda clases concretas o abstractas
    */

    /*
    * Modificadores
    * public: cualquier clase puede acceder desde afuera
     * protected: los metodos o atributos son adsequibles solo para las clases hijas (que heredan) o clases dentro del mismo paquete
     * private: solo se puede utilizar en la misma clase
    * */

    String pantalla;
    String camara;
    String memoria;

    public void chatear() {
        String teclasInteligentes = getTeclas();
    }

    public void navegaInternet() {}

    public void llamar4G() {
        llamar();
    }
}
