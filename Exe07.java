package exercicio_aula3;

import javax.swing.JOptionPane;

/*Fa�a um algoritmo para somar e mostrar 
 * na tela o resultado da seguinte express�o
(1+2)+(2+3)+(3+4)+(4+5)+(5+6)+(6+7)+(7+8)+...+(100+101).
 */

public class Exe07 {
	public static void main(String[] args) {
		int soma = 0;
		
		
		for(int i=1; i<=100; i++) {
			soma += i + (i+1);
		}
		
		JOptionPane.showMessageDialog(null, soma);
	}
}
