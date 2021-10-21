package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe25 {
	/*
	 * Fa�a um algoritmo para ler o nome de (N) alunos. Considere que cada aluno fez
	 * uma quantidade (X) de provas, onde cada aluno poder� ter feito um n�mero
	 * diferente de provas, isto �, o valor (X) pode ser diferente entre os alunos.
	 * Mostre para cada aluno a sua m�dia.
	 * 
	 */

	public static void main(String[] args) {
		int soma = 0;
		float media = 0;

		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos s�o? "));
		for (int i = 1; i <= qt; i++) {
			String nome = JOptionPane.showInputDialog("Nome do aluno: ");
			int provas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o/a " + nome + " fez? "));
			for (int j = 1; j <= provas; j++) {
				int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota da prova " + j + ": "));
				soma += nota;
			}
			media = (float) soma / provas;
			soma = 0;
			JOptionPane.showMessageDialog(null, "A m�dia do aluno " + i + " �: " + media);
		}
	}
}
