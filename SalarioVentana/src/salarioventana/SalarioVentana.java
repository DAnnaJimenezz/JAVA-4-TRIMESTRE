package salarioventana;
import javax.swing.JOptionPane;

public class SalarioVentana {

    public static void main(String[] args) {
        
        int salario= 1160000;
        int dia_mes=31;
        int valor_dia=0;
        int sd=0;
        
        
        String nombre = JOptionPane.showInputDialog("ESCRIBA SU NOMBRE: ");
        int dias = Integer.parseInt(JOptionPane.showInputDialog ("ESCRIBA LOS DIAS QUE HA TRABAJADO: "));

        valor_dia = salario / dia_mes;
        sd = valor_dia*dias;
        JOptionPane.showMessageDialog(null, "SU SALARIO MENSUAL ES: " + sd);
        JOptionPane.showMessageDialog(null, "SU SALARIO MENSUAL ES: " + valor_dia);

    }
}