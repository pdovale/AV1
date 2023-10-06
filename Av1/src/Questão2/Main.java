package Questão2;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Pedrin pocoto", "pocoto@gmail.com", "santos o maior", 300, 30);


        System.out.println("Dados do Professor:\n" + professor.mostraProfessor());

        Aluno aluno = new Aluno("mirian peixoto", "marian@outlook.com", "apipi", 4, 2213);


        System.out.println("\nDados do Aluno:\n" + aluno.mostraAluno());
    }
}
