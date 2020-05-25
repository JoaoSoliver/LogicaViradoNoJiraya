package academy.devdojo.listaexercicios.iniciacao;

import java.util.Scanner;

/*
 * Escreva um programa que realize a conversão de graus Celsius (C) para graus
 * Fahrenheit (F). Utilize a fórmula abaixo:
 * F = ( 9 × (C + 32)) ÷ 5
 * (0 °C × 9/5) + 32 = 32 °F - fote: google 
 */

public class Exercicio03ConversaoCelciusFahrenheit {

	public static void main(String[] args) {
		
		double grausCelsius;
		double grausFahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("Insira a temperatura (°C)");
		grausCelsius = sc.nextDouble();
		System.out.println("--------------------------");
		System.out.println(grausCelsius + " °C => " + (grausFahrenheit = (grausCelsius * 9 / 5) + 32) + " °F");
		System.out.println("--------------------------");
	}

}
