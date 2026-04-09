package escola_aulaOnline;

import java.util.ArrayList;

public class Professor {
	String nome;
	ArrayList<Disciplina> disciplinas;
	
	
	public Professor(String nome) {
		super();
		this.nome = nome;
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
		
	}
	
	public void visualizarNotasAlunos() {
		
		for(Disciplina disc: this.disciplinas) {
			System.out.println("Disciplina: " + disc.getNome());
			for (Aluno alu : disc.getAlunos().keySet()) {
				System.out.println("Aluno: " + alu.getNome());
				double [] notas = disc.getNotas(alu);
				
				if(notas!= null) {
					System.out.println("Nota 1:" + notas[0]);
					System.out.println("Nota 2:" + notas[1]);
					
					
				}
				else {
					System.out.println("Nao tem notas cadastradas");

				}
			}
			
		}
		
	}
	
	public void visualizarAluno(String nome, Aluno aluno) {
		System.out.println("Aluno: "+ aluno.getNome());
		
		for(Disciplina disc: this.disciplinas) {
			if(disc.getNome().equals(nome)) {
				System.out.println("Disciplina: " + disc.getNome());
				double [] notas = disc.getNotas(aluno);
				
				if(notas!= null) {
					System.out.println("Nota 1:" + notas[0]);
					System.out.println("Nota 2:" + notas[1]);
					return;
					
				}
				else {
					System.out.println("Nao tem notas cadastradas");
					return;
				}	
					
				}
			}
		System.out.println("Disciplina não encontrada"); 
			
			
		}
	
	
	public void adicionarNota(Aluno aluno, double nota1, double nota2,int cod) {
		System.out.println("Aluno: "+ aluno.getNome());
		
		for(Disciplina disc: this.disciplinas) {
			if(disc.getCodigo()==cod) {
				System.out.println("\nDisciplina:" + disc.getNome());
				disc.adicionarNota(aluno, nota1, nota2);
				return;
			}
			
				
			
		
		}	System.out.println("Disciplina não encontrada");
		
	}

	
	
}
	
	
	
	

