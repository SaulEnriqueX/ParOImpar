import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero;
        int cantidad;


        try {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad de veces"));

            for (int i = 0; i < cantidad; i++) {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
                if ((numero % 2) == 0) {
                    JOptionPane.showMessageDialog(null, "Es par ");
                } else {
                    JOptionPane.showMessageDialog(null, "Es Impar ");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
            main(args);
            System.exit(0);
        }


    }
}