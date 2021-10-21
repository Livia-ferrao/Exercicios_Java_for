package exercicio_aula3;

import javax.swing.JOptionPane;

/* Faça um algoritmo para mostrar na tela a seguinte
 *  seqüência de números: 10 20 30 40 50 60 70 80...
1000. */

public class Exe02 {
	public static void main(String[] args) {

		String lista = "";

		for (int i = 10; i <= 1000; i += 10) {
			lista += i + "\n";
		}

		JOptionPane.showMessageDialog(null, lista);
	}
}
