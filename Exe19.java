package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe19 {
	/*
	 * Uma empresa possui N funcionários dos quais são conhecidos seus nomes e
	 * idades. Faça um algoritmo que imprima o nome e a idade da pessoa mais idosa e
	 * a mais nova. Considere que não existem pessoas com idades iguais.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários são? "));
		int menor = 0;
		int maior = 0;
		String nomeMaior = "";
		String nomeMenor = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			int num = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));

			if (i == 1) {
				menor = num;
				maior = num;
				nomeMaior = nome;
				nomeMenor = nome;
			} else {
				if (num < menor) {
					menor = num;
					nomeMenor = nome;
				} 
				
				if (num > maior) {
					maior = num;
					nomeMaior = nome;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "O menor número é " + menor + " de " + nomeMenor
				+ "\n O maior número é " + maior + " de " + nomeMaior);
	}
}
