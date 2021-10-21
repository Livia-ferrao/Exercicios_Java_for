package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe18 {
	/*
	 * Uma sala de aula possui N alunos, dos quais é conhecido: Nome, cidade onde
	 * mora e idade. Faça um algoritmo que imprima: a) A quantidade de alunos que
	 * residem em TUBARÃO b) A quantidade de alunos que residem em JAGUARUNA c) A
	 * quantidade de alunos que possuem idade inferior a 17 anos
	 */

	public static void main(String[] args) {
		int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são? "));
		int tubarao = 0;
		int jaguaruna = 0;
		int soma = 0;

		for (int i = 1; i <= qnt; i++) {
			//String nome = JOptionPane.showInputDialog("Nome? ");
			String cidade = JOptionPane.showInputDialog("Qual a cidade que mora o aluno "+ i +"? Tubarão(T) ou Jaguaruna(J) ").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade? "));

			if (cidade.equals("TUBARÃO")) {
				tubarao += 1;
			}
	 
			if (cidade.equals( "JAGUARUNA")) {
				jaguaruna += 1;
			}
			
			
			if(idade<17) {
				soma += 1;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de alunos que mora em Tubarão é " + tubarao 
				+ "\n A quantidade de alunos que moram em Jaguaruna é " + jaguaruna 
				+ "\n Alunos com menos de 17: " + soma);

	}

}
