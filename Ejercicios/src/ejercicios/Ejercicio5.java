//5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {
    
       public static void main(String[] args) {
           
           // — Versión con Scanner
           Scanner sc = new Scanner(System.in);
           System.out.println("Introduce un radio");
           sc.useLocale(Locale.US);
           double radio=sc.nextDouble();

           //Formula area circulo, usamos algunos de los metodos de Math
           double area=Math.PI*Math.pow(radio, 2);

           System.out.println("El area del circulo es "+area);
    }
       
       //— Versión con JOptionPane
       
       /**
        * String texto=JOptionPane.showInputDialog("Introduce un radio");
        * //Pasamos el String a double
        * double radio=Double.parseDouble(texto);
        * 
        * //Formula area circulo, usamos algunos de los metodos de Math
        * double area=Math.PI*Math.pow(radio, 2);
        * 
        * System.out.println("El area del circulo es "+area);
        * 
        * }
        */
    
}
