package academy.devdojo.listaexercicios.iniciacao;

/*
 * Em um circuito elétrico temos as seguintes informações:
 * 12 V e 175 Ω, calcule a corrente elétrica, utilizando a fórmula abaixo:
 * I = U / R, onde:
 * I = Corrente em Amperes
 * U = Tensão em Volts
 * R = Resistência em Ohms
 */

public class Exercicio19CCalculaCorrenteEletrica {
	
	private double correteAmperes;
	private double tensaoVolts;
	private double resistenciaOhms;	
	
	public double calcularCorrenteEletrica(double tensaoVolts, double resistenciaOhms) {
		this.tensaoVolts = tensaoVolts;
		this.resistenciaOhms = resistenciaOhms;
		this.correteAmperes = this.tensaoVolts / this.resistenciaOhms;
		return this.correteAmperes;
	}
	
	public double getCorreteAmperes() {
		return correteAmperes;
	}
	public void setCorreteAmperes(double correteAmperes) {
		this.correteAmperes = correteAmperes;
	}
	public double getTensaoVolts() {
		return tensaoVolts;
	}
	public void setTensaoVolts(double tensaoVolts) {
		this.tensaoVolts = tensaoVolts;
	}
	public double getResistenciaOhms() {
		return resistenciaOhms;
	}
	public void setResistenciaOhms(double resistenciaOhms) {
		this.resistenciaOhms = resistenciaOhms;
	}

}
