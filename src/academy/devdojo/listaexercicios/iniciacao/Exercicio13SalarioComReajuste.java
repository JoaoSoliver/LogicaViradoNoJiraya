package academy.devdojo.listaexercicios.iniciacao;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Elaborar um programa que leia o sal�rio base mensal (SB) de um funcion�rio, o percentual de reajuste (PR), 
 * e calcule e apresente o novo valor de sal�rio do funcion�rio.
 * A f�rmula abaixo � uma sugest�o de como esse c�lculo pode ser feito:
 * NS = SB + (SB * PR) � 100, onde:
 * NS = Novo Sal�rio 
 * SB = Sal�rio Base 
 * PR = Percentual de Reajuste
 */

public class Exercicio13SalarioComReajuste {

	public static void main(String[] args) {
		
		BigDecimal percentualReajuste = new BigDecimal("0");
		BigDecimal salarioBase = new BigDecimal("0");
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Sal�rio ");
		salarioBase = entrada.nextBigDecimal();
		
		System.out.println("Reajuste (%)");
		percentualReajuste = entrada.nextBigDecimal();
		
		System.out.println("R$ " + df.format(salarioBase.add(salarioBase.multiply(percentualReajuste.divide(new BigDecimal(100))))));
		
	}

}
