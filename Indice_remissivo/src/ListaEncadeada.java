import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada<T> {
    private No<T> cabeca;
    private int tamanho;

    public ListaEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void adicionar(T valor) {
        No<T> novoNo = new No<>(valor);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No<T> atual = cabeca;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    public T buscar(String palavra) {
        No<T> atual = cabeca;
        
        while (atual != null) {
            // Aqui, vamos garantir que a comparação seja feita corretamente
            if (atual.getValor().toString().equalsIgnoreCase(palavra.toString())) {
                return atual.getValor();
            }
            atual = atual.getProximo();
        }
        return null;  // Se não for encontrado, retornar null
    }
    

    public List<T> toList() {
        List<T> lista = new ArrayList<>();
        No<T> atual = cabeca;
        while (atual != null) {
            lista.add(atual.getValor());
            atual = atual.getProximo();
        }
        return lista;
    }

    public int getTamanho() {
        return tamanho;
    }
}
