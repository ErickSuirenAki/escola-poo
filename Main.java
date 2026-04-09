package escola_aulaOnline;

public class Main {
    public static void main(String[] args) {

        Escola UNIR = new Escola();

        Aluno a1 = new Aluno("Erick", "2025101");
        Aluno a2 = new Aluno("Camila", "2025102");
        Aluno a3 = new Aluno("Lara", "2025103");
        Aluno a4 = new Aluno("Gabriel", "2025104");
        Aluno a5 = new Aluno("Anna Julia", "2025105");
        Aluno a6 = new Aluno("Raul", "2025106");

        UNIR.matricularAluno(a1);
        UNIR.matricularAluno(a2);
        UNIR.matricularAluno(a3);
        UNIR.matricularAluno(a4);
        UNIR.matricularAluno(a5);
        UNIR.matricularAluno(a6);

        Professor prof1 = new Professor("Lucas Marques");
        Professor prof2 = new Professor("Carolina Watanabe");
        Professor prof3 = new Professor("Liliane Jacon");
        Professor prof4 = new Professor("Thiago Amaral");

        Disciplina d1 = new Disciplina("Programação orientada a objetos", 101, prof1);
        Disciplina d2 = new Disciplina("Estrutura de Dados", 102, prof2);
        Disciplina d3 = new Disciplina("Programação II", 103, prof3);
        Disciplina d4 = new Disciplina("Programação I", 104, prof4);

        prof1.adicionarDisciplina(d1);
        prof2.adicionarDisciplina(d2);
        prof3.adicionarDisciplina(d3);
        prof4.adicionarDisciplina(d4);

        a1.realizarMatricula(d1);
        a1.realizarMatricula(d2);
        a1.realizarMatricula(d3);
        a1.realizarMatricula(d4);

        a2.realizarMatricula(d1);
        a2.realizarMatricula(d2);
        a2.realizarMatricula(d3);
        a2.realizarMatricula(d4);

        a3.realizarMatricula(d1);
        a4.realizarMatricula(d2);
        a5.realizarMatricula(d3);
        a6.realizarMatricula(d4);

        prof1.adicionarNota(a1, 8.0, 7.5, 101);
        prof2.adicionarNota(a1, 9.0, 8.5, 102);
        prof3.adicionarNota(a1, 7.5, 8.0, 103);
        prof4.adicionarNota(a1, 6.0, 7.0, 104);

        prof1.adicionarNota(a2, 7.0, 6.5, 101);
        prof2.adicionarNota(a2, 8.0, 7.5, 102);
        prof3.adicionarNota(a2, 9.0, 9.5, 103);
        prof4.adicionarNota(a2, 7.0, 8.0, 104);

        prof1.adicionarNota(a3, 8.0, 7.5, 101);
        prof2.adicionarNota(a4, 9.0, 8.5, 102);
        prof3.adicionarNota(a5, 7.0, 6.5, 103);
        prof4.adicionarNota(a6, 8.0, 7.5, 104);

        System.out.println("\n=== HISTÓRICO DOS ALUNOS ===");
        a1.visualizarHistorico();
        a2.visualizarHistorico();

        System.out.println("\n=== NOTAS POR DISCIPLINA ===");
        prof1.visualizarNotasAlunos();
        prof2.visualizarNotasAlunos();
        prof3.visualizarNotasAlunos();
        prof4.visualizarNotasAlunos();

        System.out.println("\n=== NOTA DE UM ALUNO EM UMA DISCIPLINA ===");
        prof1.visualizarAluno("Programação orientada a objetos", a1);
    }
}