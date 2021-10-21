package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe13 {
	/*
	 * 13) Faça um algoritmo para calcular e mostrar na tela o resultado da seguinte
	 * fórmula: Considere que o valor “N” será digitado pelo usuário.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja? "));
		double fracao = 0;

		for (double i = 1; i <= qnt; i++) {

			fracao += 1 / i;
		}

		JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", fracao));
	}
}
