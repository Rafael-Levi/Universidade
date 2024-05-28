public class Bolsista extends Aluno {
    private double desconto;

    public Bolsista(String cpf, String nome, int idade, String matricula, double desconto) {
        super(cpf, nome, idade, matricula);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade do bolsista " + getNome() + " paga com desconto de " + desconto + "%.");
    }
}
