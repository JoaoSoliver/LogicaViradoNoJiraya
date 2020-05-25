package academy.devdojo.listaexercicios.iniciacao;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Elaborar um programa que leia o salário base mensal (SB) de um funcionário, o percentual de reajuste (PR), 
 * e calcule e apresente o novo valor de salário do funcionário.
 * A fórmula abaixo é uma sugestão de como esse cálculo pode ser feito:
 * NS = SB + (SB * PR) ÷ 100, onde:
 * NS = Novo Salário 
 * SB = Salário Base 
 * PR = Percentual de Reajuste
 */

public class Exercicio13SalarioComReajuste {

	public static void main(String[] args) {
		
		BigDecimal percentualReajuste = new BigDecimal("0");
		BigDecimal salarioBase = new BigDecimal("0");
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Salário ");
		salarioBase = entrada.nextBigDecimal();
		
		System.out.println("Reajuste (%)");
		percentualReajuste = entrada.nextBigDecimal();
		
		System.out.println("R$ " + df.format(salarioBase.add(salarioBase.multiply(percentualReajuste.divide(new BigDecimal(100))))));
		
	}

}
