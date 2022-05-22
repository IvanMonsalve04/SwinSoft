package view;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pestanas {
    private JPanel panelPrueba;

    public Pestanas(){
		seleccion();    
    }

    public void seleccion(){
        setLayout(null);
        JOptionPane.showMessageDialog(null, "LOLA");
    }
    private void setLayout(Object object) {
    }

    public static void setSelectedComponent(PrimerPanel segundaPestaña) {
        JOptionPane.showMessageDialog(null, "Ventana Pestaña");
    }

    public static void add(String string, PrimerPanel segundaPestaña) {

    }

    public static void setseleccion(PrimerPanel segundaPestaña) {
    
    }
}
