package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe15 {
	/*
	 * Faça um algoritmo onde o usuário deverá digitar o nome e a média de N alunos.
	 * Durante a leitura, verifique se o aluno foi “aprovado”, “reprovado”, ou em
	 * “recuperação”. Mostre na tela, uma mensagem apropriada, dependendo da
	 * situação do aluno. Considere que as situações possíveis para os alunos são:
	 * Aprovado (média >= 7.0); Recuperação (2.0 <= média < 7.0); Reprovado (média <
	 * 2.0).
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
		// String aprovados = "";
		// String reprovados = "";

		for (int i = 1; i <= qnt; i++) {
			String nome = JOptionPane.showInputDialog("Nome: ");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Média: "));

			if (media >= 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + ". Situação: Aprovado ");
				// aprovados += nome + " - ";
			} else if (media >= 2.0 && media < 7.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + ". Situação: Recuperação");
			} else if (media < 2.0) {
				JOptionPane.showMessageDialog(null, "Aluno: " + nome + ". Situação: Reprovado");
				// reprovados += nome + " - ";
			}
		}

	}

}
