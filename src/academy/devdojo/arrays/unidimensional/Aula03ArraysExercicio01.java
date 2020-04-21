package academy.devdojo.arrays.unidimensional;

/*
 * Armazenar em dois vetores V1 e V2 9 valores numéricos inteiros e exibir o resultado da
 * multiplicação dos números do V1 com os correspondentes em V2
 * V1 {1 2 3 4 5 6 7 8 9}
 * V2 {2 3 4 5 6 7 8 9 0}
 */

public class Aula03ArraysExercicio01 {	

	public static void main(String[] args) {
		
		int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] v2 = {2, 3, 4, 5, 6, 7, 8, 9, 0};
		int[] vr = new int[v1.length] ;
		String praExibir = "";
				
		for (int i = 0; i < v1.length; i++) {
			vr[i] = v1[i] * v2[i];
			praExibir = praExibir + "Casa " + (i + 1) + " - " + v1[i] + " x " + v2[i]  + " = " + vr[i] +"\n";
		}
		
		System.out.println(praExibir);

	}

}
