package src.TimeSkillo02.Gabriel;

import java.util.ArrayList;
import java.util.Scanner;
public class MainGabriel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listOfNames = new ArrayList<>();

        int choice = -1;
        while (choice != 0) {
            System.out.println("-------------");
            System.out.println("choice an option ");

            System.out.println("1 - add name ");
            System.out.println("2 - show list ");
            System.out.println("3 - remove name ");
            System.out.println("0 - exit ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("enter the name ");
                //criei uma variavel tipo String nomeada de item1 e ela será igual"=" á
                //Scanner.nextLine()... ou seja tudo q for digitado dentro de Scanner.nextLine
                //será guardado dentro de (item1)
                String item1 = scanner.nextLine();
                listOfNames.add(item1);


                System.out.println("return to menu? Press Enter ");
                scanner.nextLine();


            } else if (choice == 2) {
                System.out.println("LIST OF NAMES: " + " \n LIST SIZE: " + listOfNames.size() );
                //.isEmpty() serve para verificar se a coleção de dados está vazia.
                if (listOfNames.isEmpty()) {
                    System.out.println("the list is empty.");
                    scanner.nextLine();
                    System.out.println("return to menu? Press Enter ");
                    scanner.nextLine();
                } else {
                    for (String name : listOfNames) {
                        System.out.println(name);

                    }
                }
            }else if (choice == 3){

                System.out.println("REMOVE NAME: ");
                //crio uma variável tipo String chamada nameRemove
                //tudo que o usuário digitar no Scanner.nextLine() será guardado dentro dessa variável
                System.out.println("Enter the name to remove");
                String nameRemove = scanner.nextLine();
                //uso o metodo .remove() da listaDeNome
                // esse metodo vai procurar dentro da lista o nome que está guardado em (nameRemove)
                //se encontrar, ele remove esse nome da lista
                listOfNames.remove(nameRemove);
                System.out.println("this name has been removed" + listOfNames);
            }
        }
    }
}