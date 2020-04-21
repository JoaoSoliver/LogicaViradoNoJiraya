package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/* Apresentar ao usu�rio uma tela solicitando um login e depois a senha.
 * Usu�rio e senha corretos devem estar armazenados em constantes no seu programa. 
 * Se o usu�rio acertar o login e a senha a mensagem ACESSO CONCEDIDO dever� ser exibida, 
 * caso contr�rio exibir a mensagem ACESSO NEGADO e voltar a pedir o usu�rio e senha.
 * Essa condi��o deve se repetir at� que o usu�rio acerte a combina��o.
 */

public class Aula04ExercicioLoginMenosLinhas {

	public static void main(String[] args) {

		final String usuario = "AAA";
		final String senha = "123123";
		String usuarioEntrada;
		String senhaEntrada;

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("DIGITE O USU�RIO ");
			usuarioEntrada = sc.nextLine();
			System.out.println("DIGITE A SENHA ");
			senhaEntrada = sc.nextLine();

			if (usuarioEntrada.equalsIgnoreCase(usuario) && senhaEntrada.equalsIgnoreCase(senha)) {
				System.out.println("ACESSO CONCEDIDO\n");
				break;			
			} 
			System.out.println("Usu�rio/senha incorreto\n");			
		}
		System.out.println("Encerrando o sistema...");
		sc.close();
	}
}
