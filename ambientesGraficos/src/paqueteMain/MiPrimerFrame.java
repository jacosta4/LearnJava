package paqueteMain;

import javax.swing.*;


public class MiPrimerFrame extends JFrame{

        public MiPrimerFrame(){
            dibujar();
        }

        private void dibujar() {
            setTitle("Tabla de medallas de Tokio 2020");
            // setSize(800,600);
            String[] encabezados = {"Pais", "Oro", "Plata", "Bronce"};
            String[][] valores = {
                    {"China", "29", "17", "16"},
                    {"Estados Unidos", "22", "25", "17"},
                    {"Japon", "17", "6", "10"},
            };
            JTable table = new JTable(valores, encabezados);
            JScrollPane jsp = new JScrollPane(table);               // JScrollPane se define con las tablas para generar un scroll si el elemento es mas perqueño de lo que yo necesito

            Object valor = table.getValueAt(2, 0);
            JLabel label= new JLabel(valor.toString());
            jsp.add(label);

            add(jsp);
            pack();                                                 // me genera la inicialización del as dimesiones que necesito
        }
}
