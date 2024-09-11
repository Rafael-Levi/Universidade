public class Palavra {
    private String palavra;
    private ListaEncadeada<Integer> ocorrencias;

    public Palavra(String palavra) {
        this.palavra = palavra;
        this.ocorrencias = new ListaEncadeada<>();
    }

    public String getPalavra() {
        return palavra;
    }

    public ListaEncadeada<Integer> getOcorrencias() {
        return ocorrencias;
    }

    public void adicionarOcorrencia(int linha) {
        ocorrencias.adicionar(linha);
    }
}
