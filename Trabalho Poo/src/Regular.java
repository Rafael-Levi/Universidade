public class Regular extends Aluno {
    public Regular(String cpf, String nome, int idade, String matricula) {
        super(cpf, nome, idade, matricula);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade do aluno regular " + getNome() + " paga integralmente.");
    }
}
