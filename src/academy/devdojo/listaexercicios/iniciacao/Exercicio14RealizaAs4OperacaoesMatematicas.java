package academy.devdojo.listaexercicios.iniciacao;

/*
 * Desenvolva uma rotina que leia dois valores num�ricos inteiros e apresente o resultado
 * das quatro opera��es aritm�ticas b�sicas (adicao, subtracao, multiplicacao e divisao).
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
		System.out.println("Subtra��o : " + (valor1 - valor2));
		System.out.println("Multiplica��o : " + (valor1 * valor2));		
		System.out.println(valor2 != 0 ? "Divis�o : " + Double.toString (valor1 / valor2) : "* O divisor precisa ser diferente de 0 *");
		System.out.println("#######################");	

	}

}
