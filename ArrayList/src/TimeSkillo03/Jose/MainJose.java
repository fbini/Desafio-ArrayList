package TimeSkillo03.Jose;

import TimeSkillo03.Names;

import java.util.ArrayList;
import java.util.Scanner;

public class MainJose {
    public static void main(String[] args) {
        ArrayList<Names> nameList = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println();


        //Adicionando nomes
        nameList.add(new Names("Ingrid B."));
        nameList.add(new Names("Gabriel K."));
        nameList.add(new Names("Julia S."));
        nameList.add(new Names("José V."));

        int opcao;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Mostrar nomes");
            System.out.println("2 - Adicionar nome");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n ==== Lista de nomes ===");
                    for (Names names : nameList) {
                        System.out.println("- " + names.getName());
                    }
                }
                case 2 -> {
                    System.out.println("Digite o nome para adicionar: ");
                    String newName = teclado.nextLine();
                    nameList.add(new Names(newName));
                    System.out.println("Nome adicionado!😁");
                }
                case 3 -> {
                    System.out.println("Digite para remover: ");
                    String removeName = teclado.nextLine();
                    boolean remove = false;

                    for (int i = 0; i < nameList.size(); i++) {
                        if (nameList.get(i).getName().equalsIgnoreCase(removeName)) {
                            nameList.remove(i);
                            remove = true;
                            System.out.println("Nome removido... 😔");
                        }
                    }

                    if (!remove) {
                        System.out.println("Nome não encontrado");
                    }

                }
                case 4 -> {
                    System.out.println("Saindo, até mais...");
                }
                default -> {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }

        } while (opcao != 4);


    }
}
