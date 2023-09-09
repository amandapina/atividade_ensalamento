import java.util.ArrayList;

public class Turma {
    Professor professor;
    Disciplina disciplina;
    ArrayList<Aluno> alunos = new ArrayList<>();
    //criando um array para armazenar os alunos de cada curso

    public Turma(Professor professor, Disciplina disciplina){
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
}
