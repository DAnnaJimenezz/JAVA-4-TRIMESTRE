// 8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.package ejercicios;
package ejercicios;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII: ");
        char caracter = sc.next().charAt(0);
        
        //Psamos el caracter a codigo
        int codigo =(int) caracter;
        System.out.println(codigo);
    }
    
    /**
     * //— Versión con JOptionPane
     * String texto = JOptionPane.showInputDialog ("Introduce un carcater ASCII: ");
     * 
     * //Pasamos el String a char con el metodo charAt
     * char caracter=texto.charAt(0;
     * 
     * //Pasamos el caracter a codigo
     * int codigo=(int) caracter;
     * 
     * System.out.println(codigo);
     */
}
