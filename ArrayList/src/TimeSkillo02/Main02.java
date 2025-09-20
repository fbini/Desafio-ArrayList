

import java.util.ArrayList;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        ArrayList<String> listOfNames = new ArrayList<>();

        int userOption;

        //Loop menu
        do {
            System.out.println("""
                ==============  MENU  ===============
        
                         1 - Add name;
                         2 - Edit name;
                         3 - Remove name;
                         4 - Show the name list;
                         5 - Search something;
                         0 - Quit.
        
                =====================================
        """);
            userOption = reading.nextInt();
            reading.nextLine(); //Isso é para concertar o erro de leitura no próximo "reading.nextLine()"

            switch(userOption) {
                case 1:
                    System.out.println("You chose to add a name");
                    System.out.println("Which name do you  want to add to the list? ");
                    String userAdd = reading.nextLine();
                    listOfNames.add(userAdd);
                    System.out.println("'" + userAdd + "' has been added to the list. ✅");
                    break;
                case 2:
                    System.out.println("You chose to edit the list");
                    for (int i = 0; i < listOfNames.size(); i++) {
                        System.out.println("Index " + i + ": " + listOfNames.get(i) + ";");
                    }
                    if (listOfNames.isEmpty()) {
                        System.out.println("The List is Empty. 0️⃣\n");
                    } else {
                        System.out.println("Which name do you want to edit by the index? ");
                        int userEdit = reading.nextInt();
                        System.out.println("Which name do you want to add? ");
                        reading.nextLine(); //Isso é para concertar o erro de leitura no próximo "reading.nextLine()"
                        String userName = reading.nextLine();
                        listOfNames.set(userEdit, userName);
                        System.out.println("'" + userName + "' the list has been edited. ✅");
                    }
                    break;
                case 3:
                    System.out.println("You chose to remove a name");
                    for (int i = 0; i < listOfNames.size(); i++) {
                        System.out.println("Index " + i + ": " + listOfNames.get(i) + ";");
                    }
                    if (listOfNames.isEmpty()) {
                        System.out.println("The List is Empty. 0️⃣\n");
                    } else {
                        System.out.println("Which name do you want to remove by the index? ");
                        int userRemove = reading.nextInt();
                        listOfNames.remove(userRemove);
                        System.out.println("'" + userRemove + "' has been removed from the list. ✅");
                    }
                    break;
                case 4:
                    System.out.println("You chose to show the list");
                    if (listOfNames.isEmpty()) {
                        System.out.println("The List is Empty. 0️⃣\n");
                    } else {
                        for (int i = 0; i < listOfNames.size(); i++) {
                            System.out.println("Index " + i + ": " + listOfNames.get(i) + ";");
                        }
                    }
                    break;
                case 5:
                    System.out.println("You chose to search.");
                    if (listOfNames.isEmpty()) {
                        System.out.println("The List is Empty! \n");
                    } else {
                        System.out.println("Searching...");
                        String enterUser = reading.nextLine();
                        if (listOfNames.contains(enterUser)) {
                            System.out.println("The list contains " + enterUser);
                        } else {
                            System.out.println("We couldn't reach your search. ❌ Try again. \uD83D\uDD01");
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Okay! Quiting now! ✨");
                    break;
                default:
                    System.out.println("Invalid entry. Pls try again! \uD83D\uDC40");
                    break;
            }
        } while (userOption != 0);
    }
}