package Questão2;

public class Aluno extends Pessoa {
    private int periodo;
    private int turma;

    public Aluno(String nome, String email, String senha, int periodo, int turma) {
        super(nome, email, senha);
        this.periodo = periodo;
        this.turma = turma;
    }

    public String mostraAluno() {
        return "Nome: " + getNome() +
                "\nEmail: " + getEmail() +
                "\nPeríodo: " + periodo +
                "\nTurma: " + turma;
    }
}
