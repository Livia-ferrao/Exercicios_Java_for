package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe14 {

	/*
	 * Uma cliente possui um determinado valor X, como saldo de conta corrente em um
	 * banco. Durante o mês, são realizadas operações de depósitos e retiradas. Faça
	 * um algoritmo para ler as N operações bancárias realizadas durante o mês, e ao
	 * final mostrar na tela o saldo que ficou na conta bancárias da loja. Considere
	 * que uma operação bancária corresponde a leitura do valor movimentado e do
	 * tipo da operação: (D)epósito ou (R)etirada.
	 **/
	
	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantas operações deseja fazer? "));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Conta corrente: "));

		for (int i = 1; i <= qnt; i++) {
			String estado = JOptionPane.showInputDialog("Depósito(D) ou Retirada(R)? ");
			String letra = estado.substring(0,1);
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
			if (letra == "D") {
				saldo += valor;
			} else if (letra == "R") {
				saldo -= valor;
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}

		JOptionPane.showMessageDialog(null, "Conta corrente: " + saldo);

	}
}
