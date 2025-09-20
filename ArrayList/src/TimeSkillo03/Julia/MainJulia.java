import java.util.ArrayList;
import java.util.Scanner;

public class MainJulia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> addName = new ArrayList<>();

        int options;

        do {
            System.out.println("____ Menu ____");
            System.out.println("1 - Adicionar nome á lista");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Remover nome");
            System.out.println("4 - Sair");

            options = scanner.nextInt();
            scanner.nextLine();

            switch (options){
                case 1:
                    System.out.println("Digite um nome pra adicionar á lista: ");
                    String name = scanner.nextLine();
                    addName.add(name);
                    System.out.println("Nome adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("____ Nomes adicionados ____");
                    if (addName.isEmpty()){
                        System.out.println("A lista está vazia ( Selecione a opção 1 para adicionar nomes á lista)");
                    }else {
                        System.out.println(addName);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome que deseja remover da lista: ");
                    String removeName = scanner.nextLine();
                    if (addName.remove(removeName)){
                        System.out.println("Nome removido com sucesso!");
                    }else {
                        System.out.println("O nome digitado não foi encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Saindo da lista...");
                    break;
            }
        }
        while (options != 4);
    }
}