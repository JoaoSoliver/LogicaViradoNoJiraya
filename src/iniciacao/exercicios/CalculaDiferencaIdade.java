package iniciacao.exercicios;
/*
 * Crie uma vari�vel para armazenar a 1� idade
 * Crie uma vari�vel para armazenar a 2� idade
 * Crie uma vari�vel para armazenar a diferen�a entre essas 2 idades
 * Imprima a diferen�a 
 * 
 */
public class CalculaDiferencaIdade {
	
	public static void main(String [] args) {
		
		int idade1, idade2, diferencaEntraAsIdades;
		
		idade1 = 10;
		idade2 = 38;
		diferencaEntraAsIdades = idade1 - idade2;
		
		System.out.println("Foram inseridas as seguintes idades:\n1� - " + idade1 +" anos\n2� - " + idade2 + " anos");
		System.out.println("A diferen�a entre elas � de " + (diferencaEntraAsIdades < 0 ? (diferencaEntraAsIdades * - 1) : diferencaEntraAsIdades ) + " anos");
		
	}

}
