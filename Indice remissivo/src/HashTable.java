import java.util.*;

public class HashTable {
    private Map<Character, ListaEncadeada<Palavra>> tabela;

    public HashTable() {
        tabela = new HashMap<>();
    }

    public void inserir(String palavra, int linha) {
        char chave = palavra.charAt(0);
        chave = Character.toLowerCase(chave);

        tabela.putIfAbsent(chave, new ListaEncadeada<>());
        ListaEncadeada<Palavra> listaPalavras = tabela.get(chave);

        Palavra palavraExistente = listaPalavras.buscar(palavra);
        if (palavraExistente != null) {
            palavraExistente.adicionarOcorrencia(linha);
        } else {
            Palavra novaPalavra = new Palavra(palavra);
            novaPalavra.adicionarOcorrencia(linha);
            listaPalavras.adicionar(novaPalavra);
        }
    }

    public Palavra buscar(String palavra) {
        char chave = palavra.charAt(0);
        chave = Character.toLowerCase(chave);
    
        ListaEncadeada<Palavra> listaPalavras = tabela.get(chave);
        
        if (listaPalavras != null) {
            
            Palavra resultado = listaPalavras.buscar(palavra.toLowerCase());  // Comparar usando lowercase
            if (resultado != null) {
                return resultado;
            }
        }
        
        return null;
    }
}
