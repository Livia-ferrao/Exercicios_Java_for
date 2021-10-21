package exercicio_aula3;

import javax.swing.JOptionPane;

class Exe21 {

	/*
	 * Fa�a um algoritmo para ler o nome e a m�dia de N alunos. Ap�s a leitura,
	 * mostre na tela o nome e m�dia do aluno com a menor m�dia. Considere que as
	 * m�dias sejam todas diferentes entre si.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos s�o? "));
		float menorMedia = 0;
		String nomeMenor = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a m�dia: "));

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
		JOptionPane.showMessageDialog(null, "A menor m�dia � " + menorMedia + " de " + nomeMenor);
	}
}
