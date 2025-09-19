package TimeSkillo03.Jose;

import TimeSkillo03.Names;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJose {
    public static void main(String[] args) {
        ArrayList<Names> nameList = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Mostrar nomes");
            System.out.println("2 - Adicionar nome");
            System.out.println("3 - Remover nome");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            while (!teclado.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                teclado.next(); // descarta entrada inválida
            }
            opcao = teclado.nextInt();
            teclado.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n ==== Lista de nomes ===");
                    if (nameList.isEmpty()) {
                        System.out.println("A lista está vazia!");
                    } else {
                        for (Names names : nameList) {
                            System.out.println("- " + names.getName());
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Digite o nome para adicionar: ");
                    String newName = teclado.nextLine();
                    nameList.add(new Names(newName));
                    System.out.println("✅ Nome \"" + newName + "\" adicionado!");
                }
                case 3 -> {
                    System.out.print("Digite o nome para remover: ");
                    String removeName = teclado.nextLine();
                    boolean removed = false;

                    for (int i = 0; i < nameList.size(); i++) {
                        if (nameList.get(i).getName().equalsIgnoreCase(removeName)) {
                            nameList.remove(i);
                            removed = true;
                            System.out.println("❌ Nome \"" + removeName + "\" removido.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("⚠ Nome não encontrado na lista.");
                    }
                }
                case 4 -> System.out.println("Saindo... Até mais! 👋");
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        teclado.close();


    }
}
