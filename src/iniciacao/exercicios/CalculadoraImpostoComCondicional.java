package iniciacao.exercicios;

/* 
 * Dado um determinado salário,
 * sendo maior que R$ 4500, imprima 30% do valor.
 * Senão  imprima 15%.
 * Também imprima se o salário é um valor ímpar ou par.
 */

public class CalculadoraImpostoComCondicional {

	public static void main(String[] args) {

		double salario = 47;
		double resultado;
		String percentual;
		String imparPar;

		if (salario >= 4500) {
			resultado = (salario * 0.3); 
			percentual = "30% de ";			
		}  else {
			resultado = (salario * 0.15);
			percentual = "15% de ";
		}
		
		if ((salario % 2) == 0) {
			imparPar = "par.";
		} else {
			imparPar = "ímpar.";
		}
		
		System.out.println(percentual + salario + " é " + resultado + "\n" + salario +" é um valor " + imparPar);

	}

}
