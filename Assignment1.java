
package assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        
        
        Task task1 = new Task("Complete assignment", "Finish assignment by Friday");
        Task task2 = new Task("Study for exam", "Finish studying Data Structure");
        Task task3 = new Task("Call mom", "Wish her a happy birthday");

       
        ToDoList toDoList = new ToDoList();

        
        toDoList.addToDo(task1);
        toDoList.addToDo(task2);
        toDoList.addToDo(task3);

       
        toDoList.viewToDoList();

        
        toDoList.markToDoAsCompleted("Study for exam");

        
        toDoList.viewToDoList();
    }

}
