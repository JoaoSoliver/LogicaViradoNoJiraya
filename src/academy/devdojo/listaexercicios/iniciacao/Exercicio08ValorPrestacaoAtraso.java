package academy.devdojo.listaexercicios.iniciacao;

import java.util.Scanner;

/*
 * Calcule e apresente o valor de uma presta��o em atraso, utilize a f�rmula abaixo:
 * P = VALOR + (VALOR � (TAXA � 100) � TEMPO)
 * Onde P � o valor da presta��o em atraso.
 */

public class Exercicio08ValorPrestacaoAtraso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double taxa = 1;
		double valorFinalPrestacao, prestacaoAtrasada;
		int diasAtraso;
		
		System.out.println("---------------------------");
		System.out.println("    PRESTA��O EM ATRASO");
		System.out.println("---------------------------");
		System.out.println("Calcular o valor a ser pago");
		System.out.println("---------------------------");
		
		System.out.println("Valor da presta��o" );
		prestacaoAtrasada = sc.nextDouble();
		
		System.out.println("Dias de atraso");
		diasAtraso = sc.nextInt();
		
		valorFinalPrestacao = (prestacaoAtrasada + (prestacaoAtrasada * diasAtraso * (taxa / 100))); 
		
		System.out.println("Valor a ser pago\n" + valorFinalPrestacao + " R$");
		
		System.out.println("---------------------------");

	}

}
