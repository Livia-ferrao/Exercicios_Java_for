package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe27 {
	/*
	 * Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade
	 * variável (Q) de clientes. Cada cliente faz apenas uma única operação:
	 * depósitos(D), ou retiradas(R). Faça um algoritmo para ler: Nome do cliente,
	 * tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita
	 * para cada um dos (Q) clientes de cada uma das (N) filas. Mostrar na tela,
	 * para cada fila, o total de depósitos e retiradas que cada fila obteve.
	 */
	public static void main(String[] args) {
		float total = 0;
		float depositos = 0;
		float retiradas = 0;
		String total1 = "";
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
			total1 += "Fila" + i + "\nTotal: " + total + "\n Retiradas: " + retiradas + "\n Depósitos: " + depositos + "\n\n";
			depositos = 0;
			retiradas = 0;
			total = 0;
			
		}
		
		JOptionPane.showMessageDialog(null, total1);

	}
}
