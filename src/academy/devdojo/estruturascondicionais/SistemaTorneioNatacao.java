package academy.devdojo.estruturascondicionais;

import java.util.Scanner;

/* Eu como usu�rio gostaria de ter o nome e a idade dos
 * participantes do torneio de nata��o e que o sistema imprimisse
 * da seguinte forma: 
 * Menor que 10 anos : <Nome> participar� da categoria infantil;
 * Entre 11 e 15 anos: <Nome> participar� da categoria juvenil;
 * Entre 16 e 19 anos: <Nome> participar� da categoria pr�-adulto;
 * Acima de 20 anos: <Nome> participar� da categoria adulto;
 * Para que eu posso rapidamente classificar todos os participantes.
 */

public class SistemaTorneioNatacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = "Simonal"; 
		String categoria = "";
		int idade = 100;

		System.out.println("Nome do participante: ");
		nome = sc.next();
		System.out.println("Idade: ");
		idade = sc.nextInt();

		if (idade <= 10 ) {
			categoria = "menor que 10 anos participar� da categoria INFANTIL.";
		} else if (idade <= 15) {
			categoria = "entre 11 e 15 anos participar� da categoria JUVENIL.";
		} else if (idade <= 19) {
			categoria = "entre 16 e 19 anos participar� da categoria PR�-ADULTO.";
		} else {
			categoria = "acima de 20 anos participar� da categoria ADULTO.";
		}
		System.out.println("O(A) atleta " + nome + " com a idade " + categoria );

	}

}
