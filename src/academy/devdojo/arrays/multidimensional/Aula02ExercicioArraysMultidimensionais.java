package academy.devdojo.arrays.multidimensional;

/*
 * Calcule a multiplicacao dos elementos da diagonal principal de uma matrix quadrada 
 */

public class Aula02ExercicioArraysMultidimensionais {

	public static void main(String[] args) {
		
		int [][] matrix01 = new int[][] {{2,4,6,8},{3,5,7,9},{11,13,17,19},{16,25,36,49}};
		int resultadoMultiplicacao = 1;	
		String numeroMultiplicado = "";
		
		for (int i = 0; i < matrix01.length; i++) {
			for (int j = 0; j < matrix01[i].length; j++) {
				if (i == j) {	
					numeroMultiplicado += matrix01[i][j] + " ";
					
					resultadoMultiplicacao *= matrix01[i][j]; 
				}
//				System.out.println ("Posição " + i + " " + j + " : " + matrix01[i][j] + " ");
			}
		}
		System.out.print(numeroMultiplicado + " = " + resultadoMultiplicacao);
	}
}
