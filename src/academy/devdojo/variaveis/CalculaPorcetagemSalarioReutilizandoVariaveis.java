package academy.devdojo.variaveis;

/*
 * Crie uma variável que irá guardar o valor de um salário
 * Calcule a porcentagem desse salário:
 * 30%
 * 15%
 * 5%
 * A cada cálculo guarde o resultado em uma variável;
 * Imprima o resultado e reutilize a variável pra armazenar o resultado do próximo cálculo; 
 */

public class CalculaPorcetagemSalarioReutilizandoVariaveis {
	
	public static void main(String[] args) {
		
		float salario = 2000F, resultado;
		
		resultado = salario *  0.3F;		
		System.out.println("30% de " + salario + " = " + resultado);
		
		resultado = salario *  0.15F;		
		System.out.println("15% de " + salario + " = " + resultado);
		
		resultado = salario *  0.05F;		
		System.out.println("5%  de " + salario + " = " + resultado);
		
		
		
	}

}
