package academy.devdojo.listaexercicios.iniciacao;

/*
 * C�lculo da pot�ncia el�trica, desenvolva um rotina que
 * calcule a pot�ncia de um equipamento, utilizando os dados e a f�rmula a seguir:
 * 220 V e 25 A F�rmula:
 * P = U � I, onde:
 * P = Pot�ncia em Watts
 * U = Tens�o em Volts
 * I = Corrente em Amperes
 */

public class Exercicio19DCalculaPotenciaEletrica {
	
	private double potenciaWatts;
	private double tensaoVolts;
	private double correnteAmperes;
	
	public double calcularPotenciaEletrica(double tensaoVolts, double correnteAmperes) {
		this.tensaoVolts = tensaoVolts;
		this.correnteAmperes = correnteAmperes;
		this.potenciaWatts = this.tensaoVolts * this.correnteAmperes;
		return this.potenciaWatts;
	}
	
	public double getPotenciaWatts() {
		return potenciaWatts;
	}
	public void setPotenciaWatts(double potenciaWatts) {
		this.potenciaWatts = potenciaWatts;
	}
	public double getTensaoVolts() {
		return tensaoVolts;
	}
	public void setTensaoVolts(double tensaoVolts) {
		this.tensaoVolts = tensaoVolts;
	}
	public double getCorrenteAmperes() {
		return correnteAmperes;
	}
	public void setCorrenteAmperes(double correnteAmperes) {
		this.correnteAmperes = correnteAmperes;
	}
	
	

}
