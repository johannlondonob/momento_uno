package algoritmo11;

import javax.swing.JOptionPane;

/**
 *
 * @Tomas Galeano
 */
public class Algoritmo11 {

    public static void main(String[] args) {
        String Respuesta = JOptionPane.showInputDialog("Eres bachiller ...? \n Ingrese: Si, No");
        if ("Si".equals(Respuesta) || "si".equals(Respuesta)) {
            JOptionPane.showMessageDialog(null, "Puedes acceder");
        }else{
            String Bachiller = JOptionPane.showInputDialog("Superaste la prueba ...? \n Ingrese: Si, No");
            if ("Si".equals(Bachiller) || "si".equals(Bachiller)) {
                JOptionPane.showMessageDialog(null, "Puedes acceder");
            }else{
                JOptionPane.showMessageDialog(null, "No! puedes acceder");
            }
        }
    }
    
}
