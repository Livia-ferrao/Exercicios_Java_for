package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe23a {
	/*
	 * Fa�a um algoritmo para mostrar na tela a seguinte sequ�ncia de n�meros: 1, 0,
	 * 1, 2, 3 2, 0, 1, 2, 3 3, 0, 1, 2, 3
	 * 
	 */
	public static void main(String[] args) {
		String num = "";
		String junto = "";

		for (int i = 1; i <= 3; i++) {
			for (int a = 0; a <= 3; a++) {
				if (a == 3) {
					junto += a;
				} else {
					junto += a + ", ";
				}
			}
			num += i + ", " + junto + "\n";
			junto = "";
		}

		JOptionPane.showMessageDialog(null, num);
	}

}
