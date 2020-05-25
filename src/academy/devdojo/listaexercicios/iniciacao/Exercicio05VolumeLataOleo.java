package academy.devdojo.listaexercicios.iniciacao;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Escreva uma rotina capaz de calcular e apresentar o valor do volume 
 * de uma lata de óleo. utilize a fórmula abaixo: 
 * V = πR 2 × A
 * Onde:
 * V = Volume
 * π = 3.141592654
 * R = Raio da circunferência da lata
 * A = Altura da lata
 * OBS: O volume deve ser apresentado com a unidade de medida correto cm3.
 */

public class Exercicio05VolumeLataOleo {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##");
		df.setRoundingMode(RoundingMode.UP);
		
		Scanner sc = new Scanner(System.in);
		
		double alturaLata;
		double raioLata;
		double volumeLata;
		
		System.out.println("##############");
		System.out.println("VOLUME DA LATA");
		System.out.println("##############");
		
		System.out.println("Altura da lata: ");
		alturaLata = sc.nextDouble();
		System.out.println("Raio da lata: ");
		raioLata = sc.nextDouble();
		
		volumeLata = ((3.141592654 * raioLata * raioLata) * 2 * alturaLata); 
		
		System.out.println("Volume da lata " + volumeLata + " cm³");
		System.out.println("Volume da lata " + df.format(volumeLata) + " cm³");
		
		

	}

}
