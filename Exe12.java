package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe12 {

	/*
	 * 12) Fa�a um algoritmo para fazer a leitura de N nomes e idades de pessoas, e
	 * ap�s, mostrar: a) O somat�rio de todas as idades. b) A m�dia das idades.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("S�o quantas pessoas ?"));
		int soma = 0;

		for (int i = 1; i <= qnt; i++) {
			// String nome = JOptionPane.showInputDialog("Digite o nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + i + "� pessoa: "));
			soma += idade;
		}

		int media = soma / qnt;

		JOptionPane.showMessageDialog(null, "A soma de todas as idades �: " + soma + ". A m�dia: " + media);
	}
}
