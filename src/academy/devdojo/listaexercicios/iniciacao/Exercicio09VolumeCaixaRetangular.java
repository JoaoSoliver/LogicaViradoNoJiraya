package academy.devdojo.listaexercicios.iniciacao;

import java.util.Scanner;

/*
 * Desenvolver um programa que apresente e calcule o volume de uma caixa retangular.
 * utilize a fórmula abaixo:
 * V = C · L · A
 * Onde:
 * V = Volume em cm3
 * C = Comprimento
 * L = Largura
 * A = Altura  
 */

public class Exercicio09VolumeCaixaRetangular {

	public static void main(String[] args) {

		double volumeCaixa;
		double comprimentoCaixa;
		double larguraCaixa;
		double alturaCaixa;
		
		System.out.println("##############################");
		System.out.println("  VOLUME DA CAIXA RETANGULAR");
		System.out.println("##############################");

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as dimensões da caixa");
		System.out.println("Comprimento ");
		comprimentoCaixa = sc.nextDouble();
		System.out.println("Largura ");
		larguraCaixa = sc.nextDouble();
		System.out.println("Altura ");
		alturaCaixa = sc.nextDouble();

		volumeCaixa = comprimentoCaixa * larguraCaixa * alturaCaixa;

		System.out.println("Volume " + volumeCaixa + " cm³");
		
		System.out.println("##############################");

	}

}
