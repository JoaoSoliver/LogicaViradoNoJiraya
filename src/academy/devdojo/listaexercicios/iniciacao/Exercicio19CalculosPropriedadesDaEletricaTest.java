package academy.devdojo.listaexercicios.iniciacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19CalculosPropriedadesDaEletricaTest {

	public static void main(String[] args) {
		
		int opcao = 1;		
		double correnteAmperes;
		double tensaoVolts;
		double resistenciaOhms;
		int encerrarPrograma = 1;
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		
		do {
			System.out.println("------------------------------");
			System.out.println("Calcula Propriedades Elétricas");
			System.out.println("------------------------------");
			System.out.println("1 - RESISTÊNCIA ELÉTRICA");
			System.out.println("0 - ENCERRAR PROGRAMA");
			System.out.println("------------------------------");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 0:
				System.out.println("Encerrando aplicação...");
				return;
			case 1:
				System.out.println("RESISTÊNCIA ELÉTRICA");
				System.out.println("Corrente");
				correnteAmperes = sc.nextInt();
				System.out.println("Tensão");
				tensaoVolts = sc.nextInt();
				Exercicio19ACalculaResistenciaEletrica calculoResistenciaEletrica = new Exercicio19ACalculaResistenciaEletrica();
				resistenciaOhms = calculoResistenciaEletrica.calcularResistenciaEletrica(correnteAmperes, tensaoVolts);
				System.out.println(df.format(resistenciaOhms) + " Ohms\n" );				
				break;

			default:
				System.out.println("No default");
				
				break;
			}
			
		} while (encerrarPrograma != 0);
		

	}

}
