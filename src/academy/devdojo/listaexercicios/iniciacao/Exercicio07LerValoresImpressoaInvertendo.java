package academy.devdojo.listaexercicios.iniciacao;

import java.util.Scanner;

/*
 * Ler valores para as vari�veis x e y, trocar os valores das vari�veis 
 * e apresentar o resultado dos valores invertidos.
 */

public class Exercicio07LerValoresImpressoaInvertendo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valorX, valorY, auxiliar;
		
		System.out.println("Valor X: ");
		valorX = sc.nextDouble(); 		
		
		System.out.println("Valor Y: ");
		valorY = sc.nextDouble();
		
		System.out.println("Entrou: X = " + valorX + " | Y = " + valorY);
		
		auxiliar = valorX;
		valorX = valorY;
		valorY = auxiliar;
		
		System.out.println("Saindo: X = " + valorX + " | Y = " + valorY);		

	}

}
