package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe19 {
	/*
	 * Uma empresa possui N funcion�rios dos quais s�o conhecidos seus nomes e
	 * idades. Fa�a um algoritmo que imprima o nome e a idade da pessoa mais idosa e
	 * a mais nova. Considere que n�o existem pessoas com idades iguais.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcion�rios s�o? "));
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
		JOptionPane.showMessageDialog(null, "O menor n�mero � " + menor + " de " + nomeMenor
				+ "\n O maior n�mero � " + maior + " de " + nomeMaior);
	}
}
