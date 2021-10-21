package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe29a {
	public static void main(String[] args) {
		int n = 1;
        int primo = 0;

        for (int i = 1; i <= n; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            int ePrimo= 0;


            for (int j = 1; j <= numero; j++) {
                if(numero%j == 0) {
                    ePrimo++;
                }
            }

            if(ePrimo==2) {
                primo++;
            }

            int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro número?");

            if (confirm == 0) {
                n++;
            } else {
                i = n + 2;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A quantidade de numeros primos é: "+primo);
	}
}
