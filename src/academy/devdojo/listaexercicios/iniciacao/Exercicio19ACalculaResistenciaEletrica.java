package academy.devdojo.listaexercicios.iniciacao;

/*
 * A) Em um circuito el�trico temos as seguintes informa��es:
 * 275 V e 10 A - Calcule a resist�ncia el�trica, utilizando a f�rmula abaixo:
 * R = I / U, onde:
 * 
 * R = Resist�ncia em Ohms
 * U = Tens�o em Volts
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
