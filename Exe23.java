package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe23 {
	/*
	 * Fa�a um algoritmo para mostrar na tela a seguinte sequ�ncia de n�meros: 1, 0,
	 * 1, 2, 3 2, 0, 1, 2, 3 3, 0, 1, 2, 3
	 * 
	 */
	public static void main(String[] args) {
		String num = "";

		for (int i = 1; i <= 3; i++) {
			num += i + ", 0, 1, 2, 3 \n";
		}

		JOptionPane.showMessageDialog(null, num);
	}

}
