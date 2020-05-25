package academy.devdojo.listaexercicios.iniciacao;

/*
 * Fazer a leitura de um valor numérico inteiro e apresentar o valor do número elevado ao
 * quadrado, ao cubo e a 10, apresentar também a soma total dos três resultados
 * anteriores.
 */

public class Exercicio10ElevandoAPotencia {

	public static void main(String[] args) {
		
		double valor = 10;
		long somados;
		double elevadoQuadrado;
		double elevadoCubo;
		long elevadoDecima;
		
		System.out.println("########################");
		System.out.println("  ELEVANDO A POTÊNCIAS");
		System.out.println("########################");
		elevadoQuadrado = Math.pow(valor, 2);
		elevadoCubo = Math.pow(valor, 3);
		elevadoDecima = (long) Math.pow(valor, 10);
		
		System.out.println(valor + "² = " + elevadoQuadrado);
		System.out.println(valor + "³ = " + elevadoCubo);
		System.out.println(valor + "¹° = " + elevadoDecima);
		
		somados = (long) ( elevadoQuadrado + elevadoCubo + elevadoDecima);
		
		System.out.println("Soma das 3 potências:\n" + somados);
		System.out.println("######################");		

	}

}
