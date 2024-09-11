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
        
        // Mostrando detalhes do estudante antes de fazer aniversário
        System.out.println("Antes do aniversário:");
        estudante.mostrarDetalhes();

        // Incrementando a idade do estudante
        estudante.fazerAniversario();
        
        // Mostrando detalhes do estudante após fazer aniversário
        System.out.println("\nDepois do aniversário:");
        estudante.mostrarDetalhes();

        // Criando uma instância de Disciplina
        Disciplina disciplina = new Disciplina("INF101", "Programação I", 1);
        System.out.println("\nDetalhes da Disciplina:");
        disciplina.mostrarDetalhes();
    }
}
