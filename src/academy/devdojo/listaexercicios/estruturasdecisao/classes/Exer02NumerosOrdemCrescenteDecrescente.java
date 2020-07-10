package academy.devdojo.listaexercicios.estruturasdecisao.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Exer02NumerosOrdemCrescenteDecrescente {

	public static void main(String[] args) {

		Integer [] numeros = new Integer[5];
		Random numerosGerados = new Random();
		
		System.out.print("Números gerados: ");
		for(int i = 0; i < numeros.length ; i++ ) {		
			numeros[i] = numerosGerados.nextInt(100);		
			System.out.print(numeros[i] + " ");
		}

		System.out.println("\n----------------------------");
		System.out.print("NA CRESCENTE:   ");
		Arrays.sort(numeros);
		for (int i : numeros) {
			System.out.print(i + "  ");
		}

		System.out.println("\n----------------------------");
		System.out.print("NA DECRESCENTE: ");
		Arrays.sort(numeros, Collections.reverseOrder());
		for (int i : numeros) {
			System.out.print(i + "  ");
		}

	}

}
