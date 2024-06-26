public abstract class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para incrementar a idade
    public void fazerAniversario() {
        this.idade++;
    }

    // Método abstrato (pode ser implementado pelas subclasses)
    public abstract void mostrarDetalhes();
}
