package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe09 {

	/*
	 * Peça para o usuário digitar um número inteiro positivo qualquer, digamos N.
	 * Após calcule N!.
	 */

	public static void main(String[] args) {

		String fat = "";
		int fatResul = 1;

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		for (int i = n1; i >= 1; i--) {
			fat += i + " x ";
			fatResul *= i;
		}

		JOptionPane.showMessageDialog(null, fat + "=" + fatResul);
	}

}
