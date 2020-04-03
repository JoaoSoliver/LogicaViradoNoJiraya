package iniciacao.exercicios;

/* 
 * Dado um determinado sal�rio,
 * sendo maior que R$ 4500, imprima 30% do valor.
 * Sen�o  imprima 15%.
 * Tamb�m imprima se o sal�rio � um valor �mpar ou par.
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
			imparPar = "�mpar.";
		}
		
		System.out.println(percentual + salario + " � " + resultado + "\n" + salario +" � um valor " + imparPar);

	}

}
