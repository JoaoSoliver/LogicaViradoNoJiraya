package academy.devdojo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/*
 * Classe pra testar e aprender um pouco a respeito de como tratar valores monetários no java de forma correta.
 * No GUJ encontrei um post com um exemplo do uso desse método.
 * https://www.guj.com.br/t/como-tratar-valores-monetarios-em-java-resolvido/336541/4
 */

public class TestandoBigDecimalComReplaceAll {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		BigDecimal valor1 = new BigDecimal("10");
		BigDecimal valor2 = new BigDecimal("3");		
		
//		BigDecimal valorUm = new BigDecimal(valor1.replaceAll("\\.", "").replace(",", "."));
		
//		System.out.println(valor1.divide(valor2));
		System.out.println(valor1.divide(valor2, new MathContext(3, RoundingMode.HALF_UP)));
		

	}

}
