package Questão2;

public class Professor extends Pessoa {
    private float salarioHora;
    private int horasAula;

    public Professor(String nome, String email, String senha, float salarioHora, int horasAula) {
        super(nome, email, senha);
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    public float calculaSalario() {
        return salarioHora * horasAula;
    }

    public String mostraProfessor() { return "Nome: " + getNome() +
            "\nEmail: " + getEmail() +
            "\nSalário: " + calculaSalario();
    }
}
