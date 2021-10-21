package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe12 {

	/*
	 * 12) Faça um algoritmo para fazer a leitura de N nomes e idades de pessoas, e
	 * após, mostrar: a) O somatório de todas as idades. b) A média das idades.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("São quantas pessoas ?"));
		int soma = 0;

		for (int i = 1; i <= qnt; i++) {
			// String nome = JOptionPane.showInputDialog("Digite o nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + i + "° pessoa: "));
			soma += idade;
		}

		int media = soma / qnt;

		JOptionPane.showMessageDialog(null, "A soma de todas as idades é: " + soma + ". A média: " + media);
	}
}
