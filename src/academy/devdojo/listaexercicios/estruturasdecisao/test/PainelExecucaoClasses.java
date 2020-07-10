package academy.devdojo.listaexercicios.estruturasdecisao.test;

import java.util.Scanner;

import academy.devdojo.listaexercicios.estruturasdecisao.classes.Exer01MediaBimestralAluno;

public class PainelExecucaoClasses {


	public static void main(String[] args) {		

		//		String prosseguirSimNao;
		int menuAplicativos;
		String encerrarSimNão = "N";

		Scanner sc = new Scanner(System.in);

		System.out.println("Resolução exercícios\nESTRUTURAS DE DECISÃO");
		System.out.println("---------------------");

		do {			

			System.out.println("Opções ");
			System.out.println("0 - Encerrar o programa");
			System.out.println("1 - Calcular média de 4 notas");
			menuAplicativos = sc.nextInt();		

			switch (menuAplicativos) {
			
				case 0:
					encerrarSimNão = "S";
					break;
				
				case 1:
					System.out.println("########################################\nInsira o nome e as 4 notas do aluno\n");
					Exer01MediaBimestralAluno aluno1 = new Exer01MediaBimestralAluno();
	
					System.out.print ("Nome do aluno ");
					aluno1.setNome(sc.nextLine());
					break;

				default:
				//				System.out.println("\nDeseja continuar a aplicação? ");
				//				prosseguirSimNao = sc.nextLine();			
				//				
				//				System.out.println("Valor inserido " + prosseguirSimNao);
					break;
			}


		} while (encerrarSimNão.equalsIgnoreCase("N"));

		System.out.println("Encerrando a aplicação...");



		//		
		//		System.out.println("Insira as " + notas.length + " notas: ");
		//		for (int i = 0; i < notas.length; i++) {
		//			System.out.println("Nota " + (1+i));
		//			notas[i] = sc.nextDouble();
		//		}		
		////		aluno1.setNotas(notas);	
		//		
		//		
	}

}
