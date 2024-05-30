
package assignment2;


public class LinkedList1 {
     Node head; 

    
    static class Node {
        int data;
        Node next;

        
        Node(int d) {
            data = d;
            next = null;
        }
    }

    
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);

        
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        Node previous = null;
        int currentPosition = 0;

        
        while (current != null && currentPosition < position) {
            previous = current;
            current = current.next;
            currentPosition++;
        }

        
        if (previous != null) {
            previous.next = newNode;
            newNode.next = current;
        } else {
           
            if (current == null) {
                previous.next = newNode;
            }
        }
    }

    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
