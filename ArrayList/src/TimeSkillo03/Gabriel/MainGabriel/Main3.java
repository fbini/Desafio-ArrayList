package Gabriel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Set<Integer> freeIds = new TreeSet<>();
        int nextId = 1;
        int option;
        do {
            System.out.println("""
                    1 - Add Name
                    2 - List names
                    3 - Remove name
                    0 - Finish
                    """);
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1 -> {
                    System.out.println("Type name: ");
                    String name = scan.nextLine();
                    int id;
                    if (!freeIds.isEmpty()) {
                        id = freeIds.iterator().next();
                        freeIds.remove(id);
                    } else {
                        id = nextId++;
                    }
                    nameList.add(new Name(id, name));
                    System.out.println("Added: (" + name + " ID" + id + ")");
                }
                case 2 -> {
                    if (nameList.isEmpty()) {
                        System.out.println("The list is Empty");
                    } else {
                        System.out.println("==== Names ====");
                        nameList.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    if (nameList.isEmpty()) {
                        System.out.println("Nothing to remove!");
                    } else {
                        System.out.println("Enter ID to remove: ");
                        int idRemove = scan.nextInt();
                        boolean removed = nameList.removeIf(n -> {
                            if(n.getId() == idRemove){
                                freeIds.add(idRemove);
                                return true;
                            }
                            return false;
                        });
                        if (removed){
                            System.out.println("Removed ID: " + idRemove);
                        } else {
                            System.out.println("ID not found");
                        }
                    }
                }
            }
        } while (option != 0) ;
        System.out.println("Finishing...");
    }
}
