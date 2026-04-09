package escola_aulaOnline;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String matricula;
	ArrayList<Disciplina> disciplinas;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplinas = new ArrayList<>();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	public void realizarMatricula(Disciplina disciplina) {
		if(this.disciplinas.size()<6) {
			disciplinas.add(disciplina);
			
		}
		else {
			System.out.println("Aluno ja está matriculado em 6 disciplinas.");
		}
	}
	
	public void visualizarHistorico() {
		System.out.println("Aluno: "+this.nome);
		
		for(Disciplina disc: this.disciplinas) {
			//para cada disciplina do aluno
			System.out.println("Disciplina:" + disc.getNome());
			//printe o nome da disciplina
			double [] notas = disc.getNotas(this);
			//pegue as notas desse aluno aqui e guarde nessa lista de notas
			
			if(notas!= null) {
				//se a lista nao estiver nula, printe elas
				System.out.println("Nota 1:" + notas[0]);
				System.out.println("Nota 2:" + notas[1]);
				
			}
			else {
				System.out.println("Nao tem notas cadastradas");
			}
		}
		
		
	}
	
	public void visualizarNotaDisciplina(String nome) {
		System.out.println("Aluno: "+this.nome);
		
		for(Disciplina disc: this.disciplinas) {
			if(disc.getNome().equals(nome)) {
				System.out.println("\nDisciplina:" + disc.getNome());
				double [] notas = disc.getNotas(this);
				
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
	
	public void visualizarNotaDisciplinaCodigo(int codigo) {
		System.out.println("Aluno: "+this.nome);
		
		for(Disciplina disc: this.disciplinas) {
			if(disc.getCodigo()==codigo) {
				System.out.println("\nDisciplina:" + disc.getNome());
				double [] notas = disc.getNotas(this);
				
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
		
		
	}
	
	
	

}
