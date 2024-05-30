
package assignment2;


public class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node1 head;
    public LinkedList2() {
        this.head = null;
    }
   
    public void append(int data) {
        Node1 newNode = new Node1(data);
        
        if(head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = null;
        Node1 current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    void deleteAtPosition(int position) {
        // If linked list is empty
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        
        if (position == 1) {
            head = head.next;
            return;
        }

        
        Node1 current = head;
        Node1 prev = null;
        int count = 1;
        while (current != null && count != position) {
            prev = current;
            current = current.next;
            count++;
        }

        
        if (current == null) {
            System.out.println("Position exceeds the number of nodes in the linked list");
            return;
        }

        
        prev.next = current.next;
    }
     
    public void printList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
        

    
}
