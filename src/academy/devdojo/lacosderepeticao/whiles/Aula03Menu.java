package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/* Como usuário gostaria de ter um menu visual que seja navegável através de números.
 * O menu deve ser exibido da seguinte forma:
 * 1. Calcular imposto
 * 2. Depositar salário
 * 3. Sair
 * O menu deverá ficar disponível enquanto o número 3 não for digitado.
 * Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
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
			System.out.println("1.Calcular imposto\n2.Depositar salário\n3.Sair\n");
			opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Calculando impostos...\n");
				System.out.println("Digite o salário ");
				salario = sc.nextDouble();				
				System.out.println("Percentual de impostos: ");
				imposto = sc.nextDouble();				
				System.out.println(imposto + "% de " + salario + " = " + salario * (imposto / 100));
				salarioDeposito = salario - (salario * (imposto / 100));
				System.out.println("Valor final = " + salarioDeposito);				
//				salarioDeposito = salario - (salario * (imposto / 100));
			} else if(opcao == 2) {
				System.out.println("Valor para depósito: ");
				salarioDeposito = sc.nextDouble();
				System.out.println("Depositando o salário...\n");
				System.out.println("Saldo atual " + salarioDeposito);
				
			}			
		}
		
		System.out.println("Encerrando...");

	}

}
