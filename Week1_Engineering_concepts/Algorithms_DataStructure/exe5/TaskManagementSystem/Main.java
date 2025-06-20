public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(1, "Create UI", "Pending"));
        taskList.addTask(new Task(2, "Write backend", "In Progress"));
        taskList.addTask(new Task(3, "Test app", "Pending"));

        System.out.println("\n All Tasks:");
        taskList.displayAllTasks();

        System.out.println("\n Searching for Task ID 2:");
        Task result = taskList.searchTask(2);
        if (result != null) result.display();
        else System.out.println("Task not found.");

        System.out.println("\n Deleting Task ID 1:");
        taskList.deleteTask(1);

        System.out.println("\n Tasks After Deletion:");
        taskList.displayAllTasks();
    }
}
