package iniciacao.exercicios;

import java.util.Scanner;

/*
 * Crie uma classe que calcule uma determinada porcentagem de um dado salário;
 * 
 */
public class CalculaPorcetagemSalario {
	
	public static void main(String[] args) {
		double salario, porcentagem, valorDaPorcentagem;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salário recebido: ");
		salario = sc.nextDouble();
		
		System.out.println("Porcentagem que quero saber o valor:");
		porcentagem = sc.nextDouble();
		
		valorDaPorcentagem = salario * (porcentagem / 100);
		
		System.out.println("Salário do sujeito: " + salario);
		System.out.println("Porcentagem que quero saber valor: " + porcentagem + "%");
		System.out.println("Resultado: " + valorDaPorcentagem);

		
	}

}
