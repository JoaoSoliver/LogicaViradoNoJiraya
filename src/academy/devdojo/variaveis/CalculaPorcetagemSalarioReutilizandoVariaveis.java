package academy.devdojo.variaveis;

/*
 * Crie uma vari�vel que ir� guardar o valor de um sal�rio
 * Calcule a porcentagem desse sal�rio:
 * 30%
 * 15%
 * 5%
 * A cada c�lculo guarde o resultado em uma vari�vel;
 * Imprima o resultado e reutilize a vari�vel pra armazenar o resultado do pr�ximo c�lculo; 
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
