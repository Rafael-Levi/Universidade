public class Teste {
    public static void main(String[] args) {
        // Criando uma instância de Visitante
        Visitante visitante = new Visitante("12345678900", "Carlos Silva", 30);
        visitante.mostrarDetalhes();

        // Criando uma instância de Aluno Regular
        Regular alunoRegular = new Regular("12345678901", "Ana Souza", 22, "20230002");
        alunoRegular.mostrarDetalhes();
        alunoRegular.pagarMensalidade();

        // Criando uma instância de Bolsista
        Bolsista bolsista = new Bolsista("12345678902", "Maria Pereira", 24, "20230003", 50);
        bolsista.mostrarDetalhes();
        bolsista.pagarMensalidade();

        // Criando uma instância de Professor
        Professor professor = new Professor("12345678903", "Dr. João Gomes", 45, "Centro de Ciências Exatas");
        professor.mostrarDetalhes();
        professor.darAula();
    }
}
