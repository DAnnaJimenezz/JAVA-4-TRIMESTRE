
package calcularsalario;

import java.util.Scanner;

public class CalcularSalario {
    
    public static void main(String[] args) {
        
        String nombre = "";
        int salario=0;
        int num_dias=0;
        int division=0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE SU NOMBRE: ");
        nombre=teclado.next();
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE SU SALRIO MENSUAL: ");
        salario=teclado.nextInt();
        System.out.println("SEÑOR USUARIO POR FAVOR DIGITE UN NUMERO DE DIAS TRABAJADOS: ");
        num_dias=teclado.nextInt();
        
        division=salario/num_dias;
        System.out.println("SU NOMBRE ES: " + nombre + " USTED GANA EN " + num_dias + " DIAS" + " LA CANTIDAD DE: " + division);


    }
}
