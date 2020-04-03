package listaExercicios.dois;

/* 
 * Desenvolva uma rotina que calcule o salário líquido de um funcionário. 
 * Após o cálculo o programa deve apresentar o salário base e o salário líquido calculado. 
 * SB = HT * V H
 * TD = (PD / 100) * SB
 * SL = SB − TD
 * Onde:
 * SB = Salário Base
 * HT = Horas Trabalhadas
 * VH = Valor Hora de trabalho
 * TD = Total de Descontos
 * PD = Percentual de Desconto
 * SL = Salário Líquido
 */

public class CalculoSalarioLiquido {

	public static void main(String[] args) {
		double salarioBase;
		double salarioLiquido;
		double valorHoraTrabalhada = 7.42;
		double totalDescontos;
		double percentualDescontos = 7.5;		
		int horasTrabalhadas = 44;
		
		salarioBase = horasTrabalhadas * valorHoraTrabalhada;
		totalDescontos = (percentualDescontos / 100) * salarioBase;
		salarioLiquido = salarioBase - totalDescontos;
		
		System.out.println("Salário base: " + salarioBase);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
	}

}
