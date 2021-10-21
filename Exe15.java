package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe15 {
	/*
	 * Fa�a um algoritmo onde o usu�rio dever� digitar o nome e a m�dia de N alunos.
	 * Durante a leitura, verifique se o aluno foi �aprovado�, �reprovado�, ou em
	 * �recupera��o�. Mostre na tela, uma mensagem apropriada, dependendo da
	 * situa��o do aluno. Considere que as situa��es poss�veis para os alunos s�o:
	 * Aprovado (m�dia >= 7.0); Recupera��o (2.0 <= m�dia < 7.0); Reprovado (m�dia <
	 * 2.0).
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos s�o? "));
		// String aprovados = "";
		// String reprovados = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			double media = Double.parseDouble(JOptionPane.showInputDialog("M�dia: "));

			if (media >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + ". Situa��o: Aprovado ");
				// aprovados += nome + " - ";
			} else if (media >= 2.0 && media < 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + ". Situa��o: Recupera��o");
			} else if (media < 2.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + ". Situa��o: Reprovado");
				// reprovados += nome + " - ";
			}
		}

	}

}
