package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe20 {
	/*Fa�a um algoritmo para ler o nome e a m�dia de N alunos. Ap�s a leitura, mostre na tela o nome e
	 * m�dia do aluno com a maior m�dia. Considere que as m�dias sejam todas diferentes entre si.*/
	
	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos s�o? "));
		float maiorMedia = 0;
		String nomeMaior = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			float media = Float.parseFloat(JOptionPane.showInputDialog("Digite a m�dia: "));

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
		JOptionPane.showMessageDialog(null, "A maior m�dia � " + maiorMedia + " de " + nomeMaior);
	}
}
