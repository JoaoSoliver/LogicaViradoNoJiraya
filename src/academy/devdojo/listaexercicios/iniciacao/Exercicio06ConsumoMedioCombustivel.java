package academy.devdojo.listaexercicios.iniciacao;

/*
 * Efetue o cálculo de quantos litros de combustível um automóvel consome em uma viagem. 
 * Sabendo que o automóvel tem uma autonomia de 12 Km por litro de combustível, 
 * desenvolva o cálculo utilizando a fórmula abaixo:
 * D = TV 
 * LU = D ÷ 12
 * Onde:
 * D = Distância em Km
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
