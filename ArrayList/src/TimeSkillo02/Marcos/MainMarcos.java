import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMarcos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> peopleList = new ArrayList();

        int choice = -1;
        while (choice != 0) {

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
                    if (peopleList.size() == 0) {
                        System.out.println("Lista Vazia.\n");
                    } else {
                        for (String person : peopleList) {
                            System.out.println(person);
                        }
                    }
                }

                case 3 -> {

                }

                case 0 -> {
                    System.out.println("Tchau!!");
                }
                default -> System.out.println("Opção Inválida!\n");
            }
        }
    }
}