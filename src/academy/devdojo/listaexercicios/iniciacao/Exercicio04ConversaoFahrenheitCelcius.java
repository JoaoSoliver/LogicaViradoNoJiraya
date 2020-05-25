package academy.devdojo.listaexercicios.iniciacao;

import java.util.Scanner;

/*
 * Escreva um programa que realize a conversão de graus Fahrenheit (F) para graus
 * Celsius (C). Utilize a fórmula abaixo:
 * C = (( F - 32) × 5) ÷ 9
 * (0 °F - 32) × 5/9 = -17,78 °C - fonte: google

 */

public class Exercicio04ConversaoFahrenheitCelcius {

	public static void main(String[] args) {
		
		double grausFahrenheit;
		double grausCelsius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------");		
		System.out.println("DIGITE A TEMPERATURA (°F)");
		grausFahrenheit = sc.nextDouble();
		System.out.println("--------------------------");
		System.out.println(grausFahrenheit + " °F => " + (grausCelsius = (grausFahrenheit - 32) * 5 / 9) + " °C");
		System.out.println("--------------------------");
	}

}
