package stack;

import java.util.EmptyStackException;

public class Stack {
    private int top;
    private final int maxSize;
    private final int[] stack;

    public Stack() {
        this.top = -1;
        this.maxSize = 5;
        this.stack = new int[this.maxSize];
    }

    public boolean stackIsEmpty() {
        return this.top == -1;
    }

    public boolean stackIsFull() {
        return this.top == this.maxSize - 1;
    }

    public void push(int newElement) {
        if(stackIsFull()){throw new StackOverflowError("Stack is full");}
        this.top = this.top + 1;
        stack[this.top] = newElement;
    }

    public int getSize() {
        return this.top + 1;
    }

    public int pop() {
        if(stackIsEmpty()) {throw new EmptyStackException();}
        int topElement = getSize() - 1;
        int element = stack[topElement];
        this.top = this.top - 1;
        return element;
    }

    public int peek() {
        if(stackIsEmpty()) {throw new EmptyStackException();}
        return stack[top];
    }

    public int search(int elementRequested) {
        if(stackIsEmpty()) {throw new EmptyStackException();}
        for(int element = 0; element < maxSize; element++) {
            if(elementRequested == stack[element]) {
                return stack[element];
            }
        }
        return -1;
    }
}
