//6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.

package ejercicios;

import java.util.Scanner;

public class EjercicioE {
    public static void main(String[] args) {
        //— Versión con Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int numero=sc.nextInt();
  
        //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
        if (numero%2==0){
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
    }
    
    //— Versión con JOptionPane
    
    /**
     * String texto = JOptionPane.showInputDialog("Introduce un numero");
     * 
     * //Pasamos el String a int
     * int numero=Integer.parseInt (texto);
     * 
     * //Comprobamos si es divisible entre 2, es decir, si el resto de la division es 0
     * if (numero%2==0){
     *      System.out.println("El numero "+numero+" es divisible entre 2");
     * }else{
     *      System.out.println("El numero "+numero+" no es divisible entre 2");
     *}
     *}
     */
}
