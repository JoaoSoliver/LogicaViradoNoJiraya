package academy.devdojo.listaexercicios.iniciacao;

/*
 * Em um circuito elétrico temos as seguintes informações:
 * 275 Ω e 1 A, calcule a tensão elétrica, utilizando a fórmula abaixo:
 * U = R · I, onde:
 * U = Tensão em Volts
 * R = Resistência em Ohms
 * I = Corrente em Amperes
 */

public class Exercicio19BCalculaTensaoEletrica {
	
	private double resistenciaOhms;
	private double correnteAmperes;
	private double tensaoVolts;
	
	public  double calcularTensaoEletrica (double resistenciaOhms, double correnteAmperes) {
		this.resistenciaOhms = resistenciaOhms;
		this.correnteAmperes = correnteAmperes;
		this.tensaoVolts = this.resistenciaOhms * this.correnteAmperes;
		return tensaoVolts;
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
	public double getCorrenteAmperes() {
		return correnteAmperes;
	}
	public void setCorrenteAmperes(double correnteAmperes) {
		this.correnteAmperes = correnteAmperes;
	}

}
