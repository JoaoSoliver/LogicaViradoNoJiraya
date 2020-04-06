package academy.devdojo.estruturascondicionais.ifelse;

/* Eu, como administrador do sistema, gostaria de permitir que os pr�prios usu�rios cadastrassem 
 * o nome de usu�rio (login) no sistema para agilizar o processo de migra��o do sistema antigo para o novo.
 * O usu�rio n�o pode deixar o login vazio "", ou criar um usu�rio com login "admin"
 * ou "administrador". Se o valor inserido for v�lido, o sistema dever� exibir uma mensagem
 * "<nome usu�rio> cadastrado com sucesso". Sen�o o sistema dever� mostrar o erro "Usu�rio inv�lido". 
 */

public class UsuarioCadastraLogin {

	public static void main(String[] args) {
		
		String nomeUsuario = "administrador";
		
		if (nomeUsuario.equals(null) || nomeUsuario.equals("") || nomeUsuario.equalsIgnoreCase("admin") 
				|| nomeUsuario.equalsIgnoreCase("administrador")) {
			System.out.println("Usu�rio inv�lido");
		} else {
			System.out.println("Usu�rio " + nomeUsuario + " cadastrado com sucesso");
		}

	}

}
