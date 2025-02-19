package summary._02_14;

import java.util.Stack;

public class Main {
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

        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Buy");
        stack.push("Hi");
    }
}
