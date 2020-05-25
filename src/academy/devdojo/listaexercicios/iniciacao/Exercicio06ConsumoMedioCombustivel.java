package academy.devdojo.listaexercicios.iniciacao;

/*
 * Efetue o c�lculo de quantos litros de combust�vel um autom�vel consome em uma viagem. 
 * Sabendo que o autom�vel tem uma autonomia de 12 Km por litro de combust�vel, 
 * desenvolva o c�lculo utilizando a f�rmula abaixo:
 * D = TV 
 * LU = D � 12
 * Onde:
 * D = Dist�ncia em Km
 * T = Tempo gasto na viagem
 * V = Velocidade
 */

public class Exercicio06ConsumoMedioCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double distanciaPercorrida;
		int velocidade = 110;
		int tempoGasto = 6;
		
		distanciaPercorrida = tempoGasto * velocidade;
		
		System.out.println("#########################\n  Consumo de uma viagem \n#########################");
		System.out.println("Percorridos: " + distanciaPercorrida + " Km");
		System.out.println("Consumindo: " + distanciaPercorrida / 12 + " litros");
		System.out.println("Tempo de viagem: " + tempoGasto + " h" );
		System.out.println("#########################");
		
		
		
		
		
		
		
		

	}

}
