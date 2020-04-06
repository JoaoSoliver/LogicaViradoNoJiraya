package academy.devdojo.estruturascondicionais.ifelse;

/* Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem 
 * o nome de usuário (login) no sistema para agilizar o processo de migração do sistema antigo para o novo.
 * O usuário não pode deixar o login vazio "", ou criar um usuário com login "admin"
 * ou "administrador". Se o valor inserido for válido, o sistema deverá exibir uma mensagem
 * "<nome usuário> cadastrado com sucesso". Senão o sistema deverá mostrar o erro "Usuário inválido". 
 */

public class UsuarioCadastraLogin {

	public static void main(String[] args) {
		
		String nomeUsuario = "administrador";
		
		if (nomeUsuario.equals(null) || nomeUsuario.equals("") || nomeUsuario.equalsIgnoreCase("admin") 
				|| nomeUsuario.equalsIgnoreCase("administrador")) {
			System.out.println("Usuário inválido");
		} else {
			System.out.println("Usuário " + nomeUsuario + " cadastrado com sucesso");
		}

	}

}
