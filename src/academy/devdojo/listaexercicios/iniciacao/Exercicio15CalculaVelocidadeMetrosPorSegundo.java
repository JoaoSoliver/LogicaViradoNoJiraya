package academy.devdojo.listaexercicios.iniciacao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Construa um programa que calcule a velocidade em metros por segundo de um projétil
 * que percorre uma distância em quilômetros a um espaço de tempo em minutos, utilize a fórmula abaixo:
 * V = (D · 1000) ÷ (T · 60), onde: 
 * V = Velocidade em m/s
 * D = Distância 
 * T = Tempo
 */

public class Exercicio15CalculaVelocidadeMetrosPorSegundo {

	public static void main(String[] args) {
		
		double distanciaKm;
		double tempoMinuto;
		double velocidadeMetrosSegundos;
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("##0.00");
		
		System.out.println("Distância percorrida m/s");
		System.out.println("------------------------");
		System.out.println("Distância (kilômetro) ");
		distanciaKm = sc.nextDouble();
		System.out.println("Tempo gasto (minuto): ");
		tempoMinuto = sc.nextDouble(); 
		
		velocidadeMetrosSegundos = ((distanciaKm * 1000) / (tempoMinuto * 60));
		
		System.out.println("Velocidade do projétil " + df.format(velocidadeMetrosSegundos) + " m/s");
		
		

	}

}
