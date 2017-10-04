package TodoList;

import java.util.PriorityQueue;
import java.util.Scanner;

public class TodoList {
    private PriorityQueue<Task> tasks;

    public TodoList() {
        this.tasks = new PriorityQueue<Task>();

    }

    public void add(String description, int priority) {
        this.tasks.offer(new Task(priority, description));
    }

    public void next() {
        System.out.println(this.tasks.poll());

    }

    public static void main(String[] args) {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("command");
        while (scanner.hasNext()) {
            if (scanner.next().equals("add")) {
                System.out.println("Priority: ");
                int prio = scanner.nextInt();
                System.out.println("Description: ");
                String description = scanner.next().trim();
                list.add(description, prio);
            } else if (scanner.next().equals("next")) {
                list.next();
            } else if (scanner.next().equals("quit")) {
                System.exit(0);
            }
        }
        scanner.close();
    }
}