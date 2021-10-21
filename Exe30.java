package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe30 {

	/*
	 * Ao prestar um serviço em uma oficina mecânica, um funcionário coloca várias
	 * peças em um carro e ao final informa o valor da mão de obra. Sendo que na
	 * oficina há N funcionários trabalhando e cada um presta X serviços por dia, em
	 * cada serviço prestado poderão ser colocadas várias peças, e para cada peça
	 * deve-se informar a quantidade e o valor, mostre:
	 *  a) Total arrecadado pela empresa ao final do dia;
	 *  b) Total de cada funcionário; 
	 *  c) Total de cada serviço;
	 *  d) Nome do funcionário que arrecadou mais com mão de obra;
	 *  e) Nome do funcionário que arrecadou menos com mão de obra.
	 */

	public static void main(String[] args) {
		int totValorGeral = 0;
		
		int totFuncionario = 0;
		int totValorFuncio = 0;
		String junto = "";
		
		int totServiço = 0;
		int totValorServico = 0;
		String junto1 = "";
		
		int maiorValor = 0;
		String nomeMaior = "";
		int menorValor = 0;
		String nomeMenor = "";
		
		int qntFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcionários existem? "));
		for (int i = 1; i <= qntFuncionarios; i++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do " + i + " funcionário? ");
			int servicos = Integer.parseInt(JOptionPane.showInputDialog("Quantos serviços " + nome + " faz? "));
			for (int j = 1; j <= servicos; j++) {
				int pecas = Integer.parseInt(JOptionPane.showInputDialog("Quantas peças " + nome + " coloca no "+ j + " serviço? "));
				for (int p = 1; p <= pecas; p++) {
					int valor =  Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da " + p + "° peça do " + j + "° serviço? "));
					totValorGeral += valor;
					totValorFuncio += valor;
					totValorServico += valor;
				}
				
				totServiço = totValorServico;
				
				junto1 += "\nTotal do serviço " + j + "do" + i + "° funcionário: " + totServiço;
				
				totServiço = 0;
				totValorServico = 0;
				
			}
			
			totFuncionario += totValorFuncio;
			
			junto += "\nTotal do funcionário " + i + ": " + totFuncionario;
			
			if (i==1) {
				maiorValor = totFuncionario;
				menorValor = totFuncionario;
				nomeMaior = nome;
				nomeMenor = nome;
			} else {
				if (totFuncionario > maiorValor) {
					maiorValor = totFuncionario;
					nomeMaior = nome;
				}
				if (totFuncionario < menorValor) {
					menorValor = totFuncionario;
					nomeMenor = nome;
				}
			}
			
			totFuncionario = 0;
			totValorFuncio = 0;
			
		}
		
		
		JOptionPane.showMessageDialog(null, "Total arrecadado pela empresa ao final do dia: " + totValorGeral
				+ junto 
				+ junto1
				+ "\nNome do funcionário que arrecadou mais com mão de obra: " + nomeMaior 
				+ "\nNome do funcionário que arrecadou mais com mão de obra: " + nomeMenor );
		
	}
}
