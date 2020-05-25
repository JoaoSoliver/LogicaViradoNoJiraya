package academy.devdojo.listaexercicios.iniciacao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Sabendo que 1 ft é igual a 0,3048 m ou 30,48 cm, desenvolva um programa que leia
 * uma medida em pés e calcule o equivalente em metros.
 */

public class Exercicio17ConvertePesEmMetros {

	public static void main(String[] args) {
		
		double medidaPes;
		
		DecimalFormat df = new  DecimalFormat("###,###.000");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pés para Metros");
		System.out.println("Medida em pés(ft)");
		medidaPes = sc.nextDouble();
		
		System.out.println(medidaPes + " ft = " + df.format((medidaPes * 0.3048)) + " m");
		
		

	}

}
