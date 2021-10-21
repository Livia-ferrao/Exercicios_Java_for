package exercicio_aula3;

import javax.swing.JOptionPane;

//Faça um algoritmo que calcule: 
//Y = 1 * 2 * 3 * 4 * 5 * ... * 10. 

public class Exe06 {
	public static void main(String[] args) {
		int multi= 1;
		for(int i=1; i<=10; i++) {
			multi *= i;
		}
		
		JOptionPane.showMessageDialog(null, "A multiplicação é " + multi);
	}
}
