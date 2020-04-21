package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/* Apresentar ao usuário uma tela solicitando um login e depois a senha.
 * Usuário e senha corretos devem estar armazenados em constantes no seu programa. 
 * Se o usuário acertar o login e a senha a mensagem ACESSO CONCEDIDO deverá ser exibida, 
 * caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir o usuário e senha.
 * Essa condição deve se repetir até que o usuário acerte a combinação.
 */

public class Aula04ExercicioLogin {	

	public static void main(String[] args) {

		final String usuario = "AAA";
		String usuarioEntrada;
		final String senha = "123123";
		String senhaEntrada;
		boolean acesso = false;

		Scanner sc = new Scanner(System.in);

		while(acesso == false) {
			System.out.println("DIGITE O USUÁRIO ");
			usuarioEntrada = sc.nextLine();
			System.out.println("DIGITE A SENHA ");
			senhaEntrada = sc.nextLine();

			if (usuarioEntrada.equalsIgnoreCase(usuario) && senhaEntrada.equalsIgnoreCase(senha)) {
				System.out.println("ACESSO CONCEDIDO");
				acesso = true;				
			} else {
				System.out.println("Usuário/senha incorreto\n");
			}
		}
		System.out.println("Dentro do sistema...");		
		sc.close();
	}
}
