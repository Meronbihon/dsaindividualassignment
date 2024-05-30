
package assignment2;



public class Assignment2 {

    
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        
        list.insertAtPos(3,0);
        list.insertAtPos(5,1);
        list.insertAtPos(7,2);
        System.out.println("Original list: ");
        list.printList();
        
        
        list.insertAtPos(2, 0);
        list.insertAtPos(4, 2);
        list.insertAtPos(8, 10);
        
        System.out.println("Modified list: ");
        list.printList();
        
        
        LinkedList2 list2 = new LinkedList2();
        list2.append(2);
        list2.append(4);
        list2.append(6);
        list2.deleteAtPosition(3);
        list2.printList();
       
       
        Node2 node1 = new Node2(1);
        Node2 node2 = new Node2(2);
        Node2 node3 = new Node2(3);

        
        node1.next = node2;
        node2.next = node3;

        
        LinkedList3 list3 = new LinkedList3();
        list3.head = node1;
        list3.deleteAfterNode(node1); 
        list3.printList();
        
        
        LinkedList4 list4 = new LinkedList4();
        list4.append(1);
        list4.append(2);
        list4.append(3);
        list4.append(4);

        
        Node3 node = list4.searchNode(3);
        if (node != null) {
            System.out.println("Node found with value 3");
        } else {
            System.out.println("Node not found with value 3");
        }
    
        Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element of the stack: " + stack.peek());
        
        System.out.println("popped element: " + stack.pop());
        
        System.out.println("Top element of the stack after popping: " + stack.peek());
        stack.pop();
        stack.pop();
        
        System.out.println("popped element from an empty stack: " + stack.pop());
        
        
    }
    
}
