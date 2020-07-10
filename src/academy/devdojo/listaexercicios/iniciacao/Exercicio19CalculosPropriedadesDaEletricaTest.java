package academy.devdojo.listaexercicios.iniciacao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19CalculosPropriedadesDaEletricaTest {

	public static void main(String[] args) {

		int opcao;		
		double correnteAmperes;
		double tensaoVolts;
		double resistenciaOhms;
		double potenciaEletrica;
		int encerrarPrograma = 1;

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("#,##0.00");

		do {
			System.out.println("------------------------------");
			System.out.println("Calcula Propriedades Elétricas\n");
			System.out.println("1 - RESISTÊNCIA ELÉTRICA");
			System.out.println("2 - TENSÃO ELÉTRICA");
			System.out.println("3 - CORRENTE ELÉTRICA");
			System.out.println("4 - POTÊNCIA ELÉTRICA");
			System.out.println("0 - ENCERRAR PROGRAMA");
			System.out.println("------------------------------");
			opcao = sc.nextInt();

			switch (opcao) {
			case 0:
				System.out.println("Encerrando aplicação...");
				return;
			case 1:
				System.out.println("------------------------------");
				System.out.println("RESISTÊNCIA ELÉTRICA");
				System.out.println("------------------------------");
				System.out.println("Insira a Corrente");
				correnteAmperes = sc.nextInt();
				System.out.println("Tensão");
				tensaoVolts = sc.nextInt();
				Exercicio19ACalculaResistenciaEletrica calculoResistenciaEletrica = new Exercicio19ACalculaResistenciaEletrica();
				resistenciaOhms = calculoResistenciaEletrica.calcularResistenciaEletrica(correnteAmperes, tensaoVolts);
				System.out.println(df.format(resistenciaOhms) + " Ohms\n" );				
				break;
			case 2:
				System.out.println("------------------------------");
				System.out.println("TENSÃO ELÉTRICA");
				System.out.println("------------------------------");
				System.out.println("Insira a Resistência");
				resistenciaOhms = sc.nextDouble();
				System.out.println("Insira a Corrente");
				correnteAmperes = sc.nextDouble();
				Exercicio19BCalculaTensaoEletrica calculaTensaoEletrica = new Exercicio19BCalculaTensaoEletrica();
				tensaoVolts = calculaTensaoEletrica.calcularTensaoEletrica(resistenciaOhms, correnteAmperes);
				System.out.println(df.format(tensaoVolts) + " Volts\n");
				break;				
			case 3:
				System.out.println("------------------------------");
				System.out.println("CORRENTE ELÉTRICA");
				System.out.println("------------------------------");
				System.out.println("Tensão");
				tensaoVolts = sc.nextInt();
				System.out.println("Insira a Resistência");
				resistenciaOhms = sc.nextDouble();
				Exercicio19CCalculaCorrenteEletrica calculaCorrenteEletrica = new Exercicio19CCalculaCorrenteEletrica();
				correnteAmperes = calculaCorrenteEletrica.calcularCorrenteEletrica(tensaoVolts, resistenciaOhms);
				System.out.println(df.format(correnteAmperes) + " Ampers\n");
				break;
			case 4://///////////////////
				System.out.println("------------------------------");
				System.out.println("POTÊNCIA ELÉTRICA");
				System.out.println("------------------------------");
				System.out.println("Insira a Tensão");
				tensaoVolts = sc.nextInt();
				System.out.println("Insira a Corrente");
				correnteAmperes = sc.nextDouble();
				Exercicio19DCalculaPotenciaEletrica calculaPotenciaEletrica = new Exercicio19DCalculaPotenciaEletrica();
				potenciaEletrica = calculaPotenciaEletrica.calcularPotenciaEletrica(tensaoVolts, correnteAmperes);
				System.out.println(df.format(potenciaEletrica) + " Watts");				
			default:
				System.out.println("Opção inválida");				
				break;
			}

		} while (encerrarPrograma != 0);

	}

}
