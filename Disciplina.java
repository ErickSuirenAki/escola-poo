package escola_aulaOnline;

import java.util.HashMap;

public class Disciplina {
	private String nome;
	private Professor professor;
	private int codigo;
	HashMap<Aluno, double[]> alunos;
	
	public Disciplina(String nome, int codigo, Professor professor) {
	    this.nome = nome;
	    this.codigo = codigo;
	    this.professor = professor;
	    this.alunos = new HashMap<>();
	}
	
	public double[] getNotas(Aluno aluno) {
	    return alunos.get(aluno);
	}
	
	public String getNome() {
	    return nome;
	}
	public int getCodigo() {
	    return codigo;
	}
	
	public HashMap<Aluno, double[]> getAlunos() {
	    return alunos;
	}
	
	public void adicionarNota(Aluno aluno, double nota1, double nota2) {
	    double[] notas = {nota1, nota2};
	    alunos.put(aluno, notas);
	}
	
	public void verNotas() {
		for(Aluno alu: alunos.keySet()) {
			System.out.println("Aluno:" + alu.getNome());
			double [] notas = alunos.get(alu);
			
			if(notas!= null) {
				System.out.println("Nota 1: " + notas[0]);
	            System.out.println("Nota 2: " + notas[1]);
				
			}
			else {
				System.out.println("Nao tem notas cadastradas");
			}
		}
	}
	
	
	public double calcularMedia(double nota1, double nota2) {
		return (nota1+nota2) / 2;
	}
	
	public void mostrarConceito(double media) {
		if(media>=9) {
			System.out.println("Conceito: A");
		}
		else if(media >=7) {
			System.out.println("Conceito: B");
			
		}
		else if(media>=5) {
			System.out.println("Conceito: C");
			
		}
		else {
			System.out.println("Conceito: D");
		}
		
		
	}
}


