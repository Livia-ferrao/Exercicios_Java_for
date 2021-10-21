package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe17 {
	/*
	 * Fa�a um algoritmo para ler uma s�rie de N n�meros do tipo REAL. Ap�s a
	 * leitura, mostre na tela o menor dentre todos os n�meros. Considere que o
	 * usu�rio poder� digitar qualquer n�mero, positivos, negativos e zero.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros s�o? "));
		float menor = 0;

		for (int i = 1; i <= qnt; i++) {
			float num = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero: "));

			if (i == 1) {
				menor = num;
			} else {
				if (num < menor) {
					menor = num;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "O menor n�mero � " + menor);
	}
}
