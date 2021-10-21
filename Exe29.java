package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe29 {
	/*
	 * Faça um algoritmo para ler uma série de (N) número inteiros maiores que
	 * zero(0). Após a leitura mostre na tela a quantidade de números primos
	 * digitados. Considere que um número é primo ser ele for divisível somente por
	 * (1) e por ele mesmo. Dica para determinar se um número é primo: se você
	 * dividir um determinado número(X) por todos os valores inteiros existentes
	 * entre (1) e (X), o total de divisores tem de ser menor/igual a dois (2).
	 */
	public static void main(String[] args) {
		int quantidadePrimos = 0;
		int n = 1;
		for (int i = 1; i <= n; i++) {

			int num = Integer.parseInt(JOptionPane.showInputDialog("Número: "));

			if (num <= 0) {
				i--;
				return;
			}
			
			int quantidadeDivisaoExata = 0;

			for (int j = num; j > 0; j--) {
				if (num % j == 0) {
					quantidadeDivisaoExata++;
				}
			}
			
			if (quantidadeDivisaoExata == 2) {
				quantidadePrimos++;
			}


			int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}

		}
		
		JOptionPane.showMessageDialog(null, "Números primos foram digitados: " + quantidadePrimos);

	}
}
