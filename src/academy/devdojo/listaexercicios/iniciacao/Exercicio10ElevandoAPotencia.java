package academy.devdojo.listaexercicios.iniciacao;

/*
 * Fazer a leitura de um valor num�rico inteiro e apresentar o valor do n�mero elevado ao
 * quadrado, ao cubo e a 10, apresentar tamb�m a soma total dos tr�s resultados
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
		System.out.println("  ELEVANDO A POT�NCIAS");
		System.out.println("########################");
		elevadoQuadrado = Math.pow(valor, 2);
		elevadoCubo = Math.pow(valor, 3);
		elevadoDecima = (long) Math.pow(valor, 10);
		
		System.out.println(valor + "� = " + elevadoQuadrado);
		System.out.println(valor + "� = " + elevadoCubo);
		System.out.println(valor + "�� = " + elevadoDecima);
		
		somados = (long) ( elevadoQuadrado + elevadoCubo + elevadoDecima);
		
		System.out.println("Soma das 3 pot�ncias:\n" + somados);
		System.out.println("######################");		

	}

}
