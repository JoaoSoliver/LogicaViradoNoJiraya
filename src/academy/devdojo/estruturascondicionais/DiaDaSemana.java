package academy.devdojo.estruturascondicionais;

// Receba um n�mero inteiro e imprima o dia da semana correspondente, sendo 1 segunda - feira.

public class DiaDaSemana {

	public static void main(String[] args) {

		int dia = 5;

		if (dia == 1) {
			System.out.println("� domingo");
		} else if (dia == 2) {
			System.out.println("� segunda-feira");
		} else if (dia == 3) {
			System.out.println("� ter�a-feira");
		} else if (dia == 4) {
			System.out.println("� quarta-feira");
		} else if (dia == 5) {
			System.out.println("� quinta-feira");
		} else if (dia == 6) {
			System.out.println("� sexta-feira");
		} else if (dia == 7) {
			System.out.println("� s�bado");
		} else {
			System.out.println("Valor inv�lido");
		}

	}

}
