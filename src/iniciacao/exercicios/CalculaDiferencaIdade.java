package iniciacao.exercicios;
/*
 * Crie uma variável para armazenar a 1° idade
 * Crie uma variável para armazenar a 2° idade
 * Crie uma variável para armazenar a diferença entre essas 2 idades
 * Imprima a diferença 
 * 
 */
public class CalculaDiferencaIdade {
	
	public static void main(String [] args) {
		
		int idade1, idade2, diferencaEntraAsIdades;
		
		idade1 = 10;
		idade2 = 38;
		diferencaEntraAsIdades = idade1 - idade2;
		
		System.out.println("Foram inseridas as seguintes idades:\n1ª - " + idade1 +" anos\n2ª - " + idade2 + " anos");
		System.out.println("A diferença entre elas é de " + (diferencaEntraAsIdades < 0 ? (diferencaEntraAsIdades * - 1) : diferencaEntraAsIdades ) + " anos");
		
	}

}
