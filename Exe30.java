package exercicio_aula3;

import javax.swing.JOptionPane;

public class Exe30 {

	/*
	 * Ao prestar um servi�o em uma oficina mec�nica, um funcion�rio coloca v�rias
	 * pe�as em um carro e ao final informa o valor da m�o de obra. Sendo que na
	 * oficina h� N funcion�rios trabalhando e cada um presta X servi�os por dia, em
	 * cada servi�o prestado poder�o ser colocadas v�rias pe�as, e para cada pe�a
	 * deve-se informar a quantidade e o valor, mostre:
	 *  a) Total arrecadado pela empresa ao final do dia;
	 *  b) Total de cada funcion�rio; 
	 *  c) Total de cada servi�o;
	 *  d) Nome do funcion�rio que arrecadou mais com m�o de obra;
	 *  e) Nome do funcion�rio que arrecadou menos com m�o de obra.
	 */

	public static void main(String[] args) {
		int totValorGeral = 0;
		
		int totFuncionario = 0;
		int totValorFuncio = 0;
		String junto = "";
		
		int totServi�o = 0;
		int totValorServico = 0;
		String junto1 = "";
		
		int maiorValor = 0;
		String nomeMaior = "";
		int menorValor = 0;
		String nomeMenor = "";
		
		int qntFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Quantos funcion�rios existem? "));
		for (int i = 1; i <= qntFuncionarios; i++) {
			String nome = JOptionPane.showInputDialog("Qual o nome do " + i + " funcion�rio? ");
			int servicos = Integer.parseInt(JOptionPane.showInputDialog("Quantos servi�os " + nome + " faz? "));
			for (int j = 1; j <= servicos; j++) {
				int pecas = Integer.parseInt(JOptionPane.showInputDialog("Quantas pe�as " + nome + " coloca no "+ j + " servi�o? "));
				for (int p = 1; p <= pecas; p++) {
					int valor =  Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da " + p + "� pe�a do " + j + "� servi�o? "));
					totValorGeral += valor;
					totValorFuncio += valor;
					totValorServico += valor;
				}
				
				totServi�o = totValorServico;
				
				junto1 += "\nTotal do servi�o " + j + "do" + i + "� funcion�rio: " + totServi�o;
				
				totServi�o = 0;
				totValorServico = 0;
				
			}
			
			totFuncionario += totValorFuncio;
			
			junto += "\nTotal do funcion�rio " + i + ": " + totFuncionario;
			
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
				+ "\nNome do funcion�rio que arrecadou mais com m�o de obra: " + nomeMaior 
				+ "\nNome do funcion�rio que arrecadou mais com m�o de obra: " + nomeMenor );
		
	}
}
