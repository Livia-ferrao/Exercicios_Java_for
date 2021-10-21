package exercicio_aula3;

import javax.swing.JOptionPane;

/*Faça um algoritmo que peça para o usuário digitar 
 * dois valores inteiros positivos, digamos A e B. Após
 * calcule “A elevado ao expoente B”. 
 * */

public class Exe08 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int exp = Integer.parseInt(JOptionPane.showInputDialog("Expoente: "));
		
		int multi = 1;
		
		//2*3 =  2* 2* 2;
		for(int i=1; i<=exp; i++) {
			multi *= num;
		}
		
		JOptionPane.showMessageDialog(null, multi);
	}
}
