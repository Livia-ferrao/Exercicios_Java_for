package exercicio_aula3;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que calcule: 
 * Y = 1 + 2 + 3 + 4 + 5 + ... + 10.
 */

public class Exe05 {
	public static void main(String[] args) {
		int soma = 0;

		for (int i = 1; i <= 10; i++) {
			soma += i;
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}
