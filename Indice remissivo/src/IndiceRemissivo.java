import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import java.util.TreeMap;

public class IndiceRemissivo {
    public static void main(String[] args) {
        try {
            // Leitura dos arquivos
            List<String> linhasTexto = ArquivoUtils.lerArquivoTexto("input/texto.txt");
            List<String> palavrasChave = ArquivoUtils.lerArquivoTexto("input/palavras_chave.txt");

            // Processamento
            HashTable hashTable = new HashTable();
            processarTexto(linhasTexto, hashTable);

            // Geração do índice remissivo
            Map<String, LinkedList<Integer>> indiceRemissivo = gerarIndiceRemissivo(palavrasChave, hashTable);

            // Escrita do índice em arquivo
            ArquivoUtils.escreverIndiceEmArquivo(indiceRemissivo, "output/indice_remissivo.txt");

            System.out.println("Índice remissivo gerado com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processarTexto(List<String> linhas, HashTable hashTable) {
        int numeroLinha = 1;
        for (String linha : linhas) {
            String[] palavras = linha.toLowerCase().split("\\s+");
            for (String palavra : palavras) {
                palavra = palavra.replaceAll("[^a-zA-Z]", "");  // Remove pontuação
                if (!palavra.isEmpty()) {
                    hashTable.inserir(palavra, numeroLinha);
                }
            }
            numeroLinha++;
        }
    }

    public static Map<String, LinkedList<Integer>> gerarIndiceRemissivo(List<String> palavrasChave, HashTable hashTable) {
        Map<String, LinkedList<Integer>> indiceRemissivo = new TreeMap<>();
        for (String palavraChave : palavrasChave) {
            palavraChave = palavraChave.replaceAll("[^a-zA-Z]", "");
            Palavra palavraEncontrada = hashTable.buscar(palavraChave);
            if (palavraEncontrada != null) {
                indiceRemissivo.put(palavraChave, (LinkedList<Integer>) palavraEncontrada.getOcorrencias().toList());
            }
        }
        return indiceRemissivo;
    }
}
