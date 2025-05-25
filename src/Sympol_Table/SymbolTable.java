package Sympol_Table;

import java.util.Stack;

public abstract class SymbolTable<T> {
    protected Stack<T> stack;

    public void allocate() {
        stack = new Stack<>();
    }

    public void free() {
        if (stack != null) {
            stack.clear();
        }
    }

    public T get() {
        if (stack != null && !stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty or not allocated!");
            return null;
        }
    }

    public void printStack() {
        for (T item : stack) {
            System.out.println(item.toString());
        }
    }
}
