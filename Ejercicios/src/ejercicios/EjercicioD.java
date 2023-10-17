//4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
package ejercicios;
//import javax.swing.JOptionPane;
import java.util.Scanner;

public class EjercicioD {
    
    public static void main(String[] args) {
         // — Versión con Scanner
        //No aparce un cuadro de dialogo
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Bienvenid@ " +nombre);
    }
        
        // — Versión con JOptionPane
        
        /**String texto=JOptionPane.showInputDialog("Introduce un radio");
         * //Pasamos el String a double
         * double radio=Double.parseDouble(texto);
         * //Formula area circulo, usamos algunos de los metodos de Math
         * double area=Math.PI*Math.pow(radio, 2);
         * System.out.println("El area del circulo es "+area);
         * }
         */
}





