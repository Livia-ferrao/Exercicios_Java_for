package exercicio_aula3;

import javax.swing.JOptionPane;

class Exe21 {

	/*
	 * Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura,
	 * mostre na tela o nome e média do aluno com a menor média. Considere que as
	 * médias sejam todas diferentes entre si.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
		float menorMedia = 0;
		String nomeMenor = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a média: "));

			if (i == 1) {
				menorMedia = media;
				nomeMenor = nome;
			} else {
				if (media < menorMedia) {
					menorMedia = media;
					nomeMenor = nome;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "A menor média é " + menorMedia + " de " + nomeMenor);
	}
}
