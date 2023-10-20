package org.example.linkedlists;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E> {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        
    }

    @Override
    public void addFirst(E element) {

        Node newNode = new Node(element, head); //1 & 2

        if (head != null){
            head = newNode;
            tail = head;
        } else {
            head = newNode;
        }
        
    }

    @Override
    public void addLast(E element) {

        Node newNode = new Node(element, null);

        if (tail == null){
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
       
    }

    @Override
    public E pollFirst() {

        E element;
        if (head == null){
            element = null;
        } else{
            element = head.element;

            Node next = head.next;
            head.next = null;
            head = next;
        }
        
        return element;
    }

    @Override
    public E pollLast() {
            E element;
            if (tail == null){
                element = null;
            } else{
                element = tail.element;
                if (head == tail){
                    head = null;
                    tail = null;
                } else{
                    Node current = head;
                    Node previous = head;
                    while(current != null){
                        previous = current;
                        current = current.next;
                    }
                    tail = previous;
                    tail.next = null;
                }
            }
            
            return element;
    }

    @Override
    public E peekFirst() {
        return head.element;
    }

    @Override
    public E peekLast() {
        return tail.element;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public Object size() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while(current != null){
            joiner.add(current.element.toString());
            current = current.next;
        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();
    }

    private class Node {

        Node next;
        E element;

        public Node(E element, Node next) {
            this.next = next;
            this.element = element;
        }
    }
}
