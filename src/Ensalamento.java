public class Ensalamento {
    public static void ensalar() {

        //criando professores
        Professor[] professores = {
                new Professor("Mia", "POO"), //0
                new Professor("Saulo", "Estrutura de Dados"), //1
                new Professor("Paula", "BI") //2
        };

        //criando cursos
        Curso[] cursos = {
                new Curso("TI"), //0
                new Curso("ADM") //1
        };

        //criando disciplinas
        Disciplina[] disciplinas = {
                new Disciplina("POO"), //0
                new Disciplina("Estrutura de dados"),  //1
                new Disciplina("BI") //2
        };

        //adicionando as disciplinas de TI (curso 0)
        cursos[0].adicionarDisciplina(disciplinas[0]);
        cursos[0].adicionarDisciplina(disciplinas[1]);

        //adicionando disciplina de ADM (curso 1)
        cursos[1].adicionarDisciplina(disciplinas[2]);

        //criando alunos
        Aluno[] alunos = {
                new Aluno("Alfredo", "TI"), //0
                new Aluno("Peterson", "ADM"), //1
                new Aluno("Wendel", "TI"), //2
                new Aluno("Ian", "ADM"), //3
                new Aluno("Debra", "TI"), //4
                new Aluno("Luana", "ADM"), //5
                new Aluno("Bruno", "TI"), //6
                new Aluno("Romeu", "ADM"), //7
                new Aluno("Julieta", "TI"), //8
                new Aluno("Maria", "ADM"), //9
                new Aluno("Capitú", "TI"), //10
                new Aluno("Bentinho", "ADM"), //11
                new Aluno("Amélia", "TI") //12
        };

        //criando turmas
        Turma[] turmas = {
                new Turma(professores[0], disciplinas[0]),
                new Turma(professores[1], disciplinas[1]),
                new Turma(professores[2], disciplinas[2])
        };

        //adicionando alunos
        for (int i = 0; i < alunos.length; i++) {
            if ((i % 2) == 0) //se o aluno for par, ele é de TI logo, esta matriculado nas materias de TI
            {
                turmas[0].adicionarAluno(alunos[i]);
                turmas[1].adicionarAluno(alunos[i]);
            } else { //se ele for impar, é adicionado na materia de ADM
                turmas[2].adicionarAluno(alunos[i]);
            }
        }


        //exibindo ensalamento:
        for (int i = 0; i< turmas.length; i++) {
            System.out.println("Turma:" + (i + 1));
            System.out.println("Disciplina:" + turmas[i].disciplina.nome);
            System.out.println("Professor:" + turmas[i].professor.getNome());
            System.out.println("Alunos:");
            for (Aluno aluno : turmas[i].alunos) {
                System.out.println(aluno.getNome());
            }
            System.out.println();
        }
    }
}
