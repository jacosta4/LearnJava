package company.principal;

import company.entidades.Celular;
import company.entidades.smartphone;

public class Main {

    public static void main(String[] args) {

        smartphone miCelular = new smartphone();

        // metodos que herda de Celular
        miCelular.llamar();
        miCelular.recibirLlamadas();


        // metodos de smartphone
        miCelular.chatear();
        miCelular.navegaInternet();
        miCelular.llamar4G();

        Celular celularAbuelo = new Celular();

        celularAbuelo.recibirLlamadas();
        celularAbuelo.llamar();

    }
}
