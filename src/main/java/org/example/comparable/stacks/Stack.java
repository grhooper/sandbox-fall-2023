package org.example.comparable.stacks;

public interface Stack<E> {

    boolean empty();
    E peek();
    E pop();
    void push(E element);
    int search(E item);
}
