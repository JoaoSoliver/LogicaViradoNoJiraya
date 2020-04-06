package academy.devdojo.estruturascondicionais.switchcase;
import java.util.Scanner;

/* Como gerente gostaria que meus usu�rios pudessem digitar o tipo de conta
 * e o sistema imprimir qual a porcentagem de juros que aquela conta ir� oferecer.
 * Com o intuito de agilizar o acesso as informa��es.
 * Os tipos de contas s�o:
 * CONTA_POUPAN�A 0.05%;
 * CONTA_CORRENTE 0.02%;
 * CONTA_INVESTIMENTO 0.1%; 
 */

public class Aula02TipoDeContaComScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String conta;

		System.out.println("Qual o seu tipo de conta?");
		conta = input.nextLine();

		switch (conta) {
		case  "CONTA POUPAN�A":
			System.out.println("A CONTA POUPAN�A te oferece uma taxa de juros de 5% ao m�s");
			break;
		case "CONTA CORRENTE":
			System.out.println("A CONTA CORRENTE te oferece uma taxa de juros de 2% ao m�s");
			break;
		case "CONTA INVESTIMENTO":
			System.out.println("A CONTA INVESTIMENTO te oferece uma taxa de juros de 10% ao m�s");
			break;		
		default:
			System.out.println("Conta inexistente");
			break;
		}
		input.close();
	}
}


