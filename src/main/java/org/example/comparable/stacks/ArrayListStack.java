package org.example.comparable.stacks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {


    // use this code for project 3
    private List<T> stack;

    public ArrayListStack(){
        this.stack = new ArrayList<T>();
    }

    @Override
    public boolean empty() {
        return this.stack.isEmpty();
    }

    @Override
    public T peek() {

        return this.stack.get(this.stack.size() - 1);
    }

    @Override
    public T pop() {
        return this.stack.remove(this.stack.size() - 1);
    }

    @Override
    public void push(T element) {
        this.stack.add(element);
    }

    @Override
    public int search(T item) {
        return this.stack.size() - this.stack.lastIndexOf(item);
    }
}
