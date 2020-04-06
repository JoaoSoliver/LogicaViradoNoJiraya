package academy.devdojo.estruturascondicionais.switchcase;

/* Como gerente gostaria que meus usu�rios pudessem digitar o tipo de conta
 * e o sistema imprimir qual a porcentagem de juros que aquela conta ir� oferecer.
 * Com o intuito de agilizar o acesso as informa��es.
 * Os tipos de contas s�o:
 * CONTA_POUPAN�A 0.05%;
 * CONTA_CORRENTE 0.02%;
 * CONTA_INVESTIMENTO 0.1%; 
 */

public class Aula02TipoDeConta {

	public static void main(String[] args) {

		int tipoConta = 3;

		switch (tipoConta) {
		case 1:
			System.out.println("A conta poupan�a te oferece uma taxa de juros de 5% ao m�s");			
			break;
		case 2:
			System.out.println("A conta corrente te oferece uma taxa de juros de 2% ao m�s");			
			break;
		case 3:
			System.out.println("A conta investimento te oferece uma taxa de juros de 10% ao m�s");			
			break;
		default:
			System.out.println("Valor inv�lido");
			break;
		}

	}

}
