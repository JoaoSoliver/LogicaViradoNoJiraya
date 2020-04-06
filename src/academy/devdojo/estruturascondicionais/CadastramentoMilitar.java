package academy.devdojo.estruturascondicionais;

/* Como secret�rio de alistamento militar gostaria que o sistema aceitasse os seguintes par�metros
 * para agilizar o processo de cadastramento:
 * Sexo, sendo v�lido apenas F ou M, e idade.
 * Se masculino com idade superior a 17, "Alistamento obrigat�rio";
 * Se masculino com idade inferior a 18, "Alistamento n�o permitido";
 * Se feminino com idade superior a 17, "Deseja se alistar?";
 * Se feminino com idade inferior a 18, "Alistamento n�o permitido". 
 */

public class CadastramentoMilitar {

	public static void main(String[] args) {
		
		int idade = 18;
		String sexo = "F";
		
		if (sexo.equalsIgnoreCase("M") && idade > 17) {
			System.out.println("Alistamento obrigat�rio");
		} else if(sexo.equalsIgnoreCase("F") && idade > 17) {
			System.out.println("Deseja se alistar?");
		} else {
			System.out.println("Alistamento n�o permitido.");
		}

	}

}
