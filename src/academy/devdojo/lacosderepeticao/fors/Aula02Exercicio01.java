
package academy.devdojo.lacosderepeticao.fors;

/*
 * Elaborar um programa que apresente os quadrados dos n�meros inteiros existentes na faixa de valores de 15 at� 200.
 */

public class Aula02Exercicio01 {

	public static void main(String[] args) {
		for (int i = 15; i < 201; i++) {
			String iString = "" + i;
			System.out.println(iString + " x "  + iString + " = " + (i * i));
		}
	}
}
