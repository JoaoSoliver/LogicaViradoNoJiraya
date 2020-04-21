package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhilev2 {

	public static void main(String[] args) {

		int desejaContinuar = 1;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Jogador #1");
			int jogador1 = sc.nextInt();
			System.out.println("Jogador #2");
			int jogador2 = sc.nextInt();

			System.out.println("Acertou " + (jogador1 == jogador2));

			System.out.println("----------------------");

			System.out.println("Jogar novamente - 1");
			System.out.println("Sair do jogo - 2");
			desejaContinuar = sc.nextInt();
		} while (desejaContinuar == 1);

		System.out.println("Bye... bye...");
		sc.close();

	}

}
