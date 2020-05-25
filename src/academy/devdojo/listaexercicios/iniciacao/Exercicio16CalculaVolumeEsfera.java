package academy.devdojo.listaexercicios.iniciacao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Elabore uma rotina que apresente o valor do volume de uma esfera, utilize a fórmula abaixo:
 * V = (4 ÷ 3)π(R 3)
 * V = Volume
 * π = 3.141592654
 * R = Raio 
 */

public class Exercicio16CalculaVolumeEsfera {

	public static void main(String[] args) {
		
		double raio;
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcula Volume Esfera");
		
		System.out.println("Informe o raio ");
		raio = sc.nextDouble();
		
		System.out.println("Volume " + df.format(((4 / 3) * 3.141592654 * (raio * 3))));

	}

}
