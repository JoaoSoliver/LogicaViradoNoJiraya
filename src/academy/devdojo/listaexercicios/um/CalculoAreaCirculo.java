package academy.devdojo.listaexercicios.um;

// escreva um programa que calcule e apresente a �rea de um c�rculo.

public class CalculoAreaCirculo {
	public static void main(String[] args) {
		
		double pi = 3.1415;
		double raio = 55;
		double area;
		
		area = pi * (raio * raio);
		
		System.out.println("A �rea de um c�rculo com " + raio + " de raio � " + area );

	}
}
