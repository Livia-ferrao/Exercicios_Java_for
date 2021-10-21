package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe28 {
	/*
	 * Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade
	 * variável (Q) de clientes. Cada cliente faz apenas uma única operação:
	 * depósitos(D), ou retiradas(R). Faça um algoritmo para ler: Nome do cliente,
	 * tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita
	 * para cada um dos (Q) clientes de cada uma das (N) filas. Mostrar ao final, o
	 * número da fila que obteve o maior volume de depósitos, e o número da fila que
	 * obteve o menor volume de retiradas.
	 */
	public static void main(String[] args) {
		float total = 0;
		float depositos = 0;
		float retiradas = 0;
		String total1 = "";
		float maiorDep = 0;
		float menorReti = 0;
		int numFilaDep = 0;
		int numFilaReti = 0;

		int filas = Integer.parseInt(JOptionPane.showInputDialog("Quantas filas tem? "));
		for (int i = 1; i <= filas; i++) {
			int clientes = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes tem na fila " + i + "? "));
			for (int j = 1; j <= clientes; j++) {
				String nome = JOptionPane.showInputDialog("Qual o nome do cliente " + j + "? ");
				char operacao = JOptionPane
						.showInputDialog(nome + ", qual operação deseja fazer? Retirada(R) ou Depósito(D)? ")
						.toUpperCase().charAt(0);
				if (operacao == 'D') {
					float deposito = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do depósito? "));
					depositos += deposito;
					total += deposito;
				} else if (operacao == 'R') {
					float retirada = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da retirada? "));
					total -= retirada;
					retiradas += retirada;
				} else {
					JOptionPane.showMessageDialog(null, "Operação inválida. Digite novamente");
					j--;
				}
			}
			total1 += "Fila" + i + "\nTotal: " + total + "\n Retiradas: " + retiradas + "\n Depósitos: " + depositos
					+ "\n\n";

			if (i == 1) {
				maiorDep = depositos;
				menorReti = retiradas;
				numFilaDep = i;
			}
			if (depositos > maiorDep) {
				maiorDep = depositos;
				numFilaDep = i;
			}
			if (retiradas < menorReti) {
				menorReti = retiradas;
				numFilaReti = i;
			}

			depositos = 0;
			retiradas = 0;
			total = 0;

		}

		JOptionPane.showMessageDialog(null, "Fila com maior depósito: " + numFilaDep + " de " + maiorDep
				+ "\nFila com menor retirada: " + numFilaReti + " de " + menorReti);
		
		
		JOptionPane.showMessageDialog(null, total1);
	}

}
