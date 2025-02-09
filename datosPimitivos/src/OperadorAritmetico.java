import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j " + (i - j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);
        System.out.println("i * j " + (i * j));

        int div = i / j;
        float div2 = (float)i / j;
        System.out.println("División = " + div);
        System.out.println("División con decimal = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }else {
            System.out.println("numero impar = " + numero);
        }
    }
}
