import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMarcos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peopleList = new ArrayList();

        int choice;
        do {

            System.out.println("""
                    Menu De Escolhas:
                    1 - Adicionar Nome
                    2 - Listar Nomes
                    3 - Remover Nome
                    0 - Sair 
                    """);
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Digite um nome:");
                    String a = scanner.nextLine();
                    String name = scanner.nextLine();
                    peopleList.add(name);

                }
                case 2 -> {
                    System.out.println("\n Lista:");
                    if (peopleList.size() == 0) {
                        System.out.println("Lista Vazia.\n");
                    } else {
                        for (String person : peopleList) {
                            System.out.println(person);
                        }
                    }
                }

                case 3 -> {
                    if (peopleList.size() == 0) {
                        System.out.println("Lista Vazia! \n");
                    } else {
                        System.out.println("Digite o nome que quer retirar:");
                        System.out.println("\nLista:");
                        for (String person : peopleList) {
                            System.out.println(person);
                        }
                        String a = scanner.nextLine();
                        String removeName = scanner.nextLine();
                        peopleList.remove(removeName);
                    }
                }
                case 0 -> {
                    System.out.println("Tchau!!");
                }
                default -> System.out.println("Opção Inválida!\n");
            }
        } while (choice != 0);
    }
}