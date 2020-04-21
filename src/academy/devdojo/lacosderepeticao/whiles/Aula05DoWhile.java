package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {

	public static void main(String[] args) {

		boolean condicao = true;
		String simNao;
		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Jogador #1\nDigite um numero de 0 a 9");
			int num1 = scanner.nextInt();
			System.out.println("Jogador #2\nDigite um numero de 0 a 9");
			int num2 = scanner.nextInt();

			if (num1 == num2) {
				System.out.println("Números iguais -" + " #1 : " + num1 + " #2 : " + num2 );
			} else if (num1 > num2){
				System.out.println("#1 : " + num1 + " > " + " #2 : " + num2 );
			} else {
				System.out.println("#1 : " + num1 + " < " + " #2 : " + num2 );
			}

			System.out.println("Deseja continuar a brincadeira?");

			simNao = scanner.next();

			if (simNao.equalsIgnoreCase("N")) {
				condicao = false;
				System.out.println("Bye... bye...");
			} else {			
			System.out.println("Simmmmmm......\nVamos brincar novamente...\n");
			}
		} while (condicao);

	}

}
