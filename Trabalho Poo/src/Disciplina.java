public class Disciplina {
    private String codigo;
    private String nome;
    private int semestre;

    // Construtor
    public Disciplina(String codigo, String nome, int semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // Método para mostrar detalhes da disciplina
    public void mostrarDetalhes() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Semestre: " + semestre);
    }
}
