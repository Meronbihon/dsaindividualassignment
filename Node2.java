
package assignment2;


public class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList3 {
    Node2 head;
    
    public void append(int data) {
        Node2 newNode = new Node2(data);
        
        if(head == null) {
            head = newNode;
            return;
        }
        
        newNode.next = null;
        Node2 current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    void deleteAfterNode(Node2 prevNode) {
        // If previous node is null or it is the last node
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Cannot delete. Previous node is null or it is the last node.");
            return;
        }

        
        Node2 nodeToDelete = prevNode.next;

        
        prevNode.next = nodeToDelete.next;

        
        nodeToDelete.next = null;
    }
     public void printList() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
