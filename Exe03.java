package exercicio_aula3;

import javax.swing.JOptionPane;

/*
 *Fa�a um algoritmo para mostrar na tela a seguinte 
 *seq��ncia de n�meros: 99 97 95 93 91...7 5 3 1.
 */

public class Exe03 {
	public static void main(String[] args) {
		
		String lista = "";
		
		for (int i = 99; i >= 1; i-=2) {
			lista += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null, lista);
	}
}
