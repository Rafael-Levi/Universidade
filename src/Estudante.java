public class Estudante extends Pessoa {
    private String matricula;

    public Estudante(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        // Criando uma instância de Estudante
        Estudante estudante = new Estudante("12345678900", "João Silva", 20, "20230001");
        estudante.mostrarDetalhes();

        // Criando uma instância de Disciplina
        Disciplina disciplina = new Disciplina("INF101", "Programação I", 1);
        disciplina.mostrarDetalhes();
    }
}

