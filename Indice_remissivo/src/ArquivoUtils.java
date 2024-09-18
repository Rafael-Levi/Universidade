import java.io.*;
import java.util.*;

public class ArquivoUtils {

    public static List<String> lerArquivoTexto(String nomeArquivo) throws IOException {
        List<String> linhas = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        String linha;
        while ((linha = reader.readLine()) != null) {
            linhas.add(linha);
        }
        reader.close();
        return linhas;
    }

    public static void escreverIndiceEmArquivo(Map<String, LinkedList<Integer>> indiceRemissivo, String nomeArquivoSaida) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivoSaida));
        for (Map.Entry<String, LinkedList<Integer>> entry : indiceRemissivo.entrySet()) {
            String palavra = entry.getKey();
            LinkedList<Integer> ocorrencias = entry.getValue();
            writer.write(palavra + ": ");
            for (Integer linha : ocorrencias) {
                writer.write(linha + " ");
            }
            writer.newLine();
        }
        writer.close();
    }
}
