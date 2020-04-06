package academy.devdojo.estruturascondicionais.switchcase;

/* Como gerente gostaria que meus usuários pudessem digitar o tipo de conta
 * e o sistema imprimir qual a porcentagem de juros que aquela conta irá oferecer.
 * Com o intuito de agilizar o acesso as informações.
 * Os tipos de contas são:
 * CONTA_POUPANÇA 0.05%;
 * CONTA_CORRENTE 0.02%;
 * CONTA_INVESTIMENTO 0.1%; 
 */

public class Aula02TipoDeConta {

	public static void main(String[] args) {

		int tipoConta = 3;

		switch (tipoConta) {
		case 1:
			System.out.println("A conta poupança te oferece uma taxa de juros de 5% ao mês");			
			break;
		case 2:
			System.out.println("A conta corrente te oferece uma taxa de juros de 2% ao mês");			
			break;
		case 3:
			System.out.println("A conta investimento te oferece uma taxa de juros de 10% ao mês");			
			break;
		default:
			System.out.println("Valor inválido");
			break;
		}

	}

}
