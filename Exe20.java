package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe20 {
	/*Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura, mostre na tela o nome e
	 * média do aluno com a maior média. Considere que as médias sejam todas diferentes entre si.*/
	
	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
		float maiorMedia = 0;
		String nomeMaior = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a média: "));

			if (i == 1) {
				maiorMedia = media;
				nomeMaior = nome;
			} else {
				if (media > maiorMedia) {
					maiorMedia = media;
					nomeMaior = nome;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "A maior média é " + maiorMedia + " de " + nomeMaior);
	}
}
