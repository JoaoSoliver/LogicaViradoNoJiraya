package academy.devdojo.listaexercicios.iniciacao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Construa um programa que calcule a velocidade em metros por segundo de um proj�til
 * que percorre uma dist�ncia em quil�metros a um espa�o de tempo em minutos, utilize a f�rmula abaixo:
 * V = (D � 1000) � (T � 60), onde: 
 * V = Velocidade em m/s
 * D = Dist�ncia 
 * T = Tempo
 */

public class Exercicio15CalculaVelocidadeMetrosPorSegundo {

	public static void main(String[] args) {
		
		double distanciaKm;
		double tempoMinuto;
		double velocidadeMetrosSegundos;
		
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("##0.00");
		
		System.out.println("Dist�ncia percorrida m/s");
		System.out.println("------------------------");
		System.out.println("Dist�ncia (kil�metro) ");
		distanciaKm = sc.nextDouble();
		System.out.println("Tempo gasto (minuto): ");
		tempoMinuto = sc.nextDouble(); 
		
		velocidadeMetrosSegundos = ((distanciaKm * 1000) / (tempoMinuto * 60));
		
		System.out.println("Velocidade do proj�til " + df.format(velocidadeMetrosSegundos) + " m/s");
		
		

	}

}
