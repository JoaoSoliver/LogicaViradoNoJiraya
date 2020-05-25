package academy.devdojo.listaexercicios.iniciacao;

/*
 * Desenvolva uma rotina que leia dois valores numéricos inteiros e apresente o resultado
 * das quatro operações aritméticas básicas (adicao, subtracao, multiplicacao e divisao).
 */

public class Exercicio14RealizaAs4OperacaoesMatematicas {

	public static void main(String[] args) {
		
		double valor1 = -15;
		double valor2 = 25.5;
	
		System.out.println("#######################");
		System.out.println("Valores inseridos");
		System.out.println("Valor 1 : " + valor1);
		System.out.println("Valor 2 : " + valor2);
		System.out.println("#######################");
		System.out.println("Soma : " + (valor1 + valor2));
		System.out.println("Subtração : " + (valor1 - valor2));
		System.out.println("Multiplicação : " + (valor1 * valor2));		
		System.out.println(valor2 != 0 ? "Divisão : " + Double.toString (valor1 / valor2) : "* O divisor precisa ser diferente de 0 *");
		System.out.println("#######################");	

	}

}
