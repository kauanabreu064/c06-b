package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(){
        notas = new double[10];
    }

    //definindo valores
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getters
    public String getNome() {
        return nome;
    }

    //metodos definidos no UML
    public double calculaMedia(){
        double somatorio = 0;
        int quantidade = 0;
        for(double nota: notas){
            somatorio += nota;
            quantidade++;
        }
        return(somatorio/quantidade);
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}
