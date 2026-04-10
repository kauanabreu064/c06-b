package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args){
        Turma turma = new Turma();

        Aluno julia = new Aluno();
        julia.setNome("julia");
        julia.setMatricula("2165");
        julia.setNotas(new double[]{100.0,100.0,100.0,100.0});

        Aluno kauan = new Aluno();
        kauan.setNome("kauan");
        kauan.setMatricula("2167");
        kauan.setNotas(new double[]{90.0,90.0,90.0,90.0});

        Aluno sebastiao = new Aluno();
        sebastiao.setNome("sebastiao");
        sebastiao.setMatricula("2168");
        sebastiao.setNotas(new double[]{99.0,99.0,99.0,99.0});

        turma.adicionarAluno(julia);
        turma.adicionarAluno(kauan);
        turma.adicionarAluno(sebastiao);

        turma.listarAlunos();

        System.out.printf("O/A Melhor aluno/a foi " + turma.buscarMelhorAluno().getNome() + " com a media " + turma.buscarMelhorAluno().calculaMedia());
    }
}
