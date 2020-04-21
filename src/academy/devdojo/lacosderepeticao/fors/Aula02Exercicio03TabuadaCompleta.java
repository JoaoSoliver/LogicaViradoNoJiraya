package academy.devdojo.lacosderepeticao.fors;

/*
 * Eu como usuário gostaria de um sistema que exibisse a tabuada de 1 a 10
 */

public class Aula02Exercicio03TabuadaCompleta {

	public static void main(String[] args) {


		System.out.println("----------------");
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("TABUADA " + i);
//			System.out.println("Do " + i);
			System.out.println("----------------");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j );
			}
			System.out.println("----------------");
		}	

	}

}
