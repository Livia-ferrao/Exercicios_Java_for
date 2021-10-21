package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe17 {
	/*
	 * Faça um algoritmo para ler uma série de N números do tipo REAL. Após a
	 * leitura, mostre na tela o menor dentre todos os números. Considere que o
	 * usuário poderá digitar qualquer número, positivos, negativos e zero.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos números são? "));
		float menor = 0;

		for (int i = 1; i <= qnt; i++) {
			float num = Float.parseFloat(JOptionPane.showInputDialog("Digite um número: "));

			if (i == 1) {
				menor = num;
			} else {
				if (num < menor) {
					menor = num;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "O menor número é " + menor);
	}
}
