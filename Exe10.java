package exercicio_aula3;

import javax.swing.JOptionPane;

//10) Faça um algoritmo para somar e mostrar na tela o resultado da seguinte expressão 1-2+3-4+5-6+7-
//8+9-10+...100.

public class Exe10 {
	public static void main(String[] args) {

		int soma = 0;
		int sub = 0;

		for (int i = 1; i <= 99; i += 2) {
			soma += i;
		}

		for (int i = -2; i >= -100; i -= 2) {
			sub += i;
		}

		int total = soma + sub;

		JOptionPane.showMessageDialog(null, total);
	}
}
