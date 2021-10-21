package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe14 {

	/*
	 * Uma cliente possui um determinado valor X, como saldo de conta corrente em um
	 * banco. Durante o m�s, s�o realizadas opera��es de dep�sitos e retiradas. Fa�a
	 * um algoritmo para ler as N opera��es banc�rias realizadas durante o m�s, e ao
	 * final mostrar na tela o saldo que ficou na conta banc�rias da loja. Considere
	 * que uma opera��o banc�ria corresponde a leitura do valor movimentado e do
	 * tipo da opera��o: (D)ep�sito ou (R)etirada.
	 **/
	
	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantas opera��es deseja fazer? "));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Conta corrente: "));

		for (int i = 1; i <= qnt; i++) {
			String estado = JOptionPane.showInputDialog("Dep�sito(D) ou Retirada(R)? ");
			String letra = estado.substring(0,1);
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
			if (letra == "D") {
				saldo += valor;
			} else if (letra == "R") {
				saldo -= valor;
			} else {
				JOptionPane.showMessageDialog(null, "Valor inv�lido");
			}
		}

		JOptionPane.showMessageDialog(null, "Conta corrente: " + saldo);

	}
}
