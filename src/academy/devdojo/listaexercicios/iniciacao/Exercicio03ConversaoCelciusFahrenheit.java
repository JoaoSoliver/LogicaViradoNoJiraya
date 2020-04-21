package academy.devdojo.listaexercicios.iniciacao;

import java.util.Scanner;

/*
 * Escreva um programa que realize a conversão de graus Celsius (C) para graus
 * Fahrenheit (F). Utilize a fórmula abaixo:
 * F = ( 9 × C) ÷ 5
 */

public class Exercicio03ConversaoCelciusFahrenheit {

	public static void main(String[] args) {
		
		double grausCelcius;
		double grausFahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("Insira a temperatura (°C)");
		grausCelcius = sc.nextDouble();
		System.out.println("--------------------------");
		System.out.println(grausCelcius + " °C => " + (grausFahrenheit = (9 * grausCelcius) /5) + " °F");
		System.out.println("--------------------------");
	}

}
