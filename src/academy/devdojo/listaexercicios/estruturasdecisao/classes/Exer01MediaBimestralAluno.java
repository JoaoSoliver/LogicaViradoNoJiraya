package academy.devdojo.listaexercicios.estruturasdecisao.classes;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Desenvolva um rotina que leia as notas de quatro bimestres de um aluno (N1, N2, N3 e N4),
 * e informe o status do aluno baseado na tabela abaixo:
 * Se o total for menor que 15 REPROVADO
 * Se o total for entre 15 e 17 RECUPERAÇÃO
 * Se o total for maior do que 17 APROVADO
 */

public class Exer01MediaBimestralAluno {

	private String nome;
	private double[] notas = new double[4];
	private double media;
	private String situacao;
	private double notasObtidas = 0;

	public Exer01MediaBimestralAluno() {

	}

	public Exer01MediaBimestralAluno(String nome) {
		this.nome = nome;
	}	

	Scanner sc = new Scanner(System.in);

	@Override
	public String toString() {
		String exibir = " ";
		String notasRecebidas = "";
		if (this.notas != null) {
			for (double d : notas) {
				notasRecebidas += d + " ";
			}
//			exibir = "Notas do aluno " + nome + "\n" + Arrays.toString(notas) + "\nMédia " + this.media + " - " + situacao;	~çççççççççççççççççççç
			exibir = "Notas do aluno " + nome + "\n" + notasRecebidas + "\nMédia " + this.media + " - " + situacao;
		} 		
		return exibir;
	}

	public void cadastrarNotas() {		
		for (int i = 0; i < notas.length; i++) {
			System.out.println((i + 1) + "º nota: ");
			this.notas[i] = sc.nextDouble();
		}
	}

	public void calcularMedia() {			
		for (double d : this.notas) {
			notasObtidas += d;
		}		
		media = notasObtidas / notas.length;

		if(media < 15) {
			situacao = "REPROVADO";
		} else if(media < 19) {
			situacao = "EM RECUPERAÇÃO";
		} else {
			situacao = "APROVADO";
		}		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
