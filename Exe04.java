package exercicio_aula3;

import javax.swing.JOptionPane;

// Fa�a um algoritmo para mostrar na tela a seguinte seq��ncia de n�meros: 1000 990 980 970 ... 40 30
//20 10.

public class Exe04 {
	public static void main(String[] args) {

		String lista = "";

		for (int i = 1000; i >= 10; i -= 10) {
			lista += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, lista);
	}
}
