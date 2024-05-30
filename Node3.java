
package assignment2;


public class Node3 {
    int data;
    Node3 next;

    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList4 {
    Node3 head;
    
     public void append(int data) {
        Node3 newNode = new Node3(data);
        
        if(head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = null;
        Node3 current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    
    Node3 searchNode(int value) {
        
        Node3 current = head;

        
        while (current != null) {
            
            if (current.data == value) {
                return current;
            }
            
            current = current.next;
        }

       
        return null;
    }
}
    

