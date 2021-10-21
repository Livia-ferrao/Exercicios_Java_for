package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe10a {
	public static void main(String[] args) {

		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				soma -= i;
			} else {
				soma += i;
			}
		}

		JOptionPane.showMessageDialog(null, soma);
	}
}
