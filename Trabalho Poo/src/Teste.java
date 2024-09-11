public class Teste {
    public static void main(String[] args) {
        // Criando uma instância de Visitante
        Visitante visitante = new Visitante("12345678900", "Carlos Silva", 30);
        visitante.mostrarDetalhes();
        System.out.println("======================");

        // Criando uma instância de Aluno Regular
        Regular alunoRegular = new Regular("12345678901", "Ana Souza", 22, "20230002");
        alunoRegular.mostrarDetalhes();
        System.out.println("-----------------------");
        alunoRegular.pagarMensalidade();
        System.out.println("======================");

        // Criando uma instância de Bolsista
        Bolsista bolsista = new Bolsista("12345678902", "Maria Pereira", 24, "20230003", 50);
        bolsista.mostrarDetalhes();
        System.out.println("-----------------------");
        bolsista.pagarMensalidade();
        System.out.println("======================");

        // Criando uma instância de Professor
        Professor professor = new Professor("12345678903", "Dr. João Gomes", 45, "Centro de Ciências Exatas");
        professor.mostrarDetalhes();
        professor.darAula();
        System.out.println("======================");
        
        //Criando uma instância de Disciplina
        Disciplina disciplina = new Disciplina("INF101", "Programação I", 1);
        
        // Criando uma instância de Turma
        Turma turma = new Turma("T01", disciplina, professor);


         // Adicionando alunos à turma
         turma.adicionarAluno(alunoRegular);
         turma.adicionarAluno(bolsista);
 
         // Listando alunos da turma
         turma.listarAlunos();
         System.out.println("======================");

         // Removendo um aluno da turma
         turma.removerAluno(alunoRegular);
 
         // Listando alunos da turma após remoção
         turma.listarAlunos();
        
    }
}
