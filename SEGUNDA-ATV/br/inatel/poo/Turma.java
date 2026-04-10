package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos = 0;
    private Aluno[] alunos;

    public Turma(){
        alunos = new Aluno[50];
    }

    public void adicionarAluno(Aluno aluno){
        this.alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public void listarAlunos(){
        for(Aluno aluno: alunos){
            if(aluno != null)
                System.out.println(aluno.getNome());
        }
    }

    public Aluno buscarMelhorAluno(){
        if(alunos.length == 0){
            return null;
        }
        Aluno melhor = alunos[0];
        double melhorNota = 0;
        for(Aluno aluno: alunos){
            if(aluno != null)
                if(aluno.calculaMedia()>melhorNota){
                    melhorNota = aluno.calculaMedia();
                    melhor = aluno;
                }
        }
        return melhor;
    }
}
