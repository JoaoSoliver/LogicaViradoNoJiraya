package academy.devdojo.lacosderepeticao.whiles;
/* Eu como usuário gostaria de imprimir todos os números ímpares 
 * até o valor digitado pelo usuário;
 */

public class Aula02NumerosImparesAteODigitado {

	public static void main(String[] args) {
		
		int numeroDigitado = 10;
		int contador = 0;
		
		System.out.println("Valor de entrada: " + numeroDigitado);
		System.out.println("Números ímpares até o valor de entrada: ");
		
		while (contador <= numeroDigitado) {			
			if(contador % 2 != 0 ) {
				System.out.print(contador + " ");				
			}
			contador++;
		}

	}

}
