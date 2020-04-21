package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {

	public static void main(String[] args) {

		double[] notas = new double[4];
		double media = 0;
		String notasExibir = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as notas do aluno ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + " - " );
			notas[i] = sc.nextDouble();
			media += notas[i];
			notasExibir = notasExibir + "Nota " + (i + 1) + " -> " + notas[i] + "\n" ;
		}

		System.out.println(notasExibir);
		System.out.println("Média das " + notas.length + " notas do aluno : " + media / notas.length);

		sc.close();
	}

}
