package academy.devdojo.listaexercicios.iniciacao;

/*
 * A) Em um circuito elétrico temos as seguintes informações:
 * 275 V e 10 A - Calcule a resistência elétrica, utilizando a fórmula abaixo:
 * R = I / U, onde:
 * 
 * R = Resistência em Ohms
 * U = Tensão em Volts
 * I = Corrente em Amperes
 */

public class Exercicio19ACalculaResistenciaEletrica {
	
	private double correnteAmperes;
	private double tensaoVolts;
	private double resistenciaOhms;
	
	public Exercicio19ACalculaResistenciaEletrica() {
		
	}
	
	public double calcularResistenciaEletrica(double correnteAmperes, double tensaoVolts) {
		this.correnteAmperes = correnteAmperes;
		this.tensaoVolts = tensaoVolts;
		this.resistenciaOhms = correnteAmperes / tensaoVolts;
		return resistenciaOhms;
	}
	
	public double getCorrenteAmperes() {
		return correnteAmperes;
	}
	public void setCorrenteAmperes(int correnteAmperes) {
		this.correnteAmperes = correnteAmperes;
	}
	public double getTensaVolts() {
		return tensaoVolts;
	}
	public void setTensaVolts(int tensaVolts) {
		this.tensaoVolts = tensaVolts;
	}
	public double getResistenciaOhms() {
		return resistenciaOhms;
	}
	public void setResistenciaOhms(int resistenciaOhms) {
		this.resistenciaOhms = resistenciaOhms;
	}
}
