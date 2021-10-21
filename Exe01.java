package exercicio_aula3;

import javax.swing.JOptionPane;

/*Faça um algoritmo para mostrar na tela 
 * a seguinte seqüência de números:
 *  1 2 3 4 5 6 7 8...100*/

public class Exe01 {
	public static void main(String[] args) {
		String lista = "";

		for (int i = 0; i <= 100; i++) {
			lista += i + "\n";
		}

		JOptionPane.showMessageDialog(null, lista);
	}
}
