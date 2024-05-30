/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author HP
 */

public class Stack {
    Node4 top;
    

    // Method to push an element onto the stack
    void push(int data) {
        Node4 newNode = new Node4(data);
        newNode.next = top;
        top = newNode;
    }
    
    // Method to pop an element from the stack
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }
    // Method to peek at the element on the top of the stack
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Method to check if the stack is empty
    boolean isEmpty() {
        return top == null;
    }
}
