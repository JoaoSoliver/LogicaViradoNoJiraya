package academy.devdojo.lacosderepeticao.fors;

/*
 * Elaborar um programa que calcule e apresente a tabuada de um número qualquer
 */

public class Aula02Exercicio02 {

	public static void main(String[] args) {

		int numero = 5;

		System.out.println("Tabuado do 5");
		for(int i = 1; i <=10; i++) {
			System.out.println(numero + " * " + i + " = " + (numero * i));
		}

	}

}
