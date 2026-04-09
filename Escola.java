package escola_aulaOnline;

import java.util.HashMap;

public class Escola {
    HashMap<String, Aluno> alunos;
    //String é a matricula(chave) e aluno é o objeto aluno (valor)

    public Escola() {
        this.alunos = new HashMap<>();
        //inicia o mapa de alunos
    }

    public void matricularAluno(Aluno aluno) {
        String matricula = aluno.getMatricula();
        //aqui eu recebo a matricula aluno pelo metodo getMatricula da classe Aluno

        if (!alunos.containsKey(matricula)) {
        	//se não existe outro aluno com essa matricula
            alunos.put(matricula, aluno);
            //eu matriculo esse aluno e ele vai pro mapa de alunos
        } else {
            System.out.println("Ja existe esse numero de matricula");
            //se esse numero de matricula ja existe eu nao matriculo
        }
    }
}	