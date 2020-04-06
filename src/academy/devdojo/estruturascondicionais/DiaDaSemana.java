package academy.devdojo.estruturascondicionais;

// Receba um número inteiro e imprima o dia da semana correspondente, sendo 1 segunda - feira.

public class DiaDaSemana {

	public static void main(String[] args) {

		int dia = 5;

		if (dia == 1) {
			System.out.println("É domingo");
		} else if (dia == 2) {
			System.out.println("É segunda-feira");
		} else if (dia == 3) {
			System.out.println("É terça-feira");
		} else if (dia == 4) {
			System.out.println("É quarta-feira");
		} else if (dia == 5) {
			System.out.println("É quinta-feira");
		} else if (dia == 6) {
			System.out.println("É sexta-feira");
		} else if (dia == 7) {
			System.out.println("É sábado");
		} else {
			System.out.println("Valor inválido");
		}

	}

}
