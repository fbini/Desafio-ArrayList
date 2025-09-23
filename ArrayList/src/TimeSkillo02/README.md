# Projeto: Gerenciador de Lista de Nomes em Java 🚀

Este é um aplicativo de console em Java que permite gerenciar uma lista de nomes de forma simples e interativa. Você pode adicionar, editar, remover e buscar nomes, além de salvar a lista em um arquivo e carregá-la novamente. É um ótimo exemplo de um programa básico que lida com a entrada do usuário e operações de leitura/escrita de arquivos.

---

### ✨ Funcionalidades

* **Adicionar Nome**: Permite incluir um novo nome na lista.
* **Editar Nome**: Atualiza um nome existente na lista, usando o índice dele.
* **Remover Nome**: Exclui um nome da lista, também usando seu índice.
* **Mostrar Lista**: Exibe todos os nomes salvos na lista.
* **Buscar**: Procura por um nome específico na lista.
* **Salvar & Carregar**: Persiste sua lista em um arquivo `data/data.txt`, garantindo que você não perca seus dados ao fechar o programa.

---

### 💻 Como Funciona

O programa roda em um loop contínuo, apresentando um menu com opções de 1 a 6 e a opção 0 para sair. Ele usa um **`Scanner`** para ler a entrada do usuário e um **`ArrayList<String>`** para armazenar os nomes.

* **Método `main`**: Contém o loop principal que exibe o menu, lê a escolha do usuário e usa uma estrutura `switch` para chamar a ação apropriada.
* **Método `saveFile`**: Este método estático recebe o `ArrayList` de nomes e escreve cada nome em uma nova linha no arquivo `data/data.txt`.
* **Método `loadFile`**: Este método estático lê os nomes do arquivo `data/data.txt` e os adiciona ao `ArrayList`, garantindo que a lista esteja sempre atualizada com os dados salvos.

O código inclui tratamento básico de erros para operações de arquivo e entrada inválida, além de mensagens claras para guiar o usuário e confirmar as ações.