package mycompany;

import java.util.Scanner;
import java.util.ArrayList;

public class Inventario {
    public static void main(String[] args) {
        String seleccion;
        Scanner sc = new Scanner(System.in);

        //creamos el arreglo donde almacenar los objetos
        ArrayList<Fruta> listaFruta = new ArrayList<Fruta>();
        ArrayList<Carne> listaCarne = new ArrayList<Carne>();


        do {
        System.out.println("\nEntrada: ");
        String cadena = sc.nextLine();
        // System.out.println(cadena);

        //transformo a arreglo
        String[] arreglo = cadena.split("&");
        // System.out.println(arreglo[0]);
        seleccion = arreglo[0];
        System.out.println(seleccion);

        if (seleccion.equals("1")) {
            System.out.println("Guardar Producto...");
            String tipo = arreglo[1];
            // System.out.println("Tipo: " + tipo);
            String nombre = arreglo[3];
            long identificador = Long.parseLong(arreglo[2]);
            int cantidad = Integer.parseInt(arreglo[4]);

            if(tipo.equals("Fruta")) {
                System.out.println("guardar fruta");
                String color = arreglo[5];
                Fruta fruta = new Fruta(nombre, identificador, cantidad, color);
                listaFruta.add(fruta);

            } else if (tipo.equals("Carne")) {
                System.out.println("guardar carne");
                String animal = arreglo[5];
                boolean pelo = Boolean.parseBoolean(arreglo[6]);
                Carne carne = new Carne(nombre, identificador, cantidad, animal, pelo);
                listaCarne.add(carne);

            }
        }else if (seleccion.equals("2")) {
            System.out.println("***Inventario de Productos***\n");
            //System.out.print(listaFruta.toString());
            //System.out.print(listaCarne.toString());
            for (Fruta fruta : listaFruta) {
                System.out.println(fruta);
            }
            for (Carne carne : listaCarne) {
                System.out.println(carne);
            }

        }else if (seleccion.equals("3")) {
            System.out.println("Salir...");
            break;

        }

        } while(!seleccion.equals("3"));
        System.out.println("programa terminado");

    }
}
