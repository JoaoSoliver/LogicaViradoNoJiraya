package academy.devdojo.arrays.multidimensional;

public class Aula01IntroducaoMultidimensional {

	public static void main(String[] args) {
		
		int[][] arrayMult1 = new int[2][2];
		int[][] arrayMult2 = new int[2][3];
		
		arrayMult1[0][0] = 22;
		arrayMult1[0][1] = 11;
		arrayMult1[1][0] = 44;
		arrayMult1[1][1] = 55;
		
		System.out.println ("Array 1");
		for (int i = 0; i < arrayMult1.length; i++) {
			for (int j = 0; j < arrayMult1.length; j++) {
				System.out.println ("Posição " + i + " " + j + " : " + arrayMult1[i][j] + " ");
			}
		}
		
		System.out.println("");
		
		arrayMult2[0][0] = 23;
		arrayMult2[0][1] = 14;
		arrayMult2[0][2] = 54;
		arrayMult2[1][0] = 62;
		arrayMult2[1][1] = 81;
		arrayMult2[1][2] = 97;
		
		System.out.println ("Array 2");
		for (int i = 0; i < arrayMult2.length; i++) {
			for (int j = 0; j < arrayMult2[i].length; j++) {
				System.out.println ("Posição " + i + " " + j + " : " + arrayMult2[i][j] + " ");
			}
		}
	}

}
