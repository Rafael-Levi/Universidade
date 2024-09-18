import java.io.*;

public class Main {
    private static TabelaHash tabelaHash = new TabelaHash();

    public static void main(String[] args) {
        try {
            lerArquivoTexto("./input/texto.txt");

            gerarIndiceRemissivo("./input/palavrasChave.txt");

            gerarArquivoSaida("./output/indiceRemissivo.txt", "./input/palavrasChave.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerArquivoTexto(String caminhoArquivo) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;
        int numeroLinha = 1;

        while ((linha = leitor.readLine()) != null) {
            String[] palavras = linha.split("[^a-zA-Z0-9'-]+");  // Dividir por espaços e pontuação
            for (String palavra : palavras) {
                if (!palavra.isEmpty()) {
                    tabelaHash.adicionarPalavra(palavra.toLowerCase(), numeroLinha);
                }
            }
            numeroLinha++;
        }
        leitor.close();
    }

    private static void gerarIndiceRemissivo(String caminhoArquivoPalavrasChave) throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivoPalavrasChave));
        String linhaPalavraChave;

        while ((linhaPalavraChave = leitor.readLine()) != null) {
            String[] palavrasChave = linhaPalavraChave.split("[,\\s]+"); // Separar por vírgulas ou espaços
            for (String palavraChave : palavrasChave) {
                Palavra palavra = tabelaHash.buscarPalavra(palavraChave.toLowerCase());
                if (palavra != null) {
                    System.out.println(palavra);
                } else {
                    System.out.println(palavraChave + ": não encontrada");
                }
            }
        }
        leitor.close();
    }

    private static void gerarArquivoSaida(String caminhoArquivoSaida, String caminhoArquivoPalavrasChave) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivoSaida));
        BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivoPalavrasChave));
        String linhaPalavraChave;

        while ((linhaPalavraChave = leitor.readLine()) != null) {
            String[] palavrasChave = linhaPalavraChave.split("[,\\s]+");
            for (String palavraChave : palavrasChave) {
                Palavra palavra = tabelaHash.buscarPalavra(palavraChave.toLowerCase());
                if (palavra != null) {
                    escritor.write(palavra.toString());
                    escritor.newLine();
                } else {
                    escritor.write("Palavra " + palavraChave.toLowerCase() + " não foi encontrada.");
                    escritor.newLine();
                }
            }
        }
        escritor.close();
    }}
//OBS: Ao executar o programa em modo debug o output traz apenanas o indice de acordo com as palavras chaves
//     Ao executar pelo terminal diretamente o output traz o indice com todas as palavras 
//      Não descobri o porquê, mas se atentar ao executar em modo debug para o programa funcionar como esperado