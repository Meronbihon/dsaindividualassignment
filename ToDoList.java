
package assignment1;


public class ToDoList {
    private Node head;

    
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            Task currentTask = current.getTask();
            if (currentTask.getTitle().equals(title)) {
                currentTask.markCompleted();
                return; 
            }
            current = current.getNext();
        }
    }

    
    public void viewToDoList() {
        if (head == null) {
            System.out.println("ToDo list is empty.");
            return;
        }

        System.out.println("ToDo List:");
        Node current = head;
        int count = 1;
        while (current != null) {
            Task currentTask = current.getTask();
            System.out.println(count + ". Title: " + currentTask.getTitle() + ", Description: " +
                    currentTask.getDescription() + ", Completed: " + currentTask.isCompleted());
            current = current.getNext();
            count++;
        }
    }

    
}
