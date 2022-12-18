import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a command (add, remove, list, quit):");
            String command = input.nextLine();

            if (command.equals("add")) {
                System.out.println("Enter a task to add:");
                String task = input.nextLine();
                toDoList.add(task);
            } else if (command.equals("remove")) {
                System.out.println("Enter the index of the task to remove:");
                int index = input.nextInt();
                input.nextLine();
                toDoList.remove(index);
            } else if (command.equals("list")) {
                for (int i = 0; i < toDoList.size(); i++) {
                    System.out.println(i + ". " + toDoList.get(i));
                }
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }
    }
}