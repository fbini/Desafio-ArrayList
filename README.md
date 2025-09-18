
# 💻 Desafio: Lista de Nomes

## 🎯 Objetivo

Crie um programa em Java que permita ao usuário **adicionar**, **listar** e **remover nomes** de uma lista usando `ArrayList`.

---

## ✅ Requisitos

- Use `ArrayList<String>` para armazenar os nomes.
- O programa deve oferecer as seguintes opções:

1 - Adicionar nome
2 - Listar nomes
3 - Remover nome
0 - Sair

yaml
Copiar código

- O usuário digita a opção no console e o programa executa a ação correspondente.

---

## 🧠 Exemplo de uso

==== Menu ====
1 - Adicionar nome
2 - Listar nomes
3 - Remover nome
0 - Sair
Escolha uma opção: 1

Digite o nome: João
Nome adicionado!

Escolha uma opção: 2
Nomes na lista:
0 - João

Escolha uma opção: 3
Digite o índice do nome a remover: 0
Nome removido com sucesso!

Escolha uma opção: 2
A lista está vazia.

yaml
Copiar código

---

## 🧰 Dicas para Implementação

- Use a classe `Scanner` para capturar entrada do usuário.
- Valide se o índice informado é válido antes de remover um item.
- Use `ArrayList` para guardar os nomes:
