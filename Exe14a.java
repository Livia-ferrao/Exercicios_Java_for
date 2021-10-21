package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe14a {
	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantas operações deseja fazer? "));
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Conta corrente: "));
		char depOuReti;

		for (int i = 1; i <= qnt; i++) {
			depOuReti = JOptionPane.showInputDialog("Deseja depositar(D) ou retirar(R)? ").toUpperCase().charAt(0);
			
			if (depOuReti == 'D') {
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar? "));
				saldo += valor;
			} else if (depOuReti == 'R') {
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja retirar? "));
				saldo -= valor;
			} else {
				JOptionPane.showMessageDialog(null, "Valor inválido");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Conta corrente: " + saldo);


	}
}
