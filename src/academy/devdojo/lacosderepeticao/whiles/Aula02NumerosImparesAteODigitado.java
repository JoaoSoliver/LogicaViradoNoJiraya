package academy.devdojo.lacosderepeticao.whiles;
/* Eu como usu�rio gostaria de imprimir todos os n�meros �mpares 
 * at� o valor digitado pelo usu�rio;
 */

public class Aula02NumerosImparesAteODigitado {

	public static void main(String[] args) {
		
		int numeroDigitado = 10;
		int contador = 0;
		
		System.out.println("Valor de entrada: " + numeroDigitado);
		System.out.println("N�meros �mpares at� o valor de entrada: ");
		
		while (contador <= numeroDigitado) {			
			if(contador % 2 != 0 ) {
				System.out.print(contador + " ");				
			}
			contador++;
		}

	}

}
