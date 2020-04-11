package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/* Como usu�rio gostaria de ter um menu visual que seja naveg�vel atrav�s de n�meros.
 * O menu deve ser exibido da seguinte forma:
 * 1. Calcular imposto
 * 2. Depositar sal�rio
 * 3. Sair
 * O menu dever� ficar dispon�vel enquanto o n�mero 3 n�o for digitado.
 * Dessa forma o sistema ficar� em execu��o, evitando ter que ser reiniciado a cada opera��o.
 */

public class Aula03Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao = 0;		
		double salario;
		double salarioDeposito;
		double imposto;

//		System.out.println("Menu");

		while (opcao != 3) {
			System.out.println("1.Calcular imposto\n2.Depositar sal�rio\n3.Sair\n");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Calculando impostos...\n");
				System.out.println("Digite o sal�rio ");
				salario = sc.nextDouble();				
				System.out.println("Percentual de impostos: ");
				imposto = sc.nextDouble();				
				System.out.println(imposto + "% de " + salario + " = " + salario * (imposto / 100));
				salarioDeposito = salario - (salario * (imposto / 100));
				System.out.println("Valor final = " + salarioDeposito);				
//				salarioDeposito = salario - (salario * (imposto / 100));
			} else if(opcao == 2) {
				System.out.println("Valor para dep�sito: ");
				salarioDeposito = sc.nextDouble();
				System.out.println("Depositando o sal�rio...\n");
				System.out.println("Saldo atual " + salarioDeposito);
				
			}			
		}
		
		System.out.println("Encerrando...");

	}

}
