package TimeSkillo03.Ingrid;

import java.util.ArrayList;
import java.util.Scanner;

public class MainIngrid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        int opcao;
        do {
            System.out.println("""
                    ==== Menu ====
                    1 - Adicionar nome
                    2 - Listar nomes
                    3 - Remover nome
                    0 - Sair
                    """);

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            //limpa
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um nome: ");
                    String name = scanner.nextLine();
                    names.add(name);
                    System.out.println("Nome adicionado!");
                    break;

                case 2:
                    // isEmpty retorna True se a lista tiver vazia
                    if (names.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Nomes na lista:");
                        for (int i = 0; i < names.size(); i++) {
                            System.out.println(i + " - " + names.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice para remover: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // limpa
                    if (index >= 0 && index < names.size()) {
                        names.remove(index);
                        System.out.println("Removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
