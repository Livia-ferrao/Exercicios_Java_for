package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe22 {
	public static void main(String[] args) {
		int n = 1;
		int andarInicio = Integer.parseInt(JOptionPane.showInputDialog("Qual o andar inicial? "));
		for (int i = 1; i <= n; i++) {
			int andarIndo = Integer.parseInt(JOptionPane.showInputDialog("Qual o próximo andar? "));
			if (andarIndo > andarInicio) {
				JOptionPane.showMessageDialog(null, "Subindo...");
				andarInicio = andarIndo;
			} else if (andarIndo < andarInicio) {
				JOptionPane.showMessageDialog(null, "Descendo...");
				andarInicio = andarIndo;
			} else if (andarIndo == andarInicio) {
				JOptionPane.showMessageDialog(null, "Parado...");
				andarInicio = andarIndo;
			}
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja ir para outro andar? ");
			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
	}
}
