package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe11 {
	/*
	 * Faça um algoritmo para fazer a leitura de 10 nomes e idades de pessoas.
	 */

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da " + i + "° pessoa:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa: "));

			JOptionPane.showMessageDialog(null, i + "° pessoa: " + nome + ". Idade: " + idade + "\n");
		}
	}
}
