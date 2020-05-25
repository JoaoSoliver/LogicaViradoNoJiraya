package academy.devdojo.listaexercicios.iniciacao;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Elaborar um programa que realize a convers�o de US$ para R$ e o inverso tamb�m. 
 * O programa deve saber qual o valor da cota��o do d�lar e fazer a convers�o.
 */

public class Exercicio11E12ConverteDolarEmRealERealEmDolar {

	public static void main(String[] args) {

		boolean paraOuContinua = false;
		int opcao = 0;
		BigDecimal valorParaConverter;
		

		DecimalFormat df = new DecimalFormat("##,###.00");

		BigDecimal valorDolar = new BigDecimal("0");

		Scanner sc = new Scanner(System.in);

		System.out.println("  Conversor de  moedas");
		System.out.println("########################");


		System.out.println("COTA��O DO D�LAR");
		valorDolar = sc.nextBigDecimal();
		System.out.println("########################");
		
		do {

			System.out.println("VALOR A SER CONVERTIDO");
			valorParaConverter = new BigDecimal(sc.next());
			System.out.println("########################");
			
			System.out.println("1 - D�LAR EM REAL");
			System.out.println("2 - REAL EM D�LAR");
			System.out.println("0 - SAIR");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("D�lar para real");
				System.out.println("USD " + valorParaConverter + " =  R$ " + df.format( valorParaConverter.multiply(valorDolar)));
				System.out.println("########################");
				break;

			case 2:
				System.out.println("Real para d�lar");
				BigDecimal resultadoDivisao = new BigDecimal("0");
//				resultadoDivisao = valorParaConverter.divide(valorDolar , BigDecimal.ROUND_HALF_EVEN); // Talvez trocar para double !!!
				System.out.printf("R$ " + valorParaConverter + " =  USD " + df.format(valorParaConverter.divide(valorDolar , new MathContext(8 , RoundingMode.HALF_UP))));
				System.out.println("\n########################");
				break;			
			}

			System.out.println("Repetir a opera��o? ");
			System.out.println("Y - SIM \nN - N�O");

			String fazerOutraOperacao;
			fazerOutraOperacao = sc.next();
			
			if (fazerOutraOperacao.equalsIgnoreCase("Y")) {
				continue;
			} else if (fazerOutraOperacao.equalsIgnoreCase("N")){
				break;
			}

			if (fazerOutraOperacao.equalsIgnoreCase("Y")) {
				continue;
			} else if(fazerOutraOperacao.equalsIgnoreCase("N")) {
				break;
			}

		} while (opcao != 0);
		
		System.out.println("Aplica��o encerrada...");

	}

}
