package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe16 {

	/*
	 * Faça um algoritmo para ler nome e sexo dos N alunos de uma sala de aula. Após
	 * a leitura, mostre na tela quantos alunos são do sexo masculino, e quantos são
	 * do sexo feminino.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
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
				JOptionPane.showMessageDialog(null, "Sexo inválido. Digite novamente.");
				i--;
			}
		}
		JOptionPane.showMessageDialog(null, "Feminino: " + fem + ". Masculino: " + masc);
	}
}
