package homeworks._02_07;

import summary._02_14.CustomStack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<T> {
    private LinkedList<T> data = new LinkedList<>();

    public void push(T element) {
        data.addFirst(element);
    }

    public T pop() {
        if (data.isEmpty())
            throw new NoSuchElementException();
        return data.pop();
    }

    public T peek() {
        if (data.isEmpty())
            throw new NoSuchElementException();
        return data.peek();
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public static void main(String[] args) {
        CustomStack<String> stringCustomStack = new CustomStack<>();
        stringCustomStack.push("Hello");
        stringCustomStack.push("Buy");
        stringCustomStack.push("Hi");
        System.out.println("stringCustomStack = " + stringCustomStack);

        System.out.println("stringCustomStack.pop() = " + stringCustomStack.pop());
        System.out.println("stringCustomStack = " + stringCustomStack);
        System.out.println("stringCustomStack.peek() = " + stringCustomStack.peek());
        System.out.println("stringCustomStack = " + stringCustomStack);

        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.push("Hello");
        stack.push("Buy");
        stack.push("Hi");
    }
}


