
package algoritmo12;

import javax.swing.JOptionPane;

/**
 *
 * @Tomas Daniel Galeano
 */
public class Algoritmo12 {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 9; i++) {
            int Numero = (int) Math.pow(i,2);
            JOptionPane.showMessageDialog(null, "El cuadrado de: " +  i + " es: " + Numero);
            
        }
    }
    
}
