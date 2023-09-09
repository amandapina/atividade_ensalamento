import java.util.ArrayList;

public class Curso {
    private String nome;

    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    //criando um array para armazenar as disciplinas de um curso
    public Curso(String nome){
        this.nome = nome;
    }

  public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
  }

}
