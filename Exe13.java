package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe13 {
	/*
	 * 13) Fa�a um algoritmo para calcular e mostrar na tela o resultado da seguinte
	 * f�rmula: Considere que o valor �N� ser� digitado pelo usu�rio.
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros deseja? "));
		double fracao = 0;

		for (double i = 1; i <= qnt; i++) {

			fracao += 1 / i;
		}

		JOptionPane.showMessageDialog(null, "Resultado: " + String.format("%.2f", fracao));
	}
}
