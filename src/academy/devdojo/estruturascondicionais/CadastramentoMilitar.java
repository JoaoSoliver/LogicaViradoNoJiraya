package academy.devdojo.estruturascondicionais;

/* Como secretário de alistamento militar gostaria que o sistema aceitasse os seguintes parâmetros
 * para agilizar o processo de cadastramento:
 * Sexo, sendo válido apenas F ou M, e idade.
 * Se masculino com idade superior a 17, "Alistamento obrigatório";
 * Se masculino com idade inferior a 18, "Alistamento não permitido";
 * Se feminino com idade superior a 17, "Deseja se alistar?";
 * Se feminino com idade inferior a 18, "Alistamento não permitido". 
 */

public class CadastramentoMilitar {

	public static void main(String[] args) {
		
		int idade = 18;
		String sexo = "F";
		
		if (sexo.equalsIgnoreCase("M") && idade > 17) {
			System.out.println("Alistamento obrigatório");
		} else if(sexo.equalsIgnoreCase("F") && idade > 17) {
			System.out.println("Deseja se alistar?");
		} else {
			System.out.println("Alistamento não permitido.");
		}

	}

}
