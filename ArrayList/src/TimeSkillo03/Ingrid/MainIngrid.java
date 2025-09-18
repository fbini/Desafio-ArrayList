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
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um nome: ");
                    String name = scanner.nextLine();
                    names.add(name);
                    System.out.println("Nome adicionada");
                    break;

                case 2:
                    System.out.println();
            }

        } while (opcao != 0);


    }
}
