package iniciacao.exercicios;

public class ImpostoDeRenda {
	public static void main(String[] args) {
		
		double salario = 1300;
		String valorDeclarar = "";
		
		if (salario <= 1903.98) {
			valorDeclarar = "0% ISENTO";			 
		} else if (salario <= 2826.65) {
			valorDeclarar = "7,5% = " + salario * 0.075;
		} else if(salario <= 3751.05) {
			valorDeclarar = "15% = " + salario * 0.15;			
		} else if(salario <= 4664.68) {
			valorDeclarar = "22,5% = " + salario * 0.225;
		} else {
			valorDeclarar = "27,5% = " + salario * 0.275;
		}		
		System.out.println(valorDeclarar);
		
	}
}
