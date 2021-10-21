package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe24 {
	/*
	 * Faça um algoritmo para mostrar na tela a seguinte sequência de números: 1, 3,
	 * 2, 1, 0 2 , 3, 2, 1, 0 3, 3, 2, 1, 0
	 */

	public static void main(String[] args) {
		String lista = "";
		String junto = "";

		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= 0; j--) {
				if (j == 0) {
					lista += j;
				} else {
					lista += j + ", ";
				}
			}
			junto += i + ", " + lista + "\n";
			lista = "";
		}

		JOptionPane.showMessageDialog(null, junto);
	}
}
