package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe16 {

	/*
	 * Fa�a um algoritmo para ler nome e sexo dos N alunos de uma sala de aula. Ap�s
	 * a leitura, mostre na tela quantos alunos s�o do sexo masculino, e quantos s�o
	 * do sexo feminino.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos s�o? "));
		int fem = 0;
		int masc = 0;

		for (int i = 1; i <= qnt; i++) {
			// String nome = JOptionPane.showInputDialog("Nome: ");
			char sexo = JOptionPane.showInputDialog("Sexo(F/M): ").toUpperCase().charAt(0);

			if (sexo == 'F') {
				fem += 1;
			} else if (sexo == 'M') {
				masc += 1;
			} else {
				JOptionPane.showMessageDialog(null, "Sexo inv�lido. Digite novamente.");
				i--;
			}
		}
		JOptionPane.showMessageDialog(null, "Feminino: " + fem + ". Masculino: " + masc);
	}
}
