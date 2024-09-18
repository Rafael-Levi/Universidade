#Estrutura do projeto

```graphql
IndiceRemissivo/
│
├── src/
│   ├── IndiceRemissivo.java         # Classe principal que executa o programa
│   ├── Palavra.java                 # Classe que representa a palavra e suas ocorrências
│   ├── HashTable.java               # Implementação da tabela hash
│   ├── No.java                      # Classe para os nós da lista encadeada
│   ├── ListaEncadeada.java          # Implementação da lista encadeada personalizada
│   └── ArquivoUtils.java            # Funções utilitárias para leitura e escrita de arquivos
│
├── input/
│   ├── texto.txt                    # Arquivo de entrada com o texto
│   └── palavras_chave.txt           # Arquivo de entrada com as palavras-chave
│
└── output/
    └── indice_remissivo.txt          # Arquivo gerado com o índice remissivo
```

## Descrição dos Arquivos

### 1. **IndiceRemissivo.java**
Este arquivo contém a classe principal que coordena a execução do programa. Ele faz as seguintes tarefas:
- **Ler os arquivos de entrada** (`texto.txt` e `palavras_chave.txt`).
- **Processar o texto**, armazenando as palavras em uma tabela hash.
- **Gerar o índice remissivo**, que consiste nas palavras-chave e suas respectivas ocorrências no texto.
- **Escrever o índice remissivo em um arquivo de saída** (`indice_remissivo.txt`).

Funções principais:
- **processarTexto**: Processa o texto, dividindo as linhas em palavras, removendo a pontuação e inserindo as palavras na tabela hash.
- **gerarIndiceRemissivo**: Gera o índice remissivo buscando as palavras-chave na tabela hash e retornando suas ocorrências.

---

### 2. **Palavra.java**
Esta classe representa uma palavra e a lista de ocorrências onde ela aparece no texto. Cada palavra tem dois atributos:
- **`palavra`**: A palavra em si.
- **`ocorrencias`**: Uma lista encadeada que contém as linhas em que a palavra aparece.

Funções principais:
- **getPalavra**: Retorna a palavra.
- **getOcorrencias**: Retorna a lista de ocorrências da palavra.
- **adicionarOcorrencia**: Adiciona uma nova linha à lista de ocorrências da palavra.

---

### 3. **HashTable.java**
Implementa a tabela hash, que armazena as palavras do texto de acordo com sua primeira letra. Cada chave da tabela hash corresponde a uma letra, e o valor associado a essa chave é uma lista encadeada de objetos `Palavra`.

Funções principais:
- **inserir**: Insere uma palavra na tabela hash. Se a palavra já existir, apenas adiciona a linha; caso contrário, cria uma nova entrada.
- **buscar**: Busca uma palavra na tabela hash com base em sua chave (primeira letra) e retorna o objeto `Palavra` correspondente, se existir.

---

### 4. **No.java**
Classe que representa um nó da lista encadeada. Cada nó contém um valor e uma referência para o próximo nó na lista.

Funções principais:
- **getValor**: Retorna o valor armazenado no nó.
- **getProximo**: Retorna o próximo nó na lista.
- **setProximo**: Define o próximo nó na lista.

---

### 5. **ListaEncadeada.java**
Implementa uma lista encadeada genérica, que é utilizada para armazenar as ocorrências das palavras e também para armazenar as palavras em cada compartimento da tabela hash.

Funções principais:
- **adicionar**: Adiciona um novo valor ao final da lista.
- **buscar**: Busca um valor na lista e o retorna, se encontrado.
- **toList**: Converte a lista encadeada em uma lista do tipo `ArrayList`.

---

### 6. **ArquivoUtils.java**
Esta classe contém funções utilitárias para ler e escrever arquivos de texto.

Funções principais:
- **lerArquivoTexto**: Lê um arquivo de texto e retorna seu conteúdo como uma lista de strings, onde cada string corresponde a uma linha do arquivo.
- **escreverIndiceEmArquivo**: Escreve o índice remissivo gerado em um arquivo de saída.

---

## Como Executar o Projeto

1. **Compilar os arquivos Java**:
   ```bash
   javac src/*.java
