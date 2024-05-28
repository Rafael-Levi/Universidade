public class Visitante extends Pessoa {
    public Visitante(String cpf, String nome, int idade) {
        super(cpf, nome, idade);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Visitante:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
    }
}
